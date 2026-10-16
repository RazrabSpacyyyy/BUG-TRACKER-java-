public class User {

    private int id;
    private String name;

    public 
    User(int id , String name){
        this.id= id ;
        this.name= name;
    }
    
    int get_id(){return id;}
    String get_name(){return name;}

    void print_details(){
        System.out.println("User #" + id + ": " + name);
    }
}
