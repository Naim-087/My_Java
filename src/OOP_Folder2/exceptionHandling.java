package OOP_Folder2;
public class exceptionHandling {

    public static void main(String[]args){
    try{
        int x = 10;
        int y = 0;

        System.out.println(x/y);
        System.out.println("Erro Resolve , code make a run");

    }catch(ArithmeticException e1){
        System.out.println("Exception "+e1);

    }
    finally{

        System.out.println("Last line of the program");
        
    }
        
    }
    
}
