import java.util.Scanner;

public class CreateLoginExerciseL3 {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password!";
        Scanner reader = new Scanner(System.in);
        System.out.print("Username: ");
        String UsernameUser = reader.nextLine();
        System.out.print("Password: ");
        String PasswordUser = reader.nextLine();

        if(UsernameUser.equals(username) && PasswordUser.equals(password)); //if statement both user username and password have to equal the set values
        {
            System.out.println("You have been validated!"); //print statement associated with the if statement

            //else if (UsernameUser.equals(username) ! PasswordUser.equals(password)){
            //System.out.println("Wrong password and username"); //print statement
            //System.out.println("Enter Username and password again: "); //where do you from here if the user has entered the username and password incorrectly
            //if (UsernameUser.equals(username) && PasswordUser.equals(password)); { //enter in another if statement, same as the first. LOOPS needed.
            //LOOPS -x3 for STRETCH EXERCISE, embed another if statement - reach the limit of three times = SOUT("You have been banned!");
            //System.out.println("You have been validated!"); //print statement
            //}

        } else { //for some reason, that I cannot work out, it is not letting me run my code because there is something wrong with the else statement but I don't know what
            System.out.println("Access not authorised."); //print statement for else
        }





        //Minimum task
        //create a login script
        //take a username
        //take a password from user
        //compare both to the above
        //if they match display "You have been validated!"
        //if they don't match display "Access noy authorised"

        //Extension
        //validate the input of the username
        // if they press return without keying any value
        //ask the user to enter a username
        //use a loop

        //Stretch
        //if the user enters wrong information 3 x
        //display "You have been banned!"


    }
}
