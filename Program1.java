// Stephen Reader
// 10552526

// Import
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program1
{
    public static void main(String[] args)
    {
        // Create an ArrayList to hold information from file
        List<String> numArray = new ArrayList<String>();

        // Create file (set to null)
        File theFile = null;

        // Used for command line args
        if (0 < args.length)
        {
            // Set file to arg
            theFile = new File(args[0]);

            // Had to add try and catch, or else couldn't use javac in command line
            try
            {
                // Use scanner to get into file
                Scanner scanner = new Scanner(theFile);

                // Used to increment position in array
                while (scanner.hasNextInt())
                {
                    // Add int to array
                    numArray.add(scanner.next());
                }
                // Done with scanner
                scanner.close();
            }
            catch(IOException exc)
            {
                System.out.println("I/O Error: " + exc);
            }
        }
        else
        {
            // Error println output...Kill program
            System.err.println("Not enough args. Given: " + args.length);
            System.exit(0);
        }

        // Turn the data in the ArrayList into a String
        // Doing this makes it much easier for me in Program2
        String listString = String.join(" ", numArray);

        // Send string to console (Program2 will pick it up)
        System.out.println(listString);

    }// End main()
}// End class Program1