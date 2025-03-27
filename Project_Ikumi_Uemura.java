import java.util.Scanner;

public class Project_Ikumi_Uemura
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
    int number;
   String name;
   String firstName;
   String lastName; 
   int age;
   String smoking;
   double height;
   double weight;
   
   System.out.print("Please enter the Policy Number: ");
   number = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("Please enter the Provider Name: ");
   name = keyboard.nextLine();
   System.out.print("Please enter the Policyholder7s First Name: ");
   firstName = keyboard.nextLine();
   System.out.print("Please enter the Policyholder's Last Name: ");
   lastName = keyboard.nextLine();
   System.out.print("Please enter the Policyholder's Age: ");
   age = keyboard.nextInt();
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   smoking = keyboard.nextLine();
   keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Height(in inches): ");
   height = keyboard.nextDouble();
   System.out.print("Please enter the Policyholder's Weight(in inches): ");
   weight = keyboard.nextDouble();
   

   Policy p = new Policy(number, name, firstName, lastName, age, smoking, height, weight);
   p.displayInfo();
   
   
   }
}
