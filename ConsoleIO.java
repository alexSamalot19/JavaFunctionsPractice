package console;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

//function that prompts a user for a piece of a student's nformation and stores their response in a HashMap.
        public void studentInfo(String key, Scanner input){
        System.out.printf("Please enter the student's %s", key);
        if (input.hasNext())
        student.put(key, input.next());
        }

        public void studentPrint(){

        // Print the student's attributes.
        student.forEach((attribute, value) -> {
        System.out.println(
        String.format("The student's %s is %s.", attribute, value));
        });
        }

        public void studentConfirm(){

        /* Create a function that accepts a Scanner and a message to print,
         * and returns the value the user enters for confirmation.
         *
         * Refactor the code below to use this function. */
        String confirmation = "";
        System.out.print("Is this information correct? (Y/n) ");



        if (input.hasNext()) {
        confirmation = input.next();

        if (!confirmation.equals("Y")) {
        System.out.println("Try reentering the student's information.");
        continue;
        } else {
        // Add the student to our list...
        students.add(student);

        // ...Reset the confirmation value and prompt the user again...
        confirmation = "";
        System.out.print("Would you like to add another student? (Y/n) ");

        if (input.hasNext()) {
        confirmation = input.next();

        if (confirmation.equals("Y")) {
        continue;
        } else {

        // Move this into a function that accepts an ArrayList or Array.

        // Loop through all students in our list...
        for (HashMap<String, String> _student : students) {
        _student.forEach((attribute, value) -> {
        System.out.println(
        String.format("The student's %s is %s.", attribute, value));
        });
        }

        // ...And break.
        break;
        }
        }
        }
        }


        }

 /*
 *   3. Create a function that accepts a list of student HashMaps and prints
 *      all the keys/values of each one.
 *
 */
 public void createStudent(){
        // Wrap this up into a function that returns a HashMap.
        HashMap<String, String> student = new HashMap<>();
        }

public class ConsoleIO {

  public static void main(String[] args) {

    // Initialize the Scanner we'll need, and the list we'll populate.
    Scanner input = new Scanner(System.in);
    ArrayList<HashMap<String, String>> students = new ArrayList<>();

    // As long as the user wants to interact with the program...
    while (true) {

      HashMap<String, String> student = createStudent();

      String[] keys = {"first", "last", "middle initial", "address", "email", "phone number"}

      for (String key : keys){

        studentInfo(String key, Scanner input);

      }

      // ---- PRINT  ----
      studentPrint();

      studentConfirm();



    }
  }

}
