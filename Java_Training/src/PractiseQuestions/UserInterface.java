package PractiseQuestions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Name");
			String name=sc.nextLine();
			
			System.out.println("Enter Age");
			int age=Integer.parseInt(sc.nextLine());
			HotelBooking.validateAge(age);
			
			System.out.println("Enter email");
			String email=sc.nextLine();
			HotelBooking.validateEmail(email);  
			
			System.out.println("Enter Credit Card Number");
			String creditCard=sc.nextLine();
			HotelBooking.validateCreditCard(creditCard); 
			
			
			System.out.println("Enter hotel Name");
			String hotelName=sc.nextLine();
			HotelBooking.validateHotelName(hotelName); 

			
			System.out.println("Enter room Type");
			String roomType=sc.nextLine();
			HotelBooking.validateRoomTypes(roomType); 

			
			System.out.println("Enter Check-In Date (yyyy-MM-dd)");
		    String checkInStr=sc.nextLine();
            LocalDate checkIn = HotelBooking.validateCheckInDate(checkInStr);

		    
		    System.out.println("Enter Check-Out Date (yyyy-MM-dd)");
		    String checkOutStr=sc.nextLine();
            LocalDate checkOut = HotelBooking.validateCheckOutDate(checkOutStr, checkIn);
            
		    
		    int numNights=(int)(checkOut.toEpochDay()-checkIn.toEpochDay());
		    
		    boolean breakfastIncluded=false;
		    
		    double cost=HotelBooking.calculateBookingCost(roomType, numNights, breakfastIncluded);
		    System.out.printf("Total Booking Cost: $%.2f%n",cost);
		    
		}catch(InvalidBookingDeatailsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Invalid input");
		}
	}
}
