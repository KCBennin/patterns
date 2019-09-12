
package javaPractice;

public class ClassB {
    
    String orderID;
    Integer paymentDetails;
    Integer adSize;
    String clientRef;
    String adDetail;
    String advert; //image
    double adMultiple;

  public ClassB(String id, int payment, int size, String ref,
  
                    String detail, String ad, double multi) {
      
      this.orderID = id;
      this.paymentDetails = payment;
      this.adSize = size;
      this.clientRef = ref;
      this.adDetail = detail;
      this.advert = ad;
      this.adMultiple = multi;
    
  }
   
}
