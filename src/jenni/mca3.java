package jenni;
//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mca3 {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String nameString = obj.readLine();

        System.out.print("Enter your roll number: ");
        int roll = Integer.parseInt(obj.readLine());
        System.out.println("_");
        System.out.println("You Have Entered the Name = " + nameString);
        System.out.println("You Have Entered the Roll = " + roll);
    }
}
