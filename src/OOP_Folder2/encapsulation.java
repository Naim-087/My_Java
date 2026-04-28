package OOP_Folder2;

public class encapsulation {

    private String name,dept;
    private int age,sem;
    private float cgpa;
   
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
    public void setAge(int age){
        this.age=age;
    }
   
    public int getAge(){
        return age;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }

    public float  getCGPA(){
        return cgpa;
    }

    public void setSem(int sem){
        this.sem= sem;
    }

    public int getSem(){
        return sem;
    }

   

    public static void main(String[] args) {
        encapsulation std = new encapsulation();
        std.name="ABCD";
        std.age=22;
        std.dept="SWE";
        std.cgpa=3.88f;
        std.sem=5;
      
        
    System.out.println("Name : "+std.name+"\nAge : "+std.age+"\nDept : "+std.dept+"\nCgpa : "+std.cgpa+"\nSemester : "+std.sem+"\n");

    }

    
}
