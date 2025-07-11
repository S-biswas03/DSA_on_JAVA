public class CircularArrayQueue{
    public static class circularArray{
        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                f = r = 0;
                arr[0] = val;
            }
            else if(r<arr.length-1){
                r++;
                arr[r] = val;
            }
            else if(r == arr.length-1){
                r = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Empty queue");
            }
            else {
                int val = arr[f];
                if(f==arr.length-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Empty Queue.");
            }
            else{
                return arr[f];
            }
        }
        public void display(){
            if(size==0){
                System.out.print("Empty Queue.");
            }
            else if(r>=f){
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i=f; i<=arr.length-1; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        circularArray c = new circularArray();
        c.display();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.display();
        System.out.println(c.peek());
        c.remove();
        c.display();
        c.add(5);
        c.add(6);
        c.display();
        for(int i=0; i<c.arr.length; i++){
            System.out.print(c.arr[i]+ " ");
        }
    }
}