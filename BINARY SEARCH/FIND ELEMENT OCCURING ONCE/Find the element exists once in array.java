import java.util.*;
class Main {
    public static void main(String[] args)
    {
            int n=7;
            int[]arr=new int[]{1,1,2,2,3,4,4};
            Arrays.sort(arr);
            if (n==1){
                System.out.println(arr[0]);
            }
            else if (arr[0]!=arr[1]){
		    System.out.println(arr[0]);
		    }
		    else if (arr[n-1]!=arr[n-2]){
		    System.out.println(arr[n-1]);
		    }
            else {
            int ans =ElementOccuringOnce(arr);
            System.out.println(ans);
            }
        
    }
    
    public static int ElementOccuringOnce(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] == arr[mid + 1] && mid % 2 == 0 || arr[mid] == arr[mid - 1] && mid % 2 != 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
