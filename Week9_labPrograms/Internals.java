package CIE;
import java.util.Scanner;
public class Internals extends Student
{
    Scanner s=new Scanner(System.in);
    public int[] cie_marks=new int[5];
    public int i;
    public void accept_cie()
    {
        System.out.println("Enter the cie marks for five subjects");
        for (i=0;i<5;i++)
        {
            cie_marks[i]=s.nextInt();
        }
    }
}
