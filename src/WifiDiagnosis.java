
import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		int UserInput; 
		Scanner keyboard = new Scanner (System.in); 
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work");
		
		System.out.println("First step: try rebooting the computer and connect");
		
		System.out.println("Did that fix the problem? 1 for yes and 2 for no.");
		
		UserInput = keyboard.nextInt(); 
		if (UserInput == 1)
		{
			System.out.println("Rebooting the computer seemed to work!");
			
		}
		 
		if (UserInput == 2)
		{
			System.out.println("Second step: reboot the router and try to reconnect");
			System.out.println("Did that fix the problem? 1 for yes and 2 for no.");
		}
		
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 1)
		 {
			 System.out.println("Rebooting the router and trying to reconnect worked!");
		 }
		  
		 if (UserInput == 2)
		 {
			 System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power.");
			 System.out.println("Did that fix the problem? 1 for yes and 2 for no.");
		 }
		
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 1)
		 {
			 System.out.println("Checking the router's cables seemed to work!");
		 }
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 2)
		 {
			 System.out.println("Fourth step: move your computer closer to your router");
			 System.out.println("Are you able to connect to the internet? 1 for yes and 2 for no.");
		 }
		 
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 1)
		 {
			 System.out.println("Moving the router to a new location seemed to work!");
		 }
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 2)
		 {
			 System.out.println("Fifth step: contact your ISP");
		 }
		 UserInput = keyboard.nextInt(); 
		 if (UserInput == 1)
		 {
			 System.out.println("Make sure your ISP is hooked up to your router.");
		 }
		
		System.exit(0);
	}
	
	
	

}
