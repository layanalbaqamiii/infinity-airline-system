/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinty;

/**
 *
 * @author USER
 */
/*this class is subclass from Ticket and Each ticket will have its own category and each category has a different price for each flight so in this class 
we Override method GetSeatPrice and clone also to string 
*/

public class BusinessTicket extends Ticket{
    
public String SeatType;
 public double Price;
    public BusinessTicket() {
          
    }
    
    public BusinessTicket(String SeatType,double Price ){
    this.SeatType="Business";
    this.Price=Price;
    }
   
    public BusinessTicket(int NumID, Flight DetailsFlight, Passenger PassengDetails) {
        super( NumID,DetailsFlight, PassengDetails);
    }

    BusinessTicket(String business, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override // implements BookTicket 
       public double GetSeatPrice(){

         return Price ;
       }
@Override
public  Ticket clone (Ticket id ,Flight F){
 Ticket t= new BusinessTicket(SeatType , Price);
  t.DetailsFlight=F;
 t.NumID=(int)(Math.random()*(101));
 return t;
 }
    @Override
    public String toString() {
        return  "SeatType is : " + SeatType +","+" Price ="+Price+"Rial"+"\n*Power-Wi-Fi&USB  *On-Demand TV  *Prayer Area *fresh meals \n Baggage Info: 1 Piece + 7 Kilos (Per Person)" ;
    }
    

}
