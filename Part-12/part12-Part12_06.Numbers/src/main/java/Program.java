
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random lady = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < number; i++) {
            int random = lady.nextInt(11);
            System.out.println(random);
        }
        
    }

}
