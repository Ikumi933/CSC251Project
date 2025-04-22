import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Project_Ikumi_Uemura
{
   public static void main(String[] args)
   {


   try{
   /*Create an instance of the File class. Pass the string "tuition.txt" 
   to the constructor. This process creates a File object that represents the file tuition.txt.*/
   File file = new File("PolicyInformation.txt");

   Scanner inputFile = new Scanner(file);
    String number = "";
   String name = "";
   String firstName = "";
   String lastName = ""; 
   int age = 0;
   String smoking = "";
   double height = 0.0;
   double weight = 0.0;
   int numSmokers = 0;
   
//Create an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policyArrayList = new ArrayList<Policy>();

 /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
   while(inputFile.hasNext())
   {
      //read the next line of the file as a String 
      number = inputFile.nextLine();
      //read the next line of the file as a String
      name = inputFile.nextLine();
      //read the next line of the file as a String
      firstName = inputFile.nextLine();
      //read the next line of the file as a String
      lastName = inputFile.nextLine();
      //read the next line of the file as a integer
      age = inputFile.nextInt();
      inputFile.nextLine();
      //read the next line of the file as a Double
      smoking = inputFile.nextLine();
      //read the next line of the file as a Double
      height = inputFile.nextDouble();
      inputFile.nextLine();
      //read the next line of the file as a Double
      weight = inputFile.nextDouble();
      inputFile.nextLine();

      if(inputFile.hasNext())
      {
         inputFile.nextLine();
      }
      Policy p = new Policy(number, name, firstName, lastName, age, smoking, height, weight);
      
      PolicyHolder holder = new PolicyHolder()

      policyArrayList.add(p);   
/* Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created 
as long as there are records in the file to read.*/
      
   }//close loop

   inputFile.close();
   // //ask for
   for(int i = 0; i < policyArrayList.size(); i++)
   {
 
      System.out.println("Policy Number: " + policyArrayList.get(i).getPolicyNumber());
      System.out.println("Provider Name: " + policyArrayList.get(i).getProviderName());
      System.out.println("Policy's First Name: " + policyArrayList.get(i).getFirstName());
      System.out.println("Policy's Last Name: " + policyArrayList.get(i).getLastName());
      System.out.println("Policy's Age: " + policyArrayList.get(i).getAge());
      System.out.println("Policyholder's smoking Status: " + policyArrayList.get(i).getSmokingStatus());
      System.out.println("Policyholder's Height: " + policyArrayList.get(i).getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policyArrayList.get(i).getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policyArrayList.get(i).BMI() );
      System.out.printf("Policy Price: $%.2f\n", policyArrayList.get(i).InsurancePolicy());
  
      if(policyArrayList.get(i).getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
   }
      for(int: i=0; i < p.size(); i++)
      {
      System.out.print(holder.get(i));
      System.out.print();
      }
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyArrayList.size() - numSmokers) );
      }
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   
   }
}
