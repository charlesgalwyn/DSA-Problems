import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]s=new int[n+1];
        s[0]=0;
        for (int i=0;i<=n;i++){
            int c= sc.nextInt();
            int t= sc.nextInt();
            s[i]=s[i-1]+ (c*t);
        }
        for (int j=1;j<=m;j++){
            int song=1;
            int v=sc.nextInt();
            while (v>s[song]){
                song++;
            }
            System.out.println(song);
        } 
        }
}
