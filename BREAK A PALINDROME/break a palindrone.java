class Main {
    public static void main(String[] args) {
        String s = " abccba ";
        String ans =breakPalindrome(s);
        System.out.println(ans);
    }
    public static String breakPalindrome(String s) {
        char arr[]=s.toCharArray();
        int n=s.length();
        if (n==1){
            return "";
        }
        for (int i=0;i<n/2;i++){
            if (arr[i]!='a'){
                arr[i]='a';
                return String.valueOf(arr);
            }
        }
        arr[n-1]='b';
        return String.valueOf(arr);

}
}