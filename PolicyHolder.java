class PolicyHolder
{
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String smokerStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   /**
      Default no-arg constructor that creates a policy holder object with no arguments.  Sets values to default values.
   */
   public PolicyHolder()
   {
      policyHolderFirstName = "John";
      policyHolderLastName = "Doe";
      policyHolderAge = 30;
      smokerStatus = "non-smoker";
      policyHolderHeight = 70;
      policyHolderWeight = 180;
   }
   
   /**
      args constructor that creates a policy holder from the inputted values
      @param firstName The policy holder's first name
      @param lastName The policy holder's last name
      @param age The policy holder's age
      @param smkingStatus The policy holder's smoking status (smoker/non-smoker)
      @param height The policy holder's height
      @param weight The policy holder's weight
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderAge = age;
      smokerStatus = smokingStatus;
      policyHolderHeight = height;
      policyHolderWeight = weight;

   }
   
   /**
   Copy constructor that creates a copy of a policy holder.  
   @param holder2 PolicyHolder object to be copied
   */
   public PolicyHolder(PolicyHolder holder2)
   {
      policyHolderFirstName = holder2.policyHolderFirstName;
      policyHolderLastName = holder2.policyHolderLastName;
      policyHolderAge = holder2.policyHolderAge;
      smokerStatus = holder2.smokerStatus;
      policyHolderHeight = holder2.policyHolderHeight;
      policyHolderWeight = holder2.policyHolderWeight;
   }
   
   /**
      Method that sets the policy holder's first name
      @param firstName is the first name of the policy holder to set for the policy
   */
   public void setPolicyHolderFirstName(String firstName)
   {
      policyHolderFirstName = firstName;
   }
   
   /**
      Method that returns the policy holder's first name
      @return the policy holder's first name
   */
   public String getPolicyHolderFirstName()
   {return policyHolderFirstName;}
   
   /**
      Method that sets the policy holder's last name
      @param lastName is the last name of the policy holder to set for the policy
   */
   public void setPolicyHolderLastName(String lastName)
   {
      policyHolderLastName = lastName;
   }
   
   /**
      Method that returns the policy holder's last name
      @return the policy holder's last name
   */
   public String getPolicyHolderLastName()
   {return policyHolderLastName;}
   
   /**
      Method that sets the policy holder's age
      @param age is the policy holder's age to be set for the policy
   */
   public void setPolicyHolderAge(int age)
   {
      policyHolderAge = age;
   }
   
   /**
      Method that returns the policy holder's age
      @return the policy holder's age
   */
   public int getPolicyHolderAge()
   {return policyHolderAge;}
   
   /**
      Method that sets the policy holder's smoking status
      @param smokingStatus is smoking status of the policy holder to be set for the policy
   */
   public void setSmokerStatus(String smokingStatus)
   {
      smokerStatus = smokingStatus;
   }
   
   /**
      Method that returns the policy holder's smoking status
      @return the policy holder's smoking status
   */
   public String getSmokerStatus()
   {return smokerStatus;}
   
   /**
      Method that sets the policy holder's height
      @param height is the policy holder's height in inches to be set for the policy
   */
   public void setPolicyHolderHeight(double height)
   {
      policyHolderHeight = height;
   }
   
   /**
      Method that returns the policy holder's height
      @return the policy holder's height in inches
   */
   public double getPolicyHolderHeight()
   {return policyHolderHeight;}
   
   /**
      Method that sets the policy holder's weight
      @param weight is the policy holder's weight in pounds to be set for the policy
   */
   public void setPolicyHolderWeight(double weight)
   {
      policyHolderWeight = weight;
   }
   
   /**
      Method that returns the policy holder's weight
      @return the policy holder's weight in pounds
   */
   public double getPolicyHolderWeight()
   {return policyHolderWeight;}
}