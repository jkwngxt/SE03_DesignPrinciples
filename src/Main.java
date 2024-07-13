import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = null;
        String email = null;
        int age = 0;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Name: ");
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading from user");
        }

        System.out.print("Email: ");
        try {
            email = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading from user");
        }

        System.out.print("Age: ");
        try {
            age = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Error reading from user");
        }

        Register register = new Register();

        User user = new User(name, email, age);
        System.out.println("Is valid User (Successful registration): " + register.register(user));

    }
}