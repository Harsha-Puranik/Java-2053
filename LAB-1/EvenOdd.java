import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Declare only once
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}



Output:
Enter a number: 9
9 is odd

Enter a number: 6
6 is even

