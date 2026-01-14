import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
Christopher Markham
1/14/2026
Exercise17_14
Unencrypts a given file
*/
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Read from:");
        String source = scanner.nextLine();

        System.out.println("Write to:");
        String destination = scanner.nextLine();

        try {
            FileInputStream input = new FileInputStream(source);
            FileOutputStream output = new FileOutputStream(destination);
            for (int i = input.read(); i != -1; i = input.read()) {
                output.write(i - 5);
            }
            System.out.println("Finished!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}