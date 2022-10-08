class Main{
    public static void main(String[] args)
    {
        
        String word = "All-convoYs-9-be:Alert1.";
        int k = 4;
        int n=word.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; ++i) {
            sb.append(encryptChar(word.charAt(i), k));
        }
        
        System.out.println(sb.toString());
    }
    public static char encryptChar(char c, int k) {
        if (Character.isDigit(c)){
            int num = c -'0';
            int ans =num+k;
            int ans1= ans%10;
            char h= (char)(ans1+ '0');
            
            return h;
        }
        if(!Character.isAlphabetic(c)){ 
            return c;
        }
        int base = Character.isLowerCase(c) ? 'a' : 'A';
        return (char)((c + k - base) % 26 + base);
    }
}
