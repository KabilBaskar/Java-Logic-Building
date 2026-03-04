import java.util.Scanner;
public class Vowel_or_Consonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Letter:");
        String input = sc.nextLine();

        if(input.length()!=1){
            System.out.println("Invalid Input");
        }
        else{
            if(input.equalsIgnoreCase("a")||(input.equalsIgnoreCase("e"))||(input.equalsIgnoreCase("i"))||(input.equalsIgnoreCase("o"))||(input.equalsIgnoreCase("u"))){
                System.out.println("It is a vowel");
            }
            else{
                System.out.println("It is a Consonant");
            }

        }

    }
}
