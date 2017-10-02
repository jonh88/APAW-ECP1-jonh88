package es.miw.upm.composite;

import java.util.ArrayList;
import java.util.List;

public class IndirectIssueComposite extends IndirectIssueComponent {
	
	private List<IndirectIssueComponent> hijos;
	private int numChildren;
	
	public IndirectIssueComposite() {
		this.hijos = new ArrayList<IndirectIssueComponent>();
		this.numChildren = 0;
	}

	@Override
	public void closeIssue() {
		for (IndirectIssueComponent hijo : hijos) {
			hijo.closeIssue();
		}
	}
	
	public void add(IndirectIssueComponent hijo) {
		assert hijo != null;
		this.hijos.add(hijo);
		this.numChildren++;
	}
	
	public void delete(IndirectIssueComponent hijo) {
		assert hijo != null;
		assert this.hijos.size()>0;
		this.hijos.remove(hijo);
		this.numChildren--;
	}
	
	public IndirectIssueComponent getChild(int position) {
		assert position >=0;
		return this.hijos.get(position);
	}
	
	public int getNumChildren() {
		return this.numChildren;
	}

}
