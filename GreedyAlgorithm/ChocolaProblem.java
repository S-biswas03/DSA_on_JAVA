import java.util.*;
public class ChocolaProblem{
    public static void main(String[] args){
        int n=4 , m=6;
        Integer[] costVer = {2,1,3,1,4};    //m-1 m = number of col
        Integer[] costHor = {4,1,2};     //n-1   n = number of rows

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            if(costHor[h] >= costVer[v]){   //horizontal cuts
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
            else{   //vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;  
            }
        }

                //LAST ME KOI CUT REH JAYE TO USKE LIYA 
        while(h < costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }
        while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts : " + cost);
    }
}