import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        System.out.println("Enter marks obtained :");
        int[] marks = new int[n];
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
            if(marks[i] < 35)
            System.out.println("Roll number " + marks[i] + " has got less than 35 marks.");
        }
        sc.close();

    }
}
