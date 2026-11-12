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


    public void print_all_issues() {
        if (issues.size() == 0) {
            System.out.println("No issues found.");
        }
        for (int i = 0; i < issues.size(); i++) {
            issues.get(i).print_details();
        }
    }


    public Issue find_issue(int id) {
        for (int i = 0; i < issues.size(); i++) {
            if (issues.get(i).get_id() == id) {
                return issues.get(i);
            }
        }
        return null;
    }
}
