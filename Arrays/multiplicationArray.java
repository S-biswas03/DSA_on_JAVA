public class multiplicationArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 16, 15, 10, 17};
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.print("The product of all the elements of the given array is : " + product);
    }
    
}
