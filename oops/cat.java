package oops;

public class cat {
    String name,breed,color;
    public cat(){
        this.name="billi";
        this.breed="orange";
        this.color="black";
    }
    public cat(String name,String breed,String color){
        this.name=name;
        this.breed=breed;
        this.color=color;
    }
    void call(){
        System.out.println("go  with the wind "+name);
    }
}