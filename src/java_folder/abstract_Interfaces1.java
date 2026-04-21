package java_folder;

abstract class person {
    String name;

    person(String name){
        this.name = name;
    }

    abstract void perform_duty();

    public void show_name(){
        System.out.println("Name : "+name);
    }

}
 interface evaluated {

    void evaluated();
}

class teachers extends person implements evaluated{
    
    teachers (String name){
     super(name);
    }
   
    @Override
    void perform_duty() {
        System.out.println("Teacher teaches Students");
    }

    public void evaluated(){

        System.out.println("Teacher Evaluates Students");
    }
}

class staff extends person{
    staff(String name){
        super(name);
    }

    public void perform_duty(){

        System.out.println("Staff manages administrative tasks.");
    }
}

public class abstract_Interfaces1 {
   
public static void main(String[] args) {
    teachers  t = new teachers("Naimul Islam");
    staff s = new staff("Junayed");

    t.perform_duty();
    t.show_name();
    t.evaluated();

    s.show_name();
    s.perform_duty();
}
    
}
