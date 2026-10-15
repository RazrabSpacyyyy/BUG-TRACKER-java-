class Issue {
    private int id;
    private String title;
    private String description;
    private String priority;
    private String status;

    public 
    Issue(int issue_id , String issue_title , String issue_description , String issue_prority ,String issue_status ){

        id = issue_id;
        title = issue_title;
        description = issue_description;
        priority = issue_prority;
        status = issue_status;
    }

    int get_id(){return id;}
    String get_title(){return title;}
    String get_description(){return description;}
    String get_priority(){return priority;}
    String get_status(){return status;}

    void set_status(String new_status){
        if(new_status.equals("OPEN") || new_status.equals("IN PROGRESS") || new_status.equals("DONE") ){
            status = new_status;
        }
        else{
            System.out.println("Invalid Status : " + new_status);
        }
    }

    void print_details(){
        System.out.println("Issue #" + id + ": " + title);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status + "\n");
    }
}
