import java.util.*;
public class ActivitySelection{
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        //sorting on the basis of end time
        int[][] act = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        //          JAB END TIME SE SORT NEHI HOO
        //lambda function -> shortform 
        // Arrays.sort(act,Comparator.comparingDouble(o -> o[2])); // sorting on thr basis of column 2

        // int maxAct=1;
        // ans.add(act[0][0]);
        // int lastEnd = act[0][2];
        // for(int i=1; i<end.length; i++){
        //     if(act[i][1] >= lastEnd){
        //         maxAct++;
        //         ans.add(act[i][0]);
        //         lastEnd = act[i][2];
        //     }
        // }

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum Activiteis is : " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
    }
}