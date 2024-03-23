import java.util.Scanner;

public class Project_daxell_wells
{
   public static void main(String[] args)
   {
      // declared variables
      Scanner keyboard = new Scanner(System.in);
      int policyNumber;
      String policyName;
      String policyHolderFirstName;
      String policyHolderLastName;
      int policyHolderAge;
      String smokerStatus;
      double policyHolderHeight;
      double policyHolderWeight;
      
      // ask user for policy information
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      policyName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policyHolderFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policyHolderLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      policyHolderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      while(true)
      {
         System.out.print("Please enter the Policyholder's Smoking Stauts (smoker/non-smoker): ");
         smokerStatus = keyboard.nextLine().toLowerCase();
         if (smokerStatus.equals("smoker") || smokerStatus.equals("non-smoker"))
         {break;}
         System.out.println("Error!  Invalid selection.  Please try again.");
      }
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      policyHolderHeight = keyboard.nextDouble();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policyHolderWeight = keyboard.nextDouble();
      keyboard.nextLine();
      
      // create policy object based on user input
      Policy policy = new Policy(policyNumber, policyName, policyHolderFirstName, policyHolderLastName, policyHolderAge, smokerStatus, policyHolderHeight, policyHolderWeight);
      
      // displays policy information, calulated BMI, and total price for the policy
      displayPolicyInformation(policy);
      
   }
   
   /**
      Method that display policy information including holder information, BMI, and policy price
      @param policy is the policy object with the policy holder's information
   */
   public static void displayPolicyInformation(Policy policy)
   {
      System.out.printf("\n\nPolicy Number: %d\n", policy.getPolicyNumber());
      System.out.printf("Policy Name: %s\n", policy.getPolicyName());
      System.out.printf("Policyholder's First Name: %s\n", policy.getPolicyHolderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n", policy.getPolicyHolderLastName());
      System.out.printf("Policyholder's Age: %d\n", policy.getPolicyHolderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n", policy.getSmokerStatus());
      System.out.printf("Policyholder's Height: %,.1f inches\n", policy.getPolicyHolderHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", policy.getPolicyHolderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%,.2f\n", policy.calculatePolicyPrice());
   }

}
