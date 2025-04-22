import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class Project_Ikumi_Uemura
{
   public static void main(String[] args)  throws IOException
   {


   /*Create an instance of the File class. Pass the string "tuition.txt" 
   to the constructor. This process creates a File object that represents the file tuition.txt.*/
   File file = new File("PolicyInformation.txt");
   Scanner inputFile = new Scanner(file);
   
    String number ;
   String name ;
   String firstName ;
   String lastName ; 
   int age = 0;
   String smoking ;
   double height ;
   double weight;
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

      if(inputFile.hasNext())
         inputFile.nextLine();
      if(inputFile.hasNext())
         inputFile.nextLine();
      PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smoking,height, weight);
      Policy p = new Policy(number, name, holder);
      
      policyArrayList.add(p);   
/* Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created 
as long as there are records in the file to read.*/
      
     }
   
       for(Policy policy : policyArrayList)
      { 
          System.out.println(policy);
          System.out.println();
          if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
      }      //print out the number of Policy objects
      
      System.out.println("There were " + Policy.numOfPolicies + "Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyArrayList.size() - numSmokers) );
      }
         
   
}
