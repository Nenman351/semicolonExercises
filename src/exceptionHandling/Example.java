package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException{
        try( FileReader reader = new FileReader("Cohort13");
             BufferedReader bufferedReader = new BufferedReader(reader);) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In finally block");
        }
    }
}
