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

/* abstract class Ticket and implements BookTicket specific To book tickets
and flight information or the passenger if we need, we will not be called 
method GetSeatPrice from  interface BookTicket Because we don't need to implements body of this method 
so we created 3 subclass from bstract class Ticket And there will be work implements body GetSeatPrice 
Ticket clone : 
The ticket inside the flight, we will give the passenger one of them, and the passenger will change the ticket
, so it will affect them. It is supposed to take a separate copy of it (create a new thing of the same type,
but it will be different for the passenger)
*/

public abstract class Ticket implements BookTicket{
  //    Random ticket number for each flight
    public int NumID;
//   object from calss Flight for Details Flight
    public Flight DetailsFlight;
    //   object from calss Passenger for Passeng Details if we need
    public Passenger PassengDetails;
//     It will not be booked into our system because it will come at the time of boarding
//    (we only show you the seats you can see at that time so you know about them)in main 
    public static final int Row = 4;
    public static final int Col = 5;
    public char[][] SeatNumber = new char[Row][Col];

    
public Ticket(){
}
    public Ticket( int NumID,Flight DetailsFlight, Passenger PassengDetails) {
        this.NumID = (int)(Math.random()*(101));
        this.DetailsFlight = DetailsFlight;
        this.PassengDetails = PassengDetails;
    }
  public abstract Ticket clone (Ticket id ,Flight F);
@Override
    public String toString() {
        return " NumID= "+NumID;
    }

    
}

