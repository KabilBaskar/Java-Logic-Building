import java.util.Scanner;
public class Season_Finder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month name:");
        String month = sc.nextLine();

        if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("December")){
            System.out.println(month+":It is a Winter Season");
        }
        else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println(month+":It is a Spring Season");
        }
        else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")){
            System.out.println(month+":It is a Summer Season");
        }
        else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
            System.out.println(month+":It is a Autumn Season");
        }
        else{
            System.out.println("Enter  valid Month");
        }
    }

}
