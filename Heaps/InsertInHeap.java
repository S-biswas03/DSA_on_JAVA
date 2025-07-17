//package Heaps;
import java.util.*;
public class InsertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val){
            arr.add(val);

            int x = arr.size()-1;   //child index
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){       //child value is less than parent   < k jagah > for max heap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int idx){
            int left = 2*idx + 1;
            int right= 2*idx + 2;
            int min = idx;

            if(left<arr.size() && arr.get(left) < arr.get(min)){        //< k jagah > for max heap
                min = left;
            }

            if(right<arr.size() && arr.get(right) < arr.get(min)){      //< k jagah > for max heap
                min = right;
            }

            if(min!=idx){
                int temp = arr.get(idx);
                arr.set(idx,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }

        }
        public int remove(){
            int data = arr.get(0);

            int x = arr.size()-1;
            //swapping 1st and last
            int temp = arr.get(0);
            arr.set(0,arr.get(x));
            arr.set(x,temp);
            //removing
            arr.remove(x);
            //make heap proper
            heapify(0);

            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){            //heap sort TC = O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
