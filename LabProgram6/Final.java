import CIE.*;
import SEE.*;
import  java.util.Scanner;
public class Final
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of students:");
        n=s.nextInt();
        // CIE.Student[] st=new CIE.Student[n];
        CIE.Internals[] in=new CIE.Internals[n];
        SEE.External[] ex=new SEE.External[n];
        for (i=0;i<n;i++)
        {
            // st[i]=new CIE.Student();
            in[i]=new CIE.Internals();
            ex[i]=new SEE.External();
            in[i].accept();
            in[i].accept_cie();
            ex[i].accept_see();
        }
        for (i=0;i<n;i++)
        {
            in[i].display();
            for (j=0;j<5;j++)
            {
                System.out.println("Final marks in subject"+(j+1)+" : "+(in[i].cie_marks[j]+((ex[i].see_marks[j])/2.0)));
            }
            System.out.println();
        }
    }
}
