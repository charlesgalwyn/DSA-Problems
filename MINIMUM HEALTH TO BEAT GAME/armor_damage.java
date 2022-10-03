class Main {
  public static void main(String[] args) {
    int []arr=new int[] {2,5,3,4};
    int armor=7;
    int ans =minimumHealth(arr,armor);
    System.out.println(ans);
  }
  public static int minimumHealth(int []arr,int armor){
    int yes=1;
    int no=1;
    for (int i=arr.length-1;i>=0;i--){
      int new_yes=Math.min(yes+arr[i],no+Math.max(0,arr[i]-armor));
      int new_no=no+arr[i];

      yes=new_yes;
      no=new_no;

    }
    return Math.min(yes,no);
  }
}
