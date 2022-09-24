import java.util.*;
class Main{
    static int count1=0;
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			for (int h=0;h<t;h++){
			    int n=sc.nextInt();
			    int []arr=new int[n];
			    for (int k=0;k<n;k++){
			        arr[k]=sc.nextInt();
			    }
			    
			    if(sorted(arr,n)==1){
			        System.out.println(0);
			    }
			    else{
			    
			    if (arr[0]==1 || arr[n-1]==n){
			        System.out.println(1);
			    }
			    else if (arr[0]==n && arr[n-1]==1){
			        System.out.println(3);
			    }
			    else {
			        System.out.println(2);
			    }
			} 
			}
		}
    }
    public static int sorted(int[]arr,int n){
        if (n==1 || n==0){
            return 1;
        }
        if (arr[n - 1] < arr[n - 2]){
            return 0;
        }
        return sorted(arr,n-1);
    }
}