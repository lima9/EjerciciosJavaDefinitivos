package TestInicial;

import java.util.Scanner;

/**
 * Created by lima on 2/18/16.
 */
public class GradeBookTest
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Initially called?");
        String InitialName = input.nextLine();
        GradeBook myGradeBook = new GradeBook("Simios");
        System.out.printf("Firstly: %s\n", myGradeBook.getCourseName());
        myGradeBook.setCourseName(InitialName);


        System.out.printf("Initially called: %s\n\n",
                myGradeBook.getCourseName());


        System.out.println("Course Name?");
        String NameOfCourse = input.nextLine();
        myGradeBook.setCourseName(NameOfCourse);
        System.out.println();
        myGradeBook.displayMessage();
        myGradeBook.DetermineClassAverage();
    }
}



