
package d_chat;

import java.util.Scanner;

public class d_chat {

    static String username;
    static String password;

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to d_chat");

        Registration();
        Login();
    }

    public static void Registration() {
        Scanner input = new Scanner(System.in);

        System.out.println("Registration");
        System.out.print("Please enter your username: ");
        username = input.nextLine();

        System.out.print("Please create a strong password (at least 10 characters): ");
        password = input.nextLine();

        if (password.length() < 10) {
            System.out.println("Sorry, password is not strong enough. Registration unsuccessful.");
            return;
        }

        System.out.print("Please enter your cellphone number: ");
        String cellphoneNumber = input.nextLine();

        System.out.println("Registration successful!");
        System.out.println("Username: " + username);
        System.out.println("Cellphone Number: " + cellphoneNumber);
    }

    public static void Login() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Login");
        System.out.print("Please enter your username to login: ");
        String loginUsername = input.nextLine();

        System.out.print("Please enter your password to login: ");
        String loginPassword = input.nextLine();

        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password.");
        }
        System.out.println("Welcome to d_chat");
    }
}
