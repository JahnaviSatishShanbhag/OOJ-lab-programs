package CIE;
import java.util.Scanner;
public class Student{
    public String usn;
    public String name;
    public int sem;
    Scanner s=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter usn:");
        usn=s.next();
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter the semester:");
        sem=s.nextInt();
    }
    public void display()
    {
        System.out.println("Usn:"+usn);
        System.out.println("Name:"+name);
        System.out.println("Semester:"+sem);
    }
}
