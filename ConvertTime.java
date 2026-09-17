import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.print("Enter the total amount of seconds you want to convert to minutes, hours, and seconds: ");
	int input = in.nextInt();
	int ansHour = input/3600;
	int ansMin = (input%3600)/60;
	int ansSec = (input%3600)%60;
	//System.out.printf(input + " seconds = " + ansHour  + " hours, " + ansMin + " minutes, " + ansSec + " seconds");
	System.out.printf("%d Seconds = %d Hours + %d Minutes + %d Seconds", input, ansHour, ansMin, ansSec);
	}
}
