import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String Name = sc.nextLine();

        if(Name.equals("Admin")){
            System.out.println("Welcome,System Administator! ");
        }
        else if(Name.equals("Guest")){
            System.out.println("Welcome,Guest User!");
        }
        else{
            System.out.println("Hello,User!"+Name);
        }
    }
}