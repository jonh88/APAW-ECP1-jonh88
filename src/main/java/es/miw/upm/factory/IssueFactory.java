package es.miw.upm.factory;

import java.util.HashMap;
import java.util.Map;
import es.miw.upm.modelo.Issue;

public class IssueFactory {

	private static IssueFactory issueFactory;

	private Map<Long, Issue> mapa;

	private IssueFactory() {
		this.mapa = new HashMap<Long, Issue>();
	}

	public Issue get(long id) {

		if (this.mapa.containsKey(id)) {
			return this.mapa.get(id);
		}
		return null;

	}

	public static IssueFactory getInstance() {
		
		if (IssueFactory.issueFactory == null) {
			IssueFactory.issueFactory = new IssueFactory();
		}
		return IssueFactory.issueFactory;

	}
	
	public void insertIssue(Issue newIssue) {
		this.mapa.put(newIssue.getId(), newIssue);
	}

}
