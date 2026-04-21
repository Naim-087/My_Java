package java_folder;

abstract class Mobile_user {

    abstract void sendmsg(); // abstract method

    
}

class ibrahim extends Mobile_user{

    @Override // abstract method
    void sendmsg(){
        System.out.println("Hi i am Ibrahim ");
    }
}

class Ismail extends Mobile_user{
    @Override // abstract method
    void sendmsg(){
        System.out.println("Hi i am Ismail ");
    }
}

public  class abstraction1 {

   public static void main(String[] args) {
    ibrahim ib = new ibrahim();
    Ismail is = new Ismail ();

    ib.sendmsg();
    is.sendmsg();
   }

    
}
