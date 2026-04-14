package OOP_Folder;

 class Myclass{ //outside of public class --> for academic we will initilize
  // in main public class for the following constructor file
    int x;
    Myclass(){
        x=5;
    }
 }

public class constructor_default {
    public static void main(String[] args) {
        Myclass val = new Myclass();
        System.out.println(val.x);
    }
}
