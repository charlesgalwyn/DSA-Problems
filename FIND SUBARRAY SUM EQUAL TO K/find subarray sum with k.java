import java.util.*;
class Main{
    public static void main(String [] args){
            int n=5;
            long k=3;
            long arr[]=new long[]{1,2,1,3,4};
             boolean flag=false;
            long sum=0,value=0;
            HashMap<Long,Long>h=new HashMap<Long,Long>();
           h.put(sum,value);
            for(int k1=0;k1<n;k1++){
                sum+=arr[k1];
                value=sum-k;
            if(h.containsKey(value))
                {
                    flag=true;
                    break;
                }
                h.put(sum,value);
            }
           if(flag){
                    System.out.println("Yes");
                    }
                else
                System.out.println("No");
    }
}
