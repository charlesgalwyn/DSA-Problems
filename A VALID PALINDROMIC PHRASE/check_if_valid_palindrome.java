class Main {
  public static void main(String[] args) {
      String s = " A man, a plan, a canal: Panama ";
      if (check(s)){
        System.out.println("Yes");
      }
      else {
        System.out.println("No");
      }
      
    }
    public static boolean check(String s){
      s=s.toLowerCase();
      //to replace the characters 
      s=s.replaceAll("[^a-z0-9]","");
      for (int i=0,j=s.length()-1;i<j;i++,j--){
        if (!(s.charAt(i)==s.charAt(j))){
          return false;
        }
      }
      return true;
    }
  }
