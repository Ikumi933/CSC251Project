public class Policy
{
   //fields
  private String policyNumber;
  private String providerName;
  private PolicyHolder ph;
  
  public static int numOfPolicies = 0;

   
   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }
   
    public Policy(String policyNumber, String providerName, PolicyHolder ph)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.ph = new PolicyHolder(ph);//create a "deep copy" using the PolicyHolder's copy constructor 
      numOfPolicies++;
   }



   /**
    * 
    * @param pNumber - String value set policy number 
    */
   public void setPolicyNumber(String policynumber)
   {
      this.policyNumber = policynumber;
   }
   /**
    * 
    * @param pName - String value set provider name 
    */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
      
   //getters//
   /**
    * 
    * @return String value of policy number 
    */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
    /**
    * 
    * @return String value of provider name 
    */
   public String getProviderName()
   {
      return providerName;
   }
    /**
    * 
    * @return String value of first name 
    */
  /**
   @return The PolicyHolder for the policy
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(ph);//return a copy of the PolicyHolder for the policy using the Copy Constructor
   }   

    /**
    * 
    * @return String value of smoking status 
    */
      /**
    * 
    * @return double value of BMI
    */   
   
   public double InsurancePolicy()
   {
   double total = 600;
   
   if(ph.getAge() > 50)
   {
   total += 75;
   //fee is $75 whoever above 50 years old
   }
   if(ph.getSmokingStatus().equalsIgnoreCase("smoker"))
   {
   total += 100;
   //additional $100 if they are smoker
   }
   if(ph.getBMI() > 35)
   {
   total += (ph.getBMI()-35) * 20;
   //calculation for BMI fee in case when they exceed 35
   }
   return total;
   }


  /**
  @return A string that dsecribes the Policy
  */
  public String toString()
  {
   return String.format("Policy Number:" + policyNumber +
                        "\nProvider Name" + providerName +
                        "\n" + ph.toString() + 
                        "\nPolicy Price: $%.2f", InsurancePolicy());
  }
  
 
  
}