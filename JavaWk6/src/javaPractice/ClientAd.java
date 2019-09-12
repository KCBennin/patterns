
package javaPractice;

public class ClientAd {
    
    private String name;
    private int age;
    
    public ClientAd(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    
    
    public String toString() {
        
        return "name: "+ name+ ", age: " + age;
    }
    
    public void chaneDetails(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    
    
    public void orderAd() {
        
    }
    
}
