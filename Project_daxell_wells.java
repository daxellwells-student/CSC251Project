import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_daxell_wells
{
   public static void main(String[] args) throws IOException
   {
      
      File file = new File("PolicyInformation.txt");
      if(!file.exists())
      {
         System.out.println("Unable to locate file.");
         System.exit(0);
      }
      
      // declared variables
      Scanner policyFile = new Scanner(file);
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      int policyNumber;
      String policyName;
      String policyHolderFirstName;
      String policyHolderLastName;
      int policyHolderAge;
      String smokerStatus;
      double policyHolderHeight;
      double policyHolderWeight;
      int numOfSmokers = 0, numOfNonSmokers = 0;
      Policy policy;
      
      while (policyFile.hasNext())
      {
         
         policyNumber = policyFile.nextInt();
         policyFile.nextLine();
         policyName = policyFile.nextLine();
         policyHolderFirstName = policyFile.nextLine();
         policyHolderLastName = policyFile.nextLine();
         policyHolderAge = policyFile.nextInt();
         policyFile.nextLine();
         smokerStatus = policyFile.nextLine();
         if (smokerStatus.equals("smoker"))
         {
            numOfSmokers++;
         }
         else
         {
            numOfNonSmokers++;
         }
         policyHolderHeight = policyFile.nextDouble();
         policyFile.nextLine();
         policyHolderWeight = policyFile.nextDouble();
         policy = new Policy(policyNumber, policyName, policyHolderFirstName, policyHolderLastName, policyHolderAge, smokerStatus, policyHolderHeight, policyHolderWeight);
         policyList.add(policy);
      }
      
      for (Policy pol : policyList)
      {
         displayPolicyInformation(pol);
      }
      System.out.println();
      System.out.printf("The number of policies with a smoker is: %d\n", numOfSmokers);
      System.out.printf("The number of policies with a non-smoker is: %d\n", numOfNonSmokers);
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
