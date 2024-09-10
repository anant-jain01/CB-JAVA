package oops;

public class batch{
    String name;
    // Date date_sart;
    // Date date_end;
    String topic;
    int cost;
    // constructor
    // default constructor
    public batch(){
        // add values to class variables
        this.name="default";
        this.cost=5000;
        this.topic="oops";
    }
    // custom constructor
    public batch(String name,
                int cost,
                String topic){
        this.name=name;
        this.cost=cost;
        this.topic+=topic;
    }
}
