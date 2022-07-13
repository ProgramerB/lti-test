package view;
import java.util.*;
public class StudentAppView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Stude
		
		System.out.println("1.Student 2.Admin");
		int userType = sc.nextInt();
		
		if(userType	== 1) {
			String userChoice = "y";
			do {
				System.out.println("1. Signup \n2. Update PhNo \n3.Viewall \n4.Register for course"
						+ "\n5.Sign out");
				
				int option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Enter name dob phno email address");
					//String dob
					break;
				case 2:
					break;
				default:
					break;
					
				}
				
				System.out.println("Choice(y,n)");
				userChoice=sc.next();
			}while(userChoice == "y");
		}
		else if(userType == 2) {
			
		}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}
	
}
