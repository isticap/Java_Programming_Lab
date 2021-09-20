import java.util.Scanner;

public class BookClubPoints {
    
    public static void main(String[] args) {
        int input, points;
        
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter the number of books you purchased this month to display the number of points earned: ");
        input = in.nextInt();
        
        switch (input){
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                points = 60;
        }
        System.out.println("You earned "+ points +" points this month!");
    }
    
}
