package diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
       createDiary();
       displayLockMenu();
    }

    private static void createDiary(){
        String main = """
                Welcome to my Diary!!!
                Let's setup it up
                """;


        print(main);
        String username = input("Enter your name: ");
        String password = input("Enter your password");
        diary = new Diary(username, password);
        System.out.println("Diary created for " +username);
        displayLockMenu();
    }

    private  static  void displayLockMenu(){
        String main = """
                Press
                1 -> Unlock Diary
                2 -> Lock Diary
                3 -> exit
                               """;
        String userInput = input(main);
        switch (Integer.parseInt(userInput)) {
            case 1 -> UnlockDiary();
            case 2 -> LockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void UnlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()){
            print("Wrong password"); displayLockMenu();
        }displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press 1 -> Create Entry
                Press 2 -> Find Entry by Id
                Press 3 -> Get total number of Entries
                Press 4 -> Lock diary
                """;

        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)) {
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> exitApplication();
        }

    }


       private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have" +totalNumberOfEntry+ "Entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String id = input("Enter the Id for the entry you want to find");
       Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for your Entry");
        String body = input("Enter body for the entry");
        diary.write(title, body);
        print("Written Successfully");
        displayDiaryMenu();
    }

    private static void LockDiary() {
        diary.lock();
        print("Locked successfully");
        displayLockMenu();
    }

    private static void exitApplication(){
        print("Thank for using our application");
        System.exit(0);
    }

    private static String input(String prompt){
        print(prompt);
       return keyboardInput.nextLine();
//       return JOptionPane.showInputDialog(null, prompt);
    }

    private static void print(String prompt){
        System.out.println(prompt);
//       JOptionPane.showMessageDialog(null, prompt);
    }
}
