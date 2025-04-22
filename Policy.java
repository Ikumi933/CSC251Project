public class Policy
{
   //fields
   private String number;
   private String name;
   private String firstName;
   private String lastName; 
   private String smoking;
   private double height;
   private double weight;
   private int age;
   
   PolicyHolder holder = new PolicyHolder();

   
   //constructors
   public Policy()
   {
   number = "";
   name = "";
   firstName = "";
   lastName = "";
   age = 0;
   smoking = "";
   height = 0.0;
   weight = 0.0;
   }
   public Policy(String n, String nam, String fn, String ln, int agee, 
   String smoke, double h, double w )
   {
   number = n;
   name = nam;
   firstName = fn;
   lastName = ln;
   smoking = smoke;
   height = h;
   weight = w;  
   holder = new PolicyHolder(hold) 
   }
   //setters

   /**
    * 
    * @param pNumber - String value set policy number 
    */
   public void setPolicyNumber(String pNumber)
   {
      number = pNumber;
   }
   /**
    * 
    * @param pName - String value set provider name 
    */
   public void setProviderName(String pName)
   {
      name = pName;
   }
   /**
    * 
    * @param fName - String value set first name 
    */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   /**
    * 
    * @param lName - String value set last name 
    */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
    /**
    * 
    * @param a - Integer value set the age 
    */
   public void setAge(int a)
   {
      age = a;
   }

      /**
    * 
    * @param sStatus - String value set smoking status
    */
   public void setSmokingStatus(String sStatus)
   {
      smoking = sStatus;
   }
   /**
    * 
    * @param h - double value set height
    */
   public void setHeight(double h)
   {
      height = h;
   }
   /**
    * 
    * @param w - double value set weight 
    */
   public void setWeight(double w)
   {
      weight = w;
   }

   
   //getters//
   /**
    * 
    * @return String value of policy number 
    */
   public String getPolicyNumber()
   {
      return number;
   }
    /**
    * 
    * @return String value of provider name 
    */
   public String getProviderName()
   {
      return name;
   }
    /**
    * 
    * @return String value of first name 
    */
   public String getFirstName()
   {
      return firstName;
   }
    /**
    * 
    * @return String value of last name 
    */
   public String getLastName()
   {
      return lastName;
   }
   
       /**
    * 
    * @return integer value of age
    */
   public int getAge()
   {
      return age;
   }


    /**
    * 
    * @return String value of smoking status 
    */
   public String getSmokingStatus()
   {
      return smoking;
   }
    /**
    * 
    * @return double  value of height
    */
   public double getHeight()
   {
      return height;
   }
    /**
    * 
    * @return double value of weight 
    */
   public double getWeight()
   {
      return weight;
   }
    /**
    * 
    * @return double value of BMI
    */
   public double BMI()
   {
      final double CONVFACTOR = 703;
   return (weight * CONVFACTOR) / (height * height);
   }


  public String toString()
  {
   
   return String.format("Policy Number: " + number +
      "\nProvider Name: " + name +
   "Policy's First Name: " + firstName +
      "\nPolicy's Last Name: " + lastName +
      "\nPolicy's Age: " + age +
      "\nPolicyholder's smoking Status: " + smoking +
      "\nPolicyholder's Height: " + height + " inches"+
      "\nPolicyholder's Weight: " + weight + " pounds"+
      "\nPolicyholder's BMI: %.2f\n", BMI()
      "\nPolicy Price: $%.2f\n", holder.toString());

  
  }
}