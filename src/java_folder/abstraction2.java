package java_folder;

abstract class person{
    String name;

    person(String name){
        this.name = name;
    }

    public abstract void perform_duty();

    public void show_name(){

        System.out.println("Print : "+name);
    }
}

class teacher extends person{
 
    String dept;

    teacher(String name , String dept){

        super(name);
        this.dept = dept;
    }
    public void perform_duty(){
        System.out.println("Teacher teaches students ");
    }
     
}

class engineer extends person{
    String dept;

    engineer(String name,String dept){
        super(name);
        this.dept = dept;
    }
    public void perform_duty(){
        System.out.println("Engineer do engineering");
    }


}

public class abstraction2 {

    public static void main(String[] args) {
        teacher t = new teacher("Ali Amham", "SWE");
        engineer e = new engineer("Bakhtiar Uddin", "R & D");

       t.show_name();
       t.perform_duty();

       e.show_name();;
       e.perform_duty();
    }
    
}
