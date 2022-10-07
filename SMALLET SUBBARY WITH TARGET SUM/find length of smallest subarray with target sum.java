class Main {
    public static void main(String[] args) {
      int []arr=new int[]{1,2,3,4,5};
      int target=7;
      int ans = minSubArrayLen(target,arr);
      System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] nums) {
          int min=Integer.MAX_VALUE;
          int i=0;
          int j=0;
          int sum=0;
      while(i<=j && j<nums.length){
      if (sum+nums[j]>=target){
        min=Math.min(min,j-i+1);
        sum = sum-nums[i];
        i++;
      }
      else {
        sum=sum+nums[j];
        j++;
      }
      }
      return min==Integer.MAX_VALUE?0:min;
          }
  }
