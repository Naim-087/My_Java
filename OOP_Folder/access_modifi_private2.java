package OOP_Folder;

 class access_modifi
{

    private int x=20;
    public int getx(){
        return x;
    }

}

public class access_modifi_private2 {
    public static void main(String[] args) {
        access_modifi obj = new access_modifi();

        System.out.println(obj.getx());
        
    }
}
