import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a  number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        if (number < 0) {
            reversed = -reversed;
        }
        
        System.out.println("Reversed number: " + reversed);
    }
    
}

Output:
Enter a  number: 321
Reversed number: 123
