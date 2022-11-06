class Solution {
    public String orderlyQueue(String s, int k) {
     if (k==1){
         String ans =s;
         for (int i=0;i<s.length();i++){
             if ((s.substring(i)+s.substring(0,i)).compareTo(ans)<0){
                 ans = s.substring(i)+s.substring(0,i);
             }
         }
         return ans;
     }
     else {
         char[] ch = s.toCharArray();
         Arrays.sort(ch);
         String str = String.copyValueOf(ch);
         return str;
     }   
    }
}