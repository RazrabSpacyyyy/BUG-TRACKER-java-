import java.util.ArrayList;

public class Issue_tracker {

    private ArrayList<Issue> issues;
    private int next_id;

    public Issue_tracker() {
        issues = new ArrayList<Issue>();
        next_id = 1;
    }

    public Issue add_issue(String title, String description, String priority) {
    Issue issue = new Issue(next_id, title, description, priority, "OPEN");
    issues.add(issue);
    next_id++;
    return issue;
}

    public int get_no_of_issues() {
        return issues.size();
    }
}

