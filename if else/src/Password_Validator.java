import java.util.Scanner;
public class Password_Validator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String password = "Secret_123";

        String pass = sc.nextLine();

        if(pass.equals(password)){
            System.out.println("Access Granted.");
        }
        else if(pass.equalsIgnoreCase(password)){
            System.out.println("Access Denied: Case Sensitivity Mismatch.");
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
