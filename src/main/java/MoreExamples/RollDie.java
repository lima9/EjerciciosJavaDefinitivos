package MoreExamples;
import java.util.Random;

public class RollDie
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random();
        int frq1 = 0;
        int frq2 = 0;
        int frq3 = 0;
        int frq4 = 0;
        int frq5 = 0;
        int frq6 = 0;

        int face;

        for (int roll = 1; roll <= 600000000; roll++)
        {

            face = 1 + randomNumbers.nextInt(6);

            switch (face)
            {
                case 1:
                    ++frq1;
                    break;
                case 2:
                    ++frq2;
                    break;
                case 3:
                    ++frq3;
                    break;
                case 4:
                    ++frq4;
                    break;
                case 5:
                    ++frq5;
                    break;
                case 6:
                    ++frq6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                frq1,frq2, frq3, frq4, frq5, frq6);
    }
}
