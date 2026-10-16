public class Issue {
    private int id;
    private String title;
    private String description;
    private String priority;
    private String status;
    private User assigned_to;
    private Comment comment;

    public Issue(int issue_id, String issue_title, String issue_description, String issue_prority,
            String issue_status) {

        id = issue_id;
        title = issue_title;
        description = issue_description;
        priority = issue_prority;
        status = issue_status;
    }

    public int get_id() {
        return id;
    }

    public String get_title() {
        return title;
    }

    public String get_description() {
        return description;
    }

    public String get_priority() {
        return priority;
    }

    public String get_status() {
        return status;
    }

    public void set_status(String new_status) {
        if (new_status.equals("OPEN") || new_status.equals("IN PROGRESS") || new_status.equals("DONE")) {
            status = new_status;
        } else {
            System.out.println("Invalid Status : " + new_status);
        }
    }

    public void assignTo(User user) {
        assigned_to = user;
    }

    public void addComment(Comment newComment) {
        comment = newComment;
    }

    public void print_details() {
        System.out.println("Issue #" + id + ": " + title);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status + "\n");

        if (assigned_to != null) {
            System.out.println("Assigned to: " + assigned_to.get_name());
        }
        if (comment != null) {
            System.out.println("Comment by " + comment.get_author().get_name() + ": " + comment.get_text() + "\n\n");
        }
    }
}
