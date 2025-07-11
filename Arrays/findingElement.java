import java.util.Scanner;
public class findingElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attay size : ");
        int n = sc.nextInt();
        System.out.print("Enter elments of the array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        sc.close();
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.println("Enterd element is present in the array.");
        else System.out.println("Element is not present in the given array.");
    }

}
