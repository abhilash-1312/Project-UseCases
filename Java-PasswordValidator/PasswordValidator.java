import java.util.*;
public class PasswordValidator {
    public static boolean checkPassword(String password) {

        int ucount=0;
        int dcount=0;

        for (int i=0;i<password.length();i++) {
            char ch=password.charAt(i);
            if (Character.isUpperCase(ch)) {
                ucount++;
            }
            if (Character.isDigit(ch)) {
                dcount++;
            }
        }
        if (password.length()<8) {
            System.out.println("Too short");
            return false;
        }
        if(ucount==0 && dcount==0){
            System.out.println("Missing uppercase and digit ");
            return false;
        }
        if (ucount==0) {
            System.out.println("Missing uppercase letter");
            return false;
        }
        if (dcount==0) {
            System.out.println("Missing a digit");
            return false;
        }   
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password;
        while(true){
            System.out.print("enter password: ");
            password=sc.nextLine();
            if (checkPassword(password)) {
                System.out.println("Valid password");
                break;
            }
        }
    }
}