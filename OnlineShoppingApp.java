import java.util.Scanner;

public class OnlineShoppingApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("WELCOME TO ONLINE SHOPPING APP");
		Scanner sc= new Scanner(System.in);
		int choice;
		System.out.println("1.Electronic Devices \n 2.Clothing \n 3.Groceries \n 4.Exit");
		choice=sc.nextInt();
		int option;
		switch(choice) {
		case 1:
			System.out.println(" 1.Laptop \n 2.Mobile \n 3.Bluetooth");
			 option=sc.nextInt();
			 break;
		case 2:
			 System.out.println("1.Mens \n 2.Womens \n");
			 option=sc.nextInt();
			 break;
		case 3:
			 System.out.println("1.Vegatables \n 2.Fruits \n 3.pulses");
			 option=sc.nextInt();
			 break;
		case 4:
			 System.out.println("Thank you for Shopping ");
			 System.exit(0);
			 break;
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();

	}

}