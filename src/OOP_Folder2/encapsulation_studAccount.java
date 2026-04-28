package OOP_Folder2;

public class encapsulation_studAccount {
    private String name;
    private int  studid;
    private float balance;


    

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setStudid(int studid){
        if(studid>=1){ 
          this.studid=studid;
        }
        else
        {
            System.out.println("Error Id");
        }
        
    }

    public int getStudid(){
        return studid;
    }

    public void setBalance(float balance){
        if(balance>=0){
             this.balance=balance;
        }
        else{
            System.out.println("Error balance");
        }
    }

    public float getBalance(){
         return balance;
    }

    void deposit(float amount){
        if(amount>=0){
            balance+=amount;
        }
    }

    void withdraw(float amount){
        if(balance>amount){
            balance-= amount;
        }
    }

    public static void main(String[] args) {

    encapsulation_studAccount acc = new encapsulation_studAccount();
    acc.setName("Naimul Islam");
    acc.setBalance(7000);
    acc.setStudid(101);

    acc.deposit(2000.0f);
    acc.withdraw(4000.0f);


    System.out.println("Student Name : "+acc.getName());
    System.out.println("Student Id : "+acc.getStudid());
    System.out.println("Balance : "+acc.getBalance());
    

        
    }

}
