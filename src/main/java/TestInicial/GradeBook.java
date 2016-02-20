package TestInicial;

import java.util.Scanner;

/**
 * Created by lima on 2/18/16.
 */
public class GradeBook {

    private String CourseName;

    private int Total;
    private int gradeCounter;
    private int ACount;
    private int BCount;
    private int CCount;
    private int DCount;
    private int ECount;
    private int FCount;

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

    public void InputGrades()
    {
        Scanner input = new Scanner(System.in);

        int Grade;

        System.out.printf("%s\n",
                "Enter in 0-10 range");

        while (input.hasNext())
        {
            Grade = input.nextInt();
            Total += Grade;
            ++gradeCounter;

            IncrementLetterGradeCounter(Grade);
        }


    }

    private void IncrementLetterGradeCounter(int Grade)
    {
        switch (Grade)
        {
            case 10: ++ACount;
                break;
            case 9:  ++BCount;
                break;
            case 8:  ++CCount;
                break;
            case 7:  ++DCount;
                break;
            case 6:  ++ECount;
                break;
            case 5:  ++FCount;
                break;

        }
    }

    public void DisplayGradeReport()
    {
        System.out.println("\nGrade Report:");

        if (gradeCounter != 0)
        {
            double average = (double) Total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d\n",
                    gradeCounter, Total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A: ", ACount,
                    "B: ", BCount,
                    "C: ", CCount,
                    "D: ", DCount,
                    "E: ", ECount,
                    "F: ", FCount );
        }
        else
            System.out.println("No grades entered!");
    }

}
