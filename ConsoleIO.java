package console;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class ConsoleIO {

    static void studentInfo(String key, Scanner input, HashMap<String, String> student){
        System.out.printf("Please enter the student's %s",key);
        if(input.hasNext()){
            student.put(key,input.next());
        }
    }

    public static void studentPrint(HashMap<String, String> student){

        student.forEach((attribute,value)->{
            System.out.println(
                    String.format("The student's %s is %s.",attribute,value));
        });
    }

    public static String studentConfirm(Scanner input,String message) {

        String confirm="";
        System.out.printf("%s (Y/N) ", message);

        if (input.hasNext()){
            confirm=input.next();
        }
        return confirm;
    }

    public static HashMap<String, String> createStudent(){
        // Wrap this up into a function that returns a HashMap.
        return new HashMap<String, String>();
    }


    public static void main(String[] args) {

        // Initialize the Scanner we'll need, and the list we'll populate.
        Scanner input = new Scanner(System.in);
        ArrayList<HashMap<String, String>> students = new ArrayList<>();

        // As long as the user wants to interact with the program...
        while (true) {

            HashMap<String, String> student = createStudent();

            String[] keys = {"first", "last", "middle initial", "address", "email", "phone number"};

            for (String key : keys) {

                studentInfo(key, input, student);

            }

            String message = "Would you like to add another Student";
            String confirm = studentConfirm(input, message);

            if(confirm.equals("N")){
                System.out.println("okay byeee!");
                studentPrint(student);
                break;
            } else {
                System.out.println("You don't want do do that!");
            }

            // ---- PRINT  ----
            //studentPrint();
/*
            String message = "Is all of this information true?";
            studentConfirm(message,input);

            if(studentConfirm.equals("Y")){
                System.out.println("Great thanks bud!");
            } else {
                System.out.println("You're spare parts bud!");
            }

            String message = "Would you like to add another Student";
            studentConfirm();

            if(studentConfirm.equals("Y")){
                System.out.println("okay byeee!");
            } else {
                System.out.println("You don't want do do that!");
            }
*/
        }
    }

}
