package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {

//         Print out a running total of all the
//         values in the input file.
        //System.out.println("Working Directory = " + System.getProperty("user.dir”))
            try {
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));
                int sum =0;
                while (fileIn.hasNext())
                {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] input = lineIn.split(",");

                    for (int i = 0; i < input.length; i ++) {

                        sum += Integer.parseInt(input[i]);

                        System.out.println("Running total = " + sum);
//                        PrintWriter fileOut = new PrintWriter("output.txt");
//                        // Write text just like we would to the console
//                        fileOut.println("Running total = " + sum);
                        // Clode out file

                    }
//                    fileOut.close();
                    //System.out.println(sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
//            Running total = 4
//            Runnint total = 14
//            Running total = 17

//...
        }
    };


