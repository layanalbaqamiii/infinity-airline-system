/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinty;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author USER
 */

public class Infinty {


    /**
     * @param args the command line arguments
     */ 
    public static String Name;
    public static String Address;
    public static ArrayList<Flight> AllFlifht;
    public static int phone;

    public static void main(String[] args) {

        AllFlifht = new ArrayList<Flight>();
        Flight f = new Flight(102, "Jeddah ", "1:20 am", "1-1-1444", "Riyadh", "3:10 am", "1-1-1444");
        f.addTicket(new EconomicTicket("Economic", 450));
        f.addTicket(new BusinessTicket("Business", 1500));
        f.addTicket(new FirstClassTicket("FirstClass", 600));
        Flight f2 = new Flight(103, "Jeddah ", "1:30 am", "1-1-1444", "Riyadh", "3:50 am", "1-1-1444");
        f2.addTicket(new EconomicTicket("Economic", 300));
        f2.addTicket(new BusinessTicket("Business", 1600));
        f2.addTicket(new FirstClassTicket("FirstClass", 750));
        Flight f3 = new Flight(104, "Riyadh ", "15:00 pm", "3-1-1444", "Jeddah", "16:55 pm", "3-1-1444");
        f3.addTicket(new EconomicTicket("Economic", 320));
        f3.addTicket(new BusinessTicket("Business", 990));
        f3.addTicket(new FirstClassTicket("FirstClass", 720));
        Flight f4 = new Flight(105, "Riyadh ", "10:50 am", "4-1-1442", "Jeddah", "12:40 am", "4-1-1444");
        f4.addTicket(new EconomicTicket("Economic", 520));
        f4.addTicket(new BusinessTicket("Business", 1200));
        f4.addTicket(new FirstClassTicket("FirstClass", 880));
        Flight f5 = new Flight(105, "Taif ", "4:00 am", "4-1-1444", "Jeddah", "5:40 am", "4-1-1444");
        f5.addTicket(new EconomicTicket("Economic",310));
        f5.addTicket(new BusinessTicket("Business", 600));
        f5.addTicket(new FirstClassTicket("FirstClass", 500));
        Flight f6 = new Flight(105, "Madinah ", "4:10 am", "5-1-1444", "Dammam", "6:55 am", "4-1-1444");
        f6.addTicket(new EconomicTicket("Economic", 430));
        f6.addTicket(new BusinessTicket("Business", 1000));
        f6.addTicket(new FirstClassTicket("FirstClass", 730));
        Flight f7 = new Flight(105, "Jeddah ", "16:00 pm", "5-1-1444", "Taif", "17:40 am", "5-1-1444");
        f7.addTicket(new EconomicTicket("Economic", 350));
        f7.addTicket(new BusinessTicket("Business", 610));
        f7.addTicket(new FirstClassTicket("FirstClass", 630));
        Flight f8 = new Flight(105, "Dammam ", "4:10 am", "7-1-1444", "Madinah", "6:55 am", "7-1-1444");
        f8.addTicket(new EconomicTicket("Economic", 530));
        f8.addTicket(new BusinessTicket("Business", 11000));
        f8.addTicket(new FirstClassTicket("FirstClass", 700));
        AllFlifht.add(f);
        AllFlifht.add(f2);
        AllFlifht.add(f3);
        AllFlifht.add(f4);
        AllFlifht.add(f5);
        AllFlifht.add(f6);
        AllFlifht.add(f7);
        AllFlifht.add(f8);
        // TODO code application logic here
        Name = "Infinty";
        Address = "Makkah";
        phone = 57124567;
        System.out.println("Dear customer Welcome to on Airplane tickets reservation system");

        // login
        Scanner in = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits \n"
                + "Input a password (You are agreeing to the above Terms and Conditions): ");
        String pass = in.nextLine();
        System.out.println("enter user");
        String uu = in.nextLine();
        User u = new User(uu);

        while (u.Check(pass) != true) {
            System.out.println("Not a valid password: " + pass);
            System.out.println("try again");
            pass = in.nextLine();
        }

        System.out.println("Password is valid: " + pass);
        System.out.println("*********************************************************");
        System.out.println("Your username: " + uu + "\n" + "Your password: " + pass);
        System.out.println("Welcome to " + Name);
        System.out.println("*********************************************************");

