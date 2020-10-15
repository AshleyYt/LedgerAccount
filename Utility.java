import java.util.Scanner;

public class Utility {


    /**
     * Method to get user's input from 1 - 4
     * @return a char from 1 to 4
     */
    public static char readMenuOption(){
        Scanner scan = new Scanner(System.in);
        char c;
        for(; ; ){
            String str = scan.next();
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("Wrong option. Please select again: ");
            } else break;
        }
        return c;
    }

    /**
     * Method for option 4 --Sign out the App
     * @return Y or N
     */
    public static char readConfirmation(){
        Scanner scan = new Scanner(System.in);
        char c;
        for(; ; ){
            String str = scan.next().toUpperCase(); //accept y or n;
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            } else {
                System.out.print("Wrong option. Please input Y or N. Input again: ");
            }
        }
        return c;
    }

    /**
     * Method for recording to income or expense statement.
     * @return a int limits in 4 digits
     */
    public static int readAmount(){
        Scanner scan = new Scanner(System.in);
        int i;
        for(; ; ){
            String str = scan.next();
            try{
                i = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e){
                System.out.print("Wrong amount. Please input again: ");
            }
        }
        return i;
    }

    /**
     * Method for reading the details of a statement in.
     * @return a string
     */
    public static String readDetails(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        return str;
    }
}
