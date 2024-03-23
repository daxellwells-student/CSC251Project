import java.lang.Math;
class Policy
{
   // policy information stores in the policy object
   private int policyNumber;
   private String policyName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String smokerStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   // default no-args contructor
   public Policy()
   {
      policyNumber = 0;
      policyName = "default";
      policyHolderFirstName = "John";
      policyHolderLastName = "Doe";
      policyHolderAge = 30;
      smokerStatus = "non-smoker";
      policyHolderHeight = 70;
      policyHolderWeight = 180;
   }
   
   // constructor for creating a new policy with policy holder information
   public Policy(int number, String name, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      policyNumber = number;
      policyName = name;
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderAge = age;
      smokerStatus = smokingStatus;
      policyHolderHeight = height;
      policyHolderWeight = weight;
   }
   
   // setters and getters for each policy holder information field
   
   /**
      Method that sets the policy number
      @param number is the new policy number to set
   */
   public void setPolicyNumber(int number)
   {
      policyNumber = number;
   }
   
   /**
      Method that returns the policy number
      @return the policy number
   */
   public int getPolicyNumber()
   {return policyNumber;}
   
   /**
      Method that sets the policy name
      @param name is the new name to set for the policy
   */
   public void setPolicyName(String name)
   {
      policyName = name;
   }
   
   /**
      Method that returns the policy name
      @return the policy name
   */
   public String getPolicyName()
   {return policyName;}
   
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
   
   /**
      Method that calculates BMI based on policy holder height and weight
      @return the calculated BMI
   */
   public double calculateBMI()
   {return (policyHolderWeight * 703) / (Math.pow(policyHolderHeight, 2.0));}
   
   /**
      Method that calculated policy price based on policy holder information
      @return the calculated price
   */
   public double calculatePolicyPrice()
   {
      final double baseFee = 600;
      
      final int geriatricThreshold = 50;
      final double geriatricFee = 75;
      final double smokerFee = 100;
       double BMIThreshold = 35;
      
      double total = baseFee;
      if (policyHolderAge > geriatricThreshold)
      {
         total += geriatricFee;
      }
      if (smokerStatus.equals("smoker"))
      {
         total += smokerFee;
      }
      
      double BMI = calculateBMI();
      if (BMI > BMIThreshold)
      {
         total += (BMI - 35) * 20;
      }
      
      return total;
   }
}