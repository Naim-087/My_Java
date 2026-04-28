package OOP_Folder2;

public class constructor_parameterized {
     String name;
     String model;
     int price;
     int ssd;
     String ram_name;
     int warranty;
     String Brand;

     constructor_parameterized(String name,String model,int price,int ssd,String ram_name,int warranty,String Brand){

        this.name=name;
        this.model=model;
        this.price=price;
        this.ssd=ssd;
        this.ram_name=ram_name;
        this.warranty=warranty;
        this.Brand=Brand;

     }

     void lapot_info(){
        System.out.println("name : "+name+"\nmodel : "+model+"\nprice : "+price+"\nssd : "+ssd+"\nram_name : "+ram_name+"\nwarranty : "+warranty+"\nBrand : "+Brand+"\n\n");
     }

     public static void main(String[] args) {
        constructor_parameterized laptop = new constructor_parameterized("ASUS","VivobookM15",74000,512,"AMD Ryzen",2,"ASUS");
        constructor_parameterized hp = new constructor_parameterized("HP Pavilion","15-eh3047AU",78000,512,"AMD Ryzen 5 5500U",2,"HP");
        constructor_parameterized macpro = new constructor_parameterized("MacBook Pro","M3 Pro 14-inch",260000,1024,"Apple M3 Pro Chip",1,"Apple");
        
        laptop.lapot_info();
        hp.lapot_info();
        macpro.lapot_info();



     }
}
