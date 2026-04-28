package student1;

public class student {
    int id;
    String name;
    public student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("id :"+id);
    }
}
