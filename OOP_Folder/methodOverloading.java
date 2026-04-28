package OOP_Folder;

public class methodOverloading {
    void greetings(String greet){

        System.out.println(greet);
    }

    void greetings(){
        System.out.println("You are most welcome .. ");
    }

    void operations(){

        System.out.println("This is sum operations : "+5+99);
    }

    void operations(float  a , float b){

        System.out.println("This is your mulitiplication : "+a*b);
    }
   
    void operations(double p , double q ){
        System.out.println("This you division : "+q/p);
    }

    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();

        obj.greetings("____Welcome to method Overloading___ ");
        obj.greetings();

        obj.operations(5.9f,34.5f);
        obj.operations();
        obj.operations(2345.23234d,2344123.324324132d);

    }
}
