import java.util.*;
public class LargestRectangularArea {
    public static int largestArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
                //CALCULATE NSE
        st.push(n-1);
        nse[n-1] = n;
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek(); 
            st.push(i);
        }
        System.out.println();
        for(int ele:nse){
            System.out.print(ele+ " ");
        }
        while(st.size()>0) st.pop();    //EMPTY THE STACK
                //CALCULATE PSE
        st.push(0); 
        pse[0] = -1;
        for(int i=1; i<n; i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        System.out.println();
        for(int ele:pse){
            System.out.print(ele+ " ");
        }
                //MAXIMUM AREA OF RECTANGLE
        int max = -1; 
        for(int i=0; i<n; i++){
            int area = heights[i]*(nse[i]-pse[i] - 1);
            max = Math.max(max,area);
        }
        return max;
    }
    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        int ans = largestArea(heights);
        System.out.println();
        System.out.println(ans);
    }
}
