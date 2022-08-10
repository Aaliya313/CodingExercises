import java.util.Scanner;
//Scanners, inputs
public class Lesson3 {
    public static void main(String[] args) {
        //need to usually import the scanner
        //Capital s
        Scanner reader = new Scanner(System.in); //set up almost like a variable, reader is an object/name of variable - helps you identify your variables in you code - maintainability
        //purpose of the Scanner is to bring things in
        //input via System.in wrapped around scanner
        // dont have to declare a variable every single time, works nice of you using it for multiple values
        //String FirstName;
        //String LastName;
        //int age; //dont have to declare a variable every single time, works nice of you using it for multiple values
        //instead you can just say what the variable is directly equal to if using it once e.g.    String FirstName = reader.nextLine();
        System.out.print("What is your first name: "); //want the flashing cursor on the same line. just have print not println
        String FirstName = reader.nextLine(); //.nextLine always brings it in as a string
        System.out.print("What is your last name: ");
        String LastName = reader.nextLine();
        System.out.print("What is your age: ");
        int age = reader.nextInt();
        System.out.println("Your name is " + FirstName + " " + LastName); //cocatenatation
        int nxtYr = age + 1;
        System.out.print("Your age next year is going to be: " + nxtYr); //display age - comment out like this, explaining what your code is doing exactly.
    }
}

//String and adding them together you care cocatenating together - will read numbers as a string - will get not an added value but the strings put in
//change to int then you can cocatenate and add the values together
//casting - change a variable to a different type, will go back to at a latter date



