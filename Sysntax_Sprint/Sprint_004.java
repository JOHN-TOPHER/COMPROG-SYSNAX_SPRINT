public class Sprint_004{
   public static void main(String[] args){

    double totalBudget =10700;

    // The Allowance for the 5 Siblings
    double annaAllowance = totalBudget * 0.20; //2140
    double leaAllowance = totalBudget * 0.18; //1926
    double janineAllowance = totalBudget * 0.16; //1712
    double joanAllowance = totalBudget * 0.12; //1284
    double robilynAllowance = totalBudget * 0.07; //749
    
    //total allowance of 5 siblings
    double totalAllowance = 20 + 18 + 16 + 12 + 7; 
   
    // Spending of the 5 Siblings
    double annaSpending = annaAllowance - 1200; //She spent 3 items worth 1200
    double leaSpending = leaAllowance - 0.05 ; //%5 of 1926 is 96.3
    double janineSpending = 0.10 * 800; //She spent 10% of her allowance (96.3)
    double totalSpending = janineSpending + 800; // 10% + 800
    double joanSpending =  joanAllowance * 0.10; //10% of 1284 is 128.4
    double joanTotal = joanAllowance + joanSpending; //1284 + 128.4 = 1412.4
    double roblynSpending = robilynAllowance - 0; //She did not spend any of her allowance
    roblynSpending = Math.round(roblynSpending);

    //Total of the Spending of the 5 Siblings
    double totalSiblingSpending = 1200 + 96.3 + 880 + 1412; //3588.3
    System.out.println("Total Spending of the 5 Siblings: " + totalSiblingSpending);

    //QUESTIONS:
      // 1. How much is the remaining balance of 5 siblings? in total?
      double remainingBudget = totalBudget - totalSiblingSpending; // 7111.7
      System.out.println("1. Remaining Balance of 5 Siblings: " + remainingBudget);

     // 2. Who are the most spender?
     System.out.println("2. The Most Spender is Joan with Total Spending of: " + joanTotal);

     // 3. How much Joan excess? How did she spend so much, more than her 12% allowance?
     double joanExcess = joanAllowance - joanTotal; //-128.4
     joanExcess = Math.round(joanExcess * 100.0) / 100.0;

     System.out.println("3.1 Joan's Excess is total of: " + joanExcess);
     joanSpending = Math.round(joanSpending);
     System.out.println("3.2 Joan spent 10% of her allowance which is: " + joanSpending);
    
    // 4. If you want to distribute the excess balance, can you solve Joan's problem?
    double newJoanMoney = remainingBudget - joanSpending;
     System.out.println("4. If we will distribute the excess balance, Joan will have now: " + newJoanMoney);
    
   }
}
