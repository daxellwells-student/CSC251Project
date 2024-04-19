import java.lang.Math;
class Policy
{
   // policy information stores in the policy object
   private PolicyHolder policyMember;
   private int policyNumber;
   private String policyName;
   
   /**
      Default no-arg constructor that creates a policy object with no arguments.  Sets values to default values.
   */
   public Policy()
   {
      policyMember = new PolicyHolder();
      policyNumber = 0;
      policyName = "default";
   }
   
   /**
      constructor that takes a policy holder object.  Sets policy name and number to default values.
   */
   public Policy(PolicyHolder member)
   {
      policyMember = new PolicyHolder(member);
      policyNumber = 0;
      policyName = "default";
   }
   
   /**
      args constructor that creates a policy object with arguments.  Sets values to the arguments provided.
      @param number sets the policyNumber value.
      @param name to be used to set the policyName value.
      @param member Policy Holder Object that contains the policy member's information
   */
   public Policy(int number, String name, PolicyHolder member)
   {
      policyNumber = number;
      policyName = name;
      policyMember = new PolicyHolder(member);
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
      Method that calculates BMI based on policy holder height and weight
      @return the calculated BMI
   */
   public double calculateBMI()
   {return (policyMember.getPolicyHolderWeight() * 703) / (Math.pow(policyMember.getPolicyHolderHeight(), 2.0));}
   
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
      if (policyMember.getPolicyHolderAge() > geriatricThreshold)
      {
         total += geriatricFee;
      }
      if (policyMember.getSmokerStatus().equals("smoker"))
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
   
   public String toString()
   {
      String return_string = String.format("Policy Number: " + policyNumber + 
             "\nProvider Name: %s\n", policyName);
      return_string += policyMember.toString();
      return return_string;
   }
}