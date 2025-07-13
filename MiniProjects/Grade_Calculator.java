package MiniProjects;
import java.util.*;
public class Grade_Calculator {
    public static void GradeOfStudent(float percentage){
        if(percentage>=90) System.out.println("A");
        else if(percentage<=90 && percentage>80) System.out.println("B");
        else if(percentage<=80 && percentage>70) System.out.println("C");
        else if(percentage<=70 && percentage>60) System.out.println("D");
        else if(percentage<=60 && percentage>50) System.out.println("E");
        else System.out.println("F");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter students name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter maks obtained in Maths: ");
        int maths_Marks = sc.nextInt();
        System.out.println("Enter maks obtained in Physics: ");
        int physics_Marks = sc.nextInt();
        System.out.println("Enter maks obtained in Chemistry: ");
        int chemistry_Marks = sc.nextInt();
        System.out.println("Enter maks obtained in Biology/Computer Sc.: ");
        int biology_Or_Computer_Marks = sc.nextInt();
        System.out.println("Enter maks obtained in English: ");
        int english_Marks = sc.nextInt();

        System.out.println("Enter total marks : ");
        int totalMarks = sc.nextInt();

        float marksObtained = (maths_Marks + physics_Marks + chemistry_Marks + biology_Or_Computer_Marks + biology_Or_Computer_Marks);
        System.out.println("Marks obtained by the student : " + marksObtained);
        
        float percentage = (marksObtained/totalMarks)*100;
        System.out.println("Percentage of marks obtained by the student : " + percentage + "%");

        GradeOfStudent(percentage);
    }
}
