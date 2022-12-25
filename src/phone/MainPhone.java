package phone;

import java.util.Scanner;

public class MainPhone {
    private static  Phone contact;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        createPhonebook();
    }

    private static void createPhonebook(){
        String main = """
                
                Phonebook
                
                """;

        print(main);
        String firstName = input("Enter firstName: ");
        String lastName = input("Enter your lastName: ");
        String phoneNumber = input("Enter your phoneNumber: ");
        String emailAddress = input("Enter your email: ");
        contact = new Phone(firstName,lastName, emailAddress, phoneNumber);
        System.out.println("Contact created for " +firstName);
        displayContactMenu();
    }

    private static void displayContactMenu(){
        String main = """
                Press
                1 -> Add contact
                2 -> Images
                3 -> Exit
                """;
        String userInput = input(main);
        switch (Integer.parseInt(userInput)){
            case 1 -> addContact();
//            case 2 -> viewImages();
        }
    }

    private  static void addContact(){
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String phoneNumber = input("Enter phoneNumber: ");
        String emailAddress = input("Enter your email address: ");
        contact.add(firstName,lastName,phoneNumber,emailAddress);
        displayContactMenu();
    }

    private static void exit(){
        print("Successful");
        System.exit(0);
    }

    private static String input(String prompt){
        print(prompt);
        return input.nextLine();
    }

    private static void print(String prompt){
        System.out.println(prompt);
    }
}
