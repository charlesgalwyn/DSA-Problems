import java.util.*;
class Main {
  public static void main(String[] args) {
    int []arr=new int[] {6,2,6,5,1,2};
    int ans =arrayPairSum(arr);
    System.out.println(ans);
  }
  public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = 0;
        for (int i = 0; i < len - 1; i += 2) {
            result += nums[i];
        }
        return result;
    }
}