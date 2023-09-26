import java.util.ArrayList;
import java.util.Scanner;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Object> rectangles = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();

        Object Input;

        System.out.print("Enter 10 perimeters");

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Rectangle number " + (i + 1));
            Input = SafeInput.getInt(in, "Enter the perimeter");
            rectangles.add(Input);
        }
        ArrayList<Object> rPassed = new ArrayList<>();



        System.out.println("\nEntered perimeters: ");
        for(int i = 0; i < rectangles.size(); i++)
        {
            System.out.println((i + 1) + ": " + rectangles.get(i));
        }
        System.out.print("\nThe following perimeters passed: ");
        for (Object passed : rPassed)
        {
            System.out.println(passed);
        }
    }
}