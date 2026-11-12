public class Main {
    public static void main(String[] args) {
        User ali = new User(1, "Ali");
        User ahmed = new User(2, "Ahmed");

        Issue_tracker tracker = new Issue_tracker();

        Issue first = tracker.add_issue("Wrong Variable Declaration",
                "On line 270 variable name is wrongly declared since the specific word is reserved for the language itself.",
                "HIGH");
        Issue second = tracker.add_issue("No Efficient Coding",
                "There are multiple loops which can be avoided to make the program looks more cleaner and efficient.",
                "LOW");
        second.set_status("IN PROGRESS");
        second.set_status("CLOSED");

        first.assignTo(ali);
        first.addComment(new Comment(ali, "Looking into it"));
        second.assignTo(ahmed);

        System.out.println("Total Issues : " + tracker.get_no_of_issues() + "\n");

        System.out.println("\t\tAll Issues");
        tracker.print_all_issues();

        System.out.println("\n\t\tSearch Issue #2");
        Issue found = tracker.find_issue(2);
        if (found != null) {
            found.print_details();
        }

        System.out.println("\n\t\tSearch Issue #99");
        if (tracker.find_issue(99) == null) {
            System.out.println("Issue not found.\n");
        }

        System.out.println("\t\tTotal Users");
        ali.print_details();
        ahmed.print_details();
    }
}
