import java.util.Scanner;
public class String_Length_and_Content {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String 1:");
        String S1 = sc.nextLine();
        System.out.print("Enter the String 2:");
        String S2 = sc.nextLine();

        if(S1.equals(S2)){
            System.out.println("Prefect Match");
        }
        else if(S1.equalsIgnoreCase(S2)){
            System.out.println("Content Match (Case Mismatch)");
        }
        else if(S1.length() == S2.length()){
            System.out.println("perfect Match");
        }
        else{
            System.out.println("NO Match!");
        }
    }
}
