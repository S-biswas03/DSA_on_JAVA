public class searchInRotatedSortedArray {
    public static int searchEle(int[] arr, int si, int ei,int target){
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]==target) return mid;
            //mid on L1
            if(si<=mid){
                //case 1 left
                if(arr[si] <= target && target <= arr[mid]){
                    return searchEle(arr, si, mid-1, target);
                }
                else{//case 2 right
                    return searchEle(arr, mid+1, ei, target);
                }
            }
            //mid on line 2
            else{
                //case 3 right
                if(arr[mid] <= target && target <= arr[ei]){
                    return searchEle(arr, mid+1, ei, target);
                }
                else{// case 4
                    return searchEle(arr, si, mid-1, target);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int n = arr.length;
        int targetIdx = searchEle(arr,0,n-1,0);
        System.out.println(targetIdx);
    }
}
