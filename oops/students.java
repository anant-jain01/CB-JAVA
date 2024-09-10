package oops;

public class students {
    // VERBS IS A METHOD
    // NOUNS ARE CLASS
    // ADJECTIVES ARE CLASS MEMBERS
    int roll;
    String name;
    batch enrolled_batch;
    public students(){
        this.roll=400;
        this.name="default";
        this.enrolled_batch=new batch();
    }
    public students(int roll,
                    String name,
                    String batch_name,
                    int batch_cost,
                    String batch_topic){
                        this.roll=roll;
                        this.name=name;
                        
                        
                        enrolled_batch=new batch(
                            batch_name,
                            batch_cost,
                            batch_topic
                        );
                        // this.enrolled_batch.name=batch_name
}
void study(){
    System.out.println(this.name+"is studying");
}
}
