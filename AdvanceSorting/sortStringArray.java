public class sortStringArray {
    public static boolean isAlphabeticalySmall(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        else return false;
    }
    public static String[] merge(String[] arr1, String[] arr2, String[] arr){
        int i=0, j=0, k=0 ;
        while(i<arr1.length && j<arr2.length){
            if(isAlphabeticalySmall(arr1[i], arr2[j])){
                arr[k++] = arr1[i++];
            }
            else arr[k++] = arr2[j++];
        }
        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr[k++] = arr2[j++];
        }
        return arr;
    }

    public static String[] mergeSort(String[] arr){
        int n = arr.length;
        if(n==1) return arr;
        String[] arr1 = new String[n/2];
        String[] arr2 = new String[n-n/2];
        for(int i=0; i<n/2; i++) arr1[i] = arr[i];
        for(int i=0; i<n-n/2; i++) arr2[i] = arr[i+n/2];
        mergeSort(arr1);
        mergeSort(arr2);

        return merge(arr1, arr2, arr);

    }
    public static void main(String[] args){
        String[] arr = {"sun","earth","mars","mercury"};
        mergeSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
