package week1;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value:");
        int value = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name:");
        String name = sc.nextLine(); 

        System.out.println("Enter the symbol:");
        char symbol = sc.next().charAt(0);

    
        System.out.println("Value: " + value);
        System.out.println("Name: " + name);
        System.out.println("Symbol: " + symbol);

 
	}

}
