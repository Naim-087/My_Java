package OOP_Folder2;

 public class constructor_default2 {

  static class student{
   String name;
   int yr;
   String uniname;

    student(){

    name = " Naim Islam";
    yr=3;
    uniname = "DIU";
   }
}
    public static void main(String[] args){
    student std = new student();

  System.out.println(std.name+ " " + std.uniname);


    }
}
