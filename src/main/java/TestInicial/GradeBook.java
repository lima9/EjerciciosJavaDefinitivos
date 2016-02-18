package TestInicial;

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


    public void displayMessage()
    {
        System.out.printf("Welcome to this example the course is:\n%s!\n",
                getCourseName());

    }

    public void setCourseName(String name)
    {
        CourseName = name;
    }
}
