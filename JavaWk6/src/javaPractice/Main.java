
package javaPractice;

public class Main {
    
    enum Level {
           
       FEE,
       AGREE,
       REJECT
           
       }
    
    public static void main(String[] args) {
       
        ClientAd makeAd = new ClientAd("Kuuku", 37);
        ClientAd makeAd1;
        
         makeAd1= makeAd;
        
        makeAd1.chaneDetails("Eloh", 30);
        
        System.out.println(makeAd);
        
        
       
        ClassA kuu = new ClassA();
        kuu.fullThrottle();
        kuu.speed(96);
        
        ClassB john = new ClassB("GhanaApp", 234506612, 5,
        "kuuku","I want 3 pages of boobs", "image", 12);
     System.out.println(john.adDetail +  john.adSize);
     
  
       
       //POLYMORPHIC ARRAY
       //ClassC and E extend/inherit from ClassD
       //ClassD can create an object and loop through their variables
      
       ClassD kuuku[] = new ClassD[2];
       kuuku[0] = new ClassC();
       kuuku[1] = new ClassE();
       
       for(int x =0; x <2; x++) {
           kuuku[x].honk();
       }
       
       ClassC car = new ClassC();
       car.honk();
       System.out.println(car.brand + " " + car.names + " " + car.refNo); 
       
       Level myVar = Level.AGREE;
       
       
  }
}

/*

String id, int payment, int size, String ref,
  
  String detail, String ad, double adMulti) {
    


*/