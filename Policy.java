public class Policy
{
   private int number;
   private String name;
   private String firstName;
   private String lastName; 
   private int age;
   private String smoking;
   private double height;
   private double weight;
   
   
   public Policy()
   {
   number = 0;
   name = "";
   firstName = "";
   lastName = "";
   age = 0;
   smoking = "";
   height = 0.0;
   weight = 0.0;
   }
   public Policy(int n, String nam, String fn, String ln, int agee, 
   String smoke, double h, double w )
   {
   number = n;
   name = nam;
   firstName = fn;
   lastName = ln;
   age = agee;
   smoking = smoke;
   height = h;
   weight = w;   
   }
   
   public double BMI()
   {
   return (weight * 703) / (height * height);
   }
   
   public double InsurancePolicy()
   {
   double total = 600;
   
   if (age > 50)
   {
   total += 75;
   //fee is $75 whoever above 50 years old
   }
   if(smoking.equalsIgnoreCase("smoker"))
   {
   total += 100;
   //additional $100 if they are smoker
   }
   if (BMI() > 35)
   {
   total += (BMI()-35) * 20;
   //calculation for BMI fee in case when they exceed 35
   }
   return total;
   }
   public void displayInfo()
   {
   System.out.println("Policy Number: " + number);
   System.out.println("Provider Name: " + name);
   System.out.println("Policy's First Name: " + firstName );
   System.out.println("Policy's Last Name: " + lastName);
   System.out.println("Policy's Age: " + age);
   System.out.println("Policyholder's smoking Status: " + smoking);
   System.out.println("Policyholder's Height: " + height + "inches");
   System.out.println("Policyholder's Weight: " + weight + "pounds");
   System.out.println("Policyholder's BMI: " + BMI() );
   System.out.println("Policy Price: $" + InsurancePolicy());

   

   }
   
}