import java.util.Scanner;
/**
 * Write a description of class RickshawFare here.
 * @author (Abhas Shakya)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance traveled (km):");
        double distance = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter time (minutes):");
        int time = scan.nextInt();
        scan.nextLine();
        System.out.println("Is the customer local (Yes/No):");
        String local = scan.nextLine();
        System.out.println("Is customer travelling during night (Yes/No):");
        String night = scan.nextLine();
        
        //Ternary operator for rate.
        double rate = (local == "Yes")? 50 : 75; // If Yes rate = 50 / No = 75.
        double fare = (distance * rate) + (time *rate); //Calculation based on rules.
        
        //Ternary operator for fare.
        fare = (night == "Yes")? fare*2 : fare; //If yes total fare = fare*2 / No total fare = fare.
        System.out.println("Total fare is (in Rs) :" +fare);
    }
}