import java.util.*;
public class PascleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> ans = new ArrayList<>();
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) l.add(1);
                else l.add(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            ans.add(l);
        }
        // for(int i=2; i<n; i++){
        //     for(int j=1; j<=i-1; j++){
        //          ans.get(i).set(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
        //     }
        // }
        for(int i=0; i<n; i++){
            List<Integer> x = ans.get(i);
            for(int j=0; j<=i; j++){
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }

    }
}
