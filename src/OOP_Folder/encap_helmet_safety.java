package OOP_Folder;

public class encap_helmet_safety {
    private int sizecm;
    private boolean straplocked;
    private int licens;

    encap_helmet_safety(int sizecm,boolean straplocked,int licens){ 

        if(sizecm >= 50 && sizecm <=65){
            this.sizecm = sizecm;
        }
        else{
            System.out.println("Invalid size ");
        }

        this.straplocked = straplocked;
        this.licens = licens;
    }

    public int getsiz(){
        return sizecm;
    }
    public boolean getStrap(){
        return straplocked;
    }
    public int getlicense(){
        return licens;
    }

    public boolean is_safe_toRide(){

        if(sizecm >=55 && sizecm <= 65 && licens == 1 ){
            return true;
        }
        else {
            return false;
        }
    }
  
    public void display(){

        if (is_safe_toRide()){
        System.out.println("Safe to ride ");
       }
       else{
        System.out.println("Not Safe to Ride ");
       }
    }
    

    public static void main(String[] args){

        encap_helmet_safety ride1 = new encap_helmet_safety(57, true, 1);
        
        encap_helmet_safety ride2 = new encap_helmet_safety(54, true, 1);
        
        encap_helmet_safety ride3 = new encap_helmet_safety(565, true, 0);

        ride1.display();
        ride2.display();
        ride3.display();
    }



    
}
