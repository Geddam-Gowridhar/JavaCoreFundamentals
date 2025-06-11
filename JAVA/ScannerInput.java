import java.util.*;
class ScannerInput{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String userName = sc.nextLine();
            System.out.println("Hello, " + userName + "!");
        }
    }

}