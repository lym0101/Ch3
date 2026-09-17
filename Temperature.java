import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.print("Enter a temperature in Celsius: ");
	double TempC = in.nextInt();
	double TempF = ((TempC * 9.0)/5.0 +32);
	System.out.printf("%.1fC = %.1fF", TempC, TempF);
	}
}
