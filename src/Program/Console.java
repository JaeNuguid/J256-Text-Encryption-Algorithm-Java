package Program;

import java.util.Scanner;

public class Console{

	
	public static void main(String[] args){
	 Console x = new Console();
	try{ x.menu();}catch(Exception e){
		System.out.println("\nInvalid Input!\n\n");
	x.menu();	
	}	
	
	}
	
	public void menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("--- Main Menu ----");
		System.out.println("1 - Encrypt a Text");
		System.out.println("2 - Decrypt J256");
		System.out.println("3 - Exit");
		System.out.println("\nSelect Action: ");
		int x = scan.nextInt();
		action(x);
		
	}
	
	public void action(int x){
		Scanner scan = new Scanner(System.in);
		switch(x){
		case 1:
			Main_Encryption enc = new Main_Encryption();

			System.out.println("Enter a String: ");
			enc.Encryption(scan.nextLine());
		
			
			break;
		case 2:

			Main_Decryption dec = new Main_Decryption();
			break;
		case 3:
			System.exit(1);
			break;
			
		default:
			System.out.println("\nInvalid Input!\n\n");
			menu();
			break;
			
		
		}
	}
	
}
