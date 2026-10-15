public class Main {
    public static void main(String[] args){
        Issue first = new Issue(1, "Wrong Variable Declaration", "On line 270 variable name return is wrongly declared since it's reserved for the language itself " , "HIGH", "OPEN");
        Issue second = new Issue(2, "No Efficient Coding", "There are multiple loops which can be avoided to make program look more cleaner and efficient" , "LOW", "IN PROGRESS");

        first.print_details();
        second.print_details();

    }
    
}
