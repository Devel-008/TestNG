import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserInputExample {
    private final Scanner scanner;
    private final PrintStream printStream;

    public UserInputExample(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("Enter number 1");
        int x = scanner.nextInt();
        printStream.println("Enter number 2");
        int y = scanner.nextInt();
        printStream.println("output: " + (x + y));
    }

    public static void main(String[] args) {
        UserInputExample userInputExample = new UserInputExample(System.in, System.out);
        userInputExample.start();
    }
}
