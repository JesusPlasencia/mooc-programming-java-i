
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.valueOf(scanner.nextLine());
        for (int i = startNumber; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
