
package bankaccountapp;

import java.util.LinkedList;
import java.util.List;


public class BankAccountApp {
    public static void main(String[] args) {
        
    List<Account> accounts = new LinkedList<Account>();
    
        
      
        

        
        // Read a CSV file then create new accounts based on that data
        
        String file = "C:\\Users\\Golgari\\Desktop\\NewBankAccounts.csv";
        
        List<String[]> newAccHolders = utilities.CSV.read(file);
        for(String[] accHolder : newAccHolders){
            String name = accHolder[0];
            String sSN = accHolder[1];
            String accountType = accHolder[2];
            double initDeposit = Double.parseDouble(accHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

        }
        
        
        for(Account acc : accounts){
            System.out.println("\n*********************\n");
            acc.showInfo();
        }
        
        
        
    }
}
