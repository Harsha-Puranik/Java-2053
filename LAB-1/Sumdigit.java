import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int temp = Math.abs(number);
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
        
    }
}

Output : 
Enter a number:123
Sum of digits: 6
