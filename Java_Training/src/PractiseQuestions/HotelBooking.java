package PractiseQuestions;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class HotelBooking {
	
	private static Set<String>VALID_HOTEL=new HashSet<>(Arrays.asList("Hilton","Marriott","Taj","Oberio","Hyatt"));
	private static Set<String>VALID_HOTEL_TYPE=new HashSet<>(Arrays.asList("Standard","Deluxe","Suite"));
	
	// VALIDATE USER DETAILS
	public static void validateAge(int age) throws InvalidBookingDeatailsException {
		if(age<18 || age>100) {
			throw new InvalidBookingDeatailsException("Invalid age");
		}
	}
	
	 public static void validateEmail(String email) throws InvalidBookingDeatailsException {
	        String emailregex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	        if (email == null || !email.matches(emailregex)) {
	            throw new InvalidBookingDeatailsException("Invalid email");
	        }
	    }
	
	public static void validateCreditCard(String creditCard) 	throws InvalidBookingDeatailsException {
		if(creditCard==null || !creditCard.matches("\\d{16}")) {
			throw new InvalidBookingDeatailsException("Invalid credit card");
		}
	}


		
	//   VALIDATE BOOKING DETAILS
		public static void validateHotelName(String hotelName) throws InvalidBookingDeatailsException {
			if(!VALID_HOTEL.contains(hotelName)) {
				throw new InvalidBookingDeatailsException("Invalid hotel name");
			}
		}
		
		public static void validateRoomTypes(String roomType) throws InvalidBookingDeatailsException{
			
			if(!VALID_HOTEL_TYPE.contains(roomType)) {
				throw new InvalidBookingDeatailsException("Invalid room type");
			}
		}
		
			
		 public static LocalDate validateCheckInDate(String dateStr) throws InvalidBookingDeatailsException {
		        try {
		            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		            if (!date.isBefore(LocalDate.now())) {
		                throw new InvalidBookingDeatailsException("Invalid check-in date");
		            }
		            return date;
		        } catch (DateTimeParseException e) {
		            throw new InvalidBookingDeatailsException("Invalid date format");
		        }
		    }
		 
		 public static LocalDate validateCheckOutDate(String dateStr, LocalDate checkIn)throws InvalidBookingDeatailsException {
		        try {
		            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		            if (!date.isAfter(checkIn)) {
		                throw new InvalidBookingDeatailsException("Invalid check-out date");
		            }
		            return date;
		        } catch (DateTimeParseException e) {
		            throw new InvalidBookingDeatailsException("Invalid date format");
		        }
			
		}
		
  // CALCULATE BOOKING COST
		public static double calculateBookingCost(String roomType,int numNights,boolean breakfastIncluded) {
			int ratePerday;
			
			switch(roomType) {
			case "Standard":
				ratePerday=1000;
				break;
			case "Deluxe":
				ratePerday=2000;
				break;
			case "Suite":
				ratePerday=3000;
				break;
		    default:
		    	ratePerday=0;
			}
			
			double total=ratePerday*numNights;
			
			if(breakfastIncluded) {
				total+=100*numNights;
			}
			return total;
		}
}
