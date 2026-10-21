public class Main {
    public static void main(String[] args) {
        User ali = new User(1, "Ali");
        User ahmed = new User(2, "Ahmed");

        Issue_tracker tracker = new Issue_tracker();

        Issue first = tracker.add_issue("Wrong Variable Declaration",
                "On line 270 variable name return is wrongly declared since it's reserved for the language itself",
                "HIGH");
        Issue second = tracker.add_issue("No Efficient Coding",
                "There are multiple loops which can be avoided to make program look more cleaner and efficient",
                "LOW");
        second.set_status("IN PROGRESS");

        first.assignTo(ali);
        first.addComment(new Comment(ali, "Looking into it"));
        second.assignTo(ahmed);

        first.print_details();
        second.print_details();

        System.out.println("\n\nTotal Users : ");
        ali.print_details();
        ahmed.print_details();

    }

}
