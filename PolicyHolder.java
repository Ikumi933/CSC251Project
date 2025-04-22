public class PolicyHolder
{
    /**
    * 
    * @return double value of total of insurance fee 
    */
    
    
   public double InsurancePolicy()
   {
   double total = 600;
   
   if (age > 50)
   {
   total += 75;
   //fee is $75 whoever above 50 years old
   }
   if(policy.smoking.equalsIgnoreCase("smoker"))
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
   
   public String toString()
   {
   return InsurancePolicy();
   }



}