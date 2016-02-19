package TestInicial;

import java.util.Scanner;

/**
 * Created by lima on 2/18/16.
 */
public class GradeBook {

    private String CourseName;

    //Constructor to initialize variable so it won't be null
    public GradeBook(String Name)
    {
        CourseName = Name;
    }

    public String getCourseName()
    {
        return CourseName;
    }

    public void setCourseName(String name)
    {
        CourseName = name;
    }

    public void displayMessage()
    {
        System.out.printf("Welcome to this example the course is:\n%s!\n",
                getCourseName());
    }

    public void DetermineClassAverage()
    {
        Scanner input = new Scanner(System.in);

        int Total;
        int GradeCounter;
        int Grade;
        double Average;

        Total = 0;
        GradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        Grade = input.nextInt();

        while ( Grade != -1)
        {
            Total = Total + Grade;
            GradeCounter = GradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            Grade = input.nextInt();
        }

        if (GradeCounter != 0)
        {
            Average = (double) Total / GradeCounter;

            System.out.printf("\nTotal of all %d grades is %d\n", Total, GradeCounter);
            System.out.printf("Class average is %.2f\n", Average);
        }
        else
            System.out.println("No grades entered");

    }
}
