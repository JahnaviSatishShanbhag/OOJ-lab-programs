package SEE;
import CIE.*;
import java.util.Scanner;
public class External extends CIE.Student
{
    public int[] see_marks=new int[5];
    public int i;
    Scanner s=new Scanner(System.in);
    public void accept_see()
    {
        System.out.println("Enter the see marks for five subjects");
        for (i=0;i<5;i++)
        {
            see_marks[i]=s.nextInt();
        }
    }
}
