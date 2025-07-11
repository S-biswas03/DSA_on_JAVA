//CELEBRITY DOESNT KNOWS ANYONE BUT IS KNOWN TO ALL

import java.util.*;
public class CelebrityProbem {
    public static int celebrity(int[][] m, int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n ;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            // 0-->UNKNOWN  1-->KNOWN
            if(m[v1][v2]==0){//shyaad val1 celeb ho     v2 not celeb   v1 v2 ko nehi jaanta
                st.push(v1);
            }
            else if(m[v2][v1]==0) st.push(v2);  //v2 v1 ko nahi janta
        }
        if(st.size()==0) return -1;
        int potential = st.pop();
        for(int j=0; j<n; j++){
            if(m[potential][j]==1) return -1;
        }
        for(int i=0; i<n; i++){
            if(m[i][potential]==0) continue;
            if(m[i][potential]==0) return -1;
        }
        return potential;
    }
    public static void main(String[] args) {
        int[][] m = {{0,1,0},{0,0,0},{0,1,0}};
        int n = m.length;
        System.out.println(celebrity(m,n));
    }
}
