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
      PolicyHolder policyHolder;
      
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
         policyHolder = new PolicyHolder(policyHolderFirstName, policyHolderLastName, policyHolderAge, smokerStatus, policyHolderHeight, policyHolderWeight);
         policy = new Policy(policyNumber, policyName, policyHolder);
         policyList.add(policy);
      }
      
      for (Policy pol : policyList)
      {
         displayPolicyInformation(pol);
      }
      System.out.printf("There were %d Policy objects created.\n\n",Policy.getNumberOfPolicies());
      System.out.printf("The number of policies with a smoker is: %d\n", numOfSmokers);
      System.out.printf("The number of policies with a non-smoker is: %d\n", numOfNonSmokers);
   }
   
   /**
      Method that display policy information including holder information, BMI, and policy price
      @param policy is the policy object with the policy holder's information
   */
   public static void displayPolicyInformation(Policy policy)
   {
      System.out.print(policy);
      System.out.printf("Policyholder's BMI: %,.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%,.2f\n\n", policy.calculatePolicyPrice());
   }

}