        Passenger p = new Passenger();
      Passenger p2 = new Passenger();
int err=0;
          

        Ticket passticketseat = new EconomicTicket();
        int choice = 0;
        while (choice != 10) {
            System.out.println("These options will be repeated for you several times to book more than one ticket\n (so choose a number each time)");
            System.out.println("1- Reserve flight\n2-Calculate total price\n3-Print ticket \n4-payment\n5- Exit");
            System.out.println("*********************************************************");
//            choice = in.nextInt();
              choice = in.nextInt();
//                    int choice2 = in.nextInt();
//                    Integer choice1 = new Integer(choice2);
                    switch (choice) {
                        case 1:
                            System.out.println("We'll show you available flights");
                            for (int i = 0; i < AllFlifht.size(); i++) {
                                System.out.println((i + 1) + "= " + AllFlifht.get(i) + " ");
                            }
                            
                            System.out.println("Please enter your choice\n1-Flight 1 2-Flight 2- 3-Flights3");
                              try{
                            int fl = in.nextInt();
    AllFlifht.get(fl - 1).displayticket();
                            
                            // throw new IndexOutOfBoundsException("");
                            System.out.println("Please enter your Ticket\n1-Economic 2-Business 3-First");
                            int ti = in.nextInt();
                            Ticket passticket = AllFlifht.get(fl - 1).getTicket(ti - 1);
                            int i, j, seatNum, c = 0;
                            char seatLetter = 'A';
                            int choice3 = 0;
                            String seatEnter;
                            boolean flag = true; // loops of running the program
                            System.out.println(" Assign Seats \n Note: It will not be booked into our system because it will come at the time of boarding\n (we only show you the seats you can see at that time so you know about them)");
                            System.out.println("Select your choice: ");
                            int numOfreservation =0;
                            System.out.println("How many seats do you want to book ?");
                            numOfreservation = in.nextInt();
                            //Set the value.
                            for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                                for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                    passticketseat.SeatNumber[i][j] = seatLetter++;
                                }
                                seatLetter = 'A'; // to reset the value to A for the new loop
                            }
                            //To display the list of seats
                            for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                                System.out.print((i + 1) + " ");
                                for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                    System.out.print(passticketseat.SeatNumber[i][j] + " ");
                                }
                                System.out.println();
                            }
                            //condition
                            while (c < numOfreservation) {
                                do {
                                    System.out.print("Please type the chosen seat(start with row and column, e.g:2B): ");
                                    seatEnter = (in.next()).toUpperCase(); //covert to Upper case
                                    seatNum = Integer.parseInt(seatEnter.charAt(0) + ""); //converts a String to an int
                                    if (seatNum != 0) {
                                        seatLetter = seatEnter.charAt(1);
                                    }
                                    i++;
                                    //if user enters wrong input, error message will appear.
                                    if (seatLetter != 'A') {
                                        if (seatLetter != 'B') {
                                            if (seatLetter != 'C') {
                                                if (seatLetter != 'D') {
                                                    if (seatLetter != 'E') {
                                                        System.out.println("Invalid! Please enter the correct seat: ");
                                                    }}}}}
                                    
                                } //continue to loop until the condition true
                                
                                while (seatNum < 0 || seatNum > 7 || seatLetter < 'A' || seatLetter > 'E');
                                if (seatNum == 0) {
                                    flag = false;
                                } else {
                                    if (passticketseat.SeatNumber[seatNum - 1][seatLetter - 65] == 'X') {
                                        System.out.println("\n       ******Seat have been taken******.\n           Please choose another seat:\n");
                                    } else {
                                        passticketseat.SeatNumber[seatNum - 1][seatLetter - 65] = 'X';
                                    }}
// To display updated lists of seats
                                for (i = 0; i < passticketseat.SeatNumber.length; i++) {
                                    System.out.print((i + 1) + " ");
                                    for (j = 0; j < passticketseat.SeatNumber[i].length; j++) {
                                        System.out.print(passticketseat.SeatNumber[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                                c++;
                            }
                            
                            if (c == 20) {
                                System.out.println("All seats are now fully-booked.");
                            }
                            System.out.println("Dear passenger, please enter your personal information\n enter your First name ");
//                            Passenger check=new Passenger();
                            String Firstname = in.next();
                        if (Passenger.NamegenString(Firstname)==true){
                            p.setFirstName(Firstname);}
                        else{
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                            System.out.println("________________________________________________");
                            
                            System.out.println("Enter your Last name ");
                            String Lastname = in.next();
                              if (Passenger.NamegenString(Lastname)==true){
                            p.setLastName(Lastname);}
                        else{
                            System.out.println("incorrect");
                            p2.Num++;
                        }
                            System.out.println("________________________________________________");
                            
                            System.out.println("Enter your gender ( please write Female or  male) ");
                            String Gender = in.next().toUpperCase();
                            if (Passenger.NamegenString(Gender)==true&& (Gender.equals("FEMALE")||Gender.equals("MALE"))){
                              
                            p.setGender(Gender);}
                        else{
                            System.out.println("incorrect");
                           p2.Num++;


                        }                     
                            System.out.println("________________________________________________");
                            
                            System.out.println("Enter your Age ( please write as integar and Must be 18 or over) ");
                            int Age = in.nextInt();
                            if (Age >=18){
                            p.setAge(Age);}
                            else {
                            System.out.println("incorrect");
                           p2.Num++;
                            }
                            System.out.println("________________________________________________");
                            
                            System.out.println("Enter your Passportnumber ( please write as int 6 number)");
                            int Passportnumber = in.nextInt();
                            p.setPassportNum(Passportnumber);
                            System.out.println("________________________________________________");
                            
                            p.reservTicket(passticket.clone(p.NumID, AllFlifht.get(fl - 1)));
                         } 
        
                        
                            catch (IndexOutOfBoundsException e) {
                                    System.out.println("IndexOutOfBoundsException PLEASE REWRITE");
                                    in.nextLine();
                                    err++;
                                    }
                          catch (NumberFormatException e){
                    System.out.println("NumberFormatException PLEASE just String not number");
                    in.nextInt();
                    err++;}         
                            catch (InputMismatchException e){
                    System.out.println("InputMismatchException PLEASE just number not string");
                    in.nextLine();
                    err++;}
                                    
                            break;
                        case 2:
                            System.out.println("________________________________________________");
                            System.out.println("Total Price :" + p.GetSeatPrice());
                            break;
                   
                        case 3:
                            if (p2.toString2()!=0|| err !=0){
                            System.out.println("Sorry, the ticket cannot be copied You entered "+(p2.toString2()+err)+"input incorrect");}
                            else{
                            System.out.println(p);
                            System.out.println("Booked by " + Name + "\n" + "Telephone: " + phone + "\n" + "Address: " + Address);}
                            break;
                         case 4:
                            System.out.println("Enter your payment information to be able to withdraw the payment\n enter number of \n Credit cards");
                            String Creditcards= Creditcards=in.next();
String ccv;
                      int Month;
    String Year;
                              if (Creditcards.length()==16 && Passenger.NamegenString(Creditcards)==false );{
                               System.out.print("CCV:");
                         ccv=in.next();
                        System.out.print("Expiration Date");
                             System.out.println("month between 1 - 12 , year just last 2 number ex;if Year 2030 enter 30 )");
                                  System.out.println("Month:");Month=in.nextInt();
                                  System.out.println("/");
                                  System.out.print("Year");
                                     Year=in.next();}
                              System.out.println("CCV:"+Month+"/"+Year);
               if (Creditcards.length()==16 && (ccv.length()==3) && (Month>=1||Month<=12)&&Year.length()==2 &&Passenger.NamegenString(Creditcards)==false ) {    
                              System.out.println("Accepted, we wish you a pleasant journey in"+Name);
                                  }
                          
                             while(Creditcards.length()!=16 ||(ccv.length()!=3)||(Month<=1||Month>12)|| Year.length()!=2 || (Passenger.NamegenString(Creditcards)==true)){
                                  System.out.println("You entered something wrong");
                                  System.out.println("length of Creditcard must be 16 number \n length of CCV must be 3 number\n Month between 1-12");
                              System.out.print("Credit cards");
                                  String Creditcards2=in.next();
                                  System.out.print("CCV:");
                              int ccv2=in.nextInt();
                                   System.out.print("Month:");
                               int Month2=in.nextInt();
                                 System.out.print("/");
                              System.out.print("Year");
                               String Yea2=in.next();
                             }
                                      
                            break;   
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalide");
                    
                    }
                }
            }}
     
