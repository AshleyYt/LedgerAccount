public class LedgerAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        // initialize statement uses to record the user's income or expense
        String statement = "";
        // initialize account balance as $10000
        int balance = 10000;
        while(isFlag){
            System.out.println("--------------------------------Ledger App--------------------------------" + '\n');
            System.out.println("                             1 Balance Sheet                              ");
            System.out.println("                             2 Income Statement                           ");
            System.out.println("                             3 Expense Statement                          ");
            System.out.println("                             4 Sign Out                                  \n");
            System.out.print("                             Please choose 1 - 4 : ");

            // Get the option from user 1-4
            char option = Utility.readMenuOption();

            // branches for 1-4 cases
            switch(option){
                case '1':
                    System.out.println("------------------------------Balance Statement----------------------------------");
                    System.out.println("Income/Expense\tTotal Balance\t\t\tAmount\t\t\tDetails\n");
                    System.out.println(statement);
                    System.out.println("---------------------------------------------------------------------------------");
                    break;
                case '2':
                    System.out.print("The income amount is: ");
                    int amount = Utility.readAmount();
                    System.out.print("The detail is: ");
                    String info = Utility.readDetails();
                    System.out.println("-----------------------------------Recorded-----------------------------------\n");

                    //increment on account balance
                    balance += amount;
                    //add a record into statement
                    statement += ("Income\t\t\t\t" + balance + "\t\t\t\t" + amount + "\t\t\t" + info + "\n");

                    break;
                case '3':
                    System.out.print("The expense amount is: ");
                    int decreAmount = Utility.readAmount();
                    System.out.print("The detail is: ");
                    String decreInfo = Utility.readDetails();
                    System.out.println("-----------------------------------Recorded-----------------------------------\n");

                    //decrement on account balance
                    if(balance >= decreAmount) {
                        balance -= decreAmount;

                        //add a record into statement
                        statement += ("Income\t\t\t\t" + balance + "\t\t\t\t" + decreAmount + "\t\t\t\t\t" + decreInfo + "\n");
                    }else{
                        System.out.println("The expense is larger than total balance. Wrong payment.");
                    }

                    break;
                // sign out
                case '4':
                    System.out.print("Confirm sign out <Y/N>: ");
                    char isSignout = Utility.readConfirmation();
                    if (isSignout == 'Y'){
                        isFlag = false;
                    } // if N, the program will loop again;
                    //break;
            }
        }
    }
}
