/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinty;

import java.util.ArrayList;

/*\*
 *
 * @author USER
 */
/* class passenger specific It contains information that we will obtain from it
and  ArrayList Ticket For all flights booked and reservTicket and 
implements BookTicket interface method GetSeatPrice
*/

public class Passenger implements BookTicket {
    
    //instance varible

    private  String FirstName;
    private String LastName;
    private String Gender;
    private int Age;
    private int PassportNum;
    //ArrayList <object Ticket> and name is allTickets 
    public ArrayList<Ticket> allTickets;
    public Ticket NumID;
        public int Num=0;

    // creat constructor 
    public Passenger() {
        allTickets = new ArrayList<Ticket>();
    }
    public Passenger(String FirstName, String LastName, String Gender, int Age, int PassportNum) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Age = Age;
        this.PassportNum = PassportNum;
        allTickets = new ArrayList<Ticket>();
    }
    // return FirstName;

    public String getFirstName() {
        return FirstName;
    }
//setFirstName and call in the main 
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    //        return LastName;
    public String getLastName() {
        return LastName;
    }
//setLastName and call in the main 
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
//        return Gender;
    public String getGender() {
        return Gender;
    }
//setGender and call in the main 
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
//        return getAge;
    public int getAge() {
        return Age;
    }
//setAge and call in the main 
    public void setAge(int Age) {
       
        this.Age = Age;
    }
//        return PassportNum;
    public int getPassportNum() {
        return PassportNum;
    }
//setPassportNum  and call in the main 
    public void setPassportNum(int PassportNum) {
        this.PassportNum = PassportNum;
    }
//reservTicket Passenger
    public void reservTicket(Ticket t) {
        allTickets.add(t);
    }
//implements BookTicket interface (return price) and add price for Ticket
    @Override
    public double GetSeatPrice() {
        double price = 0;
        for (Ticket t : allTickets) {
            price =price+ t.GetSeatPrice();
           
        }
        return price;
    }
//Override and return this 
    
     public static boolean NamegenString(String name)
    {
        // If string is empty or null
        if (name == null || name.equals("")) {
 
            // Return false
            return false;
        }
        // If we reach here we have character/s in string
        for (int i = 0; i < name.length(); i++) {
            // Getting character at indices
            // using charAt() method
            char cha = name.charAt(i);
            if ((!(cha >= 'A' && cha <= 'Z')) && (!(cha >= 'a' && cha <= 'z'))){
                return false;
            }
        }
        // String is only alphabetic
        return true;
    }

    @Override
    public String toString() {
       
        String s= "FirstName=" + FirstName + ", LastName=" + LastName + 
                ", Gender=" + Gender + ", Age=" + Age + 
                ", PassportNum=" + PassportNum +"\n";
                for (Ticket t : allTickets) {
                    
                    s+=t.DetailsFlight+"\n"+"NumID="+ t.NumID+"\n" ;
                    s+=t+"\n________________________________________________\n";
        }
                s+= GetSeatPrice();
                return s;
    }
    public int toString2(){
    return Num;
    }
}


