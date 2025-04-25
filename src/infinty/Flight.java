/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinty;

/**
 *
 * @author Lenovo
 */
public class Flight {
        //in class Flight we give it in the main (we create an object(or array) from the flight class of the flight class that assigns values to all these attribute )
    //instance varible
//FlightID :attribute of the flight number

    private int FlightID;
// Departure:The place of the flight(the flight will go from where? From which city?)
    private String Departure;
//    DepartureTime:Flight departure time (Example: 04:05 PM)
    private String DepartureTime;
//    DepartureData:Flight departure date (Example: 1-1-1444)
    private String DepartureData;
//    Arrival:The destination of the flight (Where will you go? To a city?)
    private String Arrival;
//     ArrivalTime:Flight Arrival time (Example: 06:10 PM)
    private String ArrivalTime;
//    ArrivalData:Flight Arrival date (Example: 1-1-1444)
    private String ArrivalData;
//     Polymorphism  object - array of object( sub class EconomicTicket and BusinessTicket and FirstClassTicket)
    public Ticket[] tickets = new Ticket[3];
    // variable  in loop addTicket
    int num =0;
// default constructor 
 public Flight() {

    }
 
//    constructor
    public Flight(int FlightID, String Departure, String DepartureTime, String DepartureData, String Arrival, String ArrivalTime, String ArrivalData) {
        this.FlightID = FlightID;
        this.Departure = Departure;
        this.DepartureTime = DepartureTime;
        this.DepartureData = DepartureData;
        this.Arrival = Arrival;
        this.ArrivalTime = ArrivalTime;
        this.ArrivalData = ArrivalData;
    }
//  return FlightID;

    public int getFlightID() {
        return FlightID;
    }
// setFlightID 
    public void setFlightID(int FlightID) {
        this.FlightID = FlightID;
    }
//getDeparture
    public String getDeparture() {
        return Departure;
    }
//setDeparture
    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }
//        return DepartureTime;
    public String getDepartureTime() {
        return DepartureTime;
    }
//setDepartureTime
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
//        return DepartureData;
    public String getDepartureData() {
        return DepartureData;
    }
//setDepartureData
    public void setDepartureData(String DepartureData) {
        this.DepartureData = DepartureData;
    }
// return Arrival;

    public String getArrival() {
        return Arrival;
    }
//setArrival
    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }
//return ArrivalTime;

    public String getArrivalTime() {
        return ArrivalTime;
    }
//setArrivalTime
    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
// return ArrivalData;

    public String getArrivalData() {
        return ArrivalData;
    }
//setArrivalData
    public void setArrivalData(String ArrivalData) {
        this.ArrivalData = ArrivalData;
    }

//  return num;

    public int getNum() {
        return num;
    }
//setNum
    public void setNum(int num) {
        this.num = num;
    }
/*above in Ticket[] tickets = new Ticket[3]; Originally we have 3 subclass EconomicTicket and BusinessTicket and FirstClassTicket
    So on every Flight we will add them
*/
    public void addTicket(Ticket t) {
        if (num < 3) {
            tickets[num++] = t;
        }
    }
// getTicket that was taken
    public Ticket getTicket(int i) {
        return tickets[i];
    }

//Show tickets available for each flight
    public void displayticket() {
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+"-"+tickets[i]);
        }
         System.out.println("Please choose Ticket");
    }
    @Override
    public String toString() {
        return " FlightID=" + FlightID + "\n\tDeparture=" + Departure + " DepartureTime=" + DepartureTime
                + " DepartureDate=" + DepartureData + "\n\tArrival=" + Arrival + "ArrivalTime=" + ArrivalTime
                + " ArrivalData=" + ArrivalData+"\n-------------------------------------------------------------------";
        
    }

    
}


