//Stephen Reader
// 10552526

// Import
import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        // Scan for input from program1
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // Create array to hold info from program1
        int [] numArray = new int[50];
        Scanner scanner = new Scanner(input);
        int x = 0;
        while (scanner.hasNextInt())
        {
            // Add int to array
            numArray[x++] = scanner.nextInt();
        }



        // *** At this point all of the data should be in the array ***

        // Need a way to keep count of what frame the bowler is in and set score to 0 for start of game
        int frame = 0;
        int score = 0;

        // Keeps track of amount of ints used in case there are not enough ints entered for 10th frame
        int for_tenth = 0;

        // Loop through array
        for(int i = 0; i < numArray.length; i++)
        {
            // Make sure that the frame is 1-9
            if(frame < 9)
            {
                // If a throw is a strike
                if (numArray[i] == 10)
                {
                    score = score + numArray[i] + numArray[i+1] + numArray[i+2];
                    frame++;
                    for_tenth++;
                }
                // If throw is a spare
                else if(numArray[i] != 0 && numArray[i+1] != 0 && numArray[i]+numArray[i+1] == 10 && frame < 10)
                {
                    score = score + numArray[i] + numArray[i+1] + numArray[i+2];
                    frame++;
                    i++;
                    for_tenth = for_tenth +2;
                }
                // If throw is not a strike or a spare
                else
                {
                    score = score + numArray[i] + numArray[i+1];
                    frame++;
                    i++;
                    for_tenth = for_tenth + 2;
                }
            }
        }// End for loop (frame 1-9)

        // 10th frame
        score = score + numArray[for_tenth] + numArray[for_tenth+1] + numArray[for_tenth+2];

        // Print score to console
        System.out.println("Final Game Score: " + score);
    }// End Main
}// End class
