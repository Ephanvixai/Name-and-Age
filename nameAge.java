package nameAge;

import java.util.Scanner;
public class nameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
 
 System.out.println(" What is your name?");
 
 String name = scanner.next();
 
 System.out.println("Hi " +name);
 
 System.out.println(" How old are you " +name+ "?");
 
 int age = scanner.nextInt();
 
 System.out.println(name+ " you are " +age+ " years old");
 
 scanner.close();
	}

}
