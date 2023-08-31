import java.util.Scanner;

public class Averagefinder {
  public static void main(String[] args) {
    
    System.out.println("*** Average of 3 numbers ***");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the value of number 1");
    int num1 = sc.nextInt();
    System.out.println("Enter the value of number 2");
    int num2 = sc.nextInt();
    System.out.println("Enter the value of number 3");
    int num3 = sc.nextInt();

    int avg = (num1+num2+num3)/3;
    System.out.println("The average of the 3 numbers is "+avg);
    
    sc.close();
    
  }
}