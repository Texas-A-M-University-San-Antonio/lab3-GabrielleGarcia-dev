/**
 * Name: Gabrielle Garcia
 * Date:  9 September 2025 
* Purpose: InClass 3 - This program will take user input as the side of the cube, then
  calculate the volume and surface area.
 */
import java.util.Scanner; // Don't forget to import and declare a Scanner for user input.

public class InClass3_Gabrielle_Garcia
{
    public static void main(String[] args) 
    {
     
        Scanner input = new Scanner(System.in);

        
        // In-Class 3 Example:
        double side, volume, surfaceArea;
        // Step 1: Prompt the user to enter the length of the side of a cube.
        


        System.out.print("Please enter the length of the cube's side: ");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble(); // side is input by the user 


        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6 * Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface are of the cube is " + surfaceArea);
    }

}