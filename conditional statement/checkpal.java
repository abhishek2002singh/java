public class checkpal {

public static void checkpalindrom(String str) {
      int i=0;
      int j=str.length()-1;
      while(j>i&&(str.charAt(i)==str.charAt(j)))
      {
          i++;
          j--;
      }    
      if(j>i)
      {
        System.out.println("not palindrom");
        
      }
      else
      {
        System.out.println(" palindrom");
        
      }
}

    public static void main(String args[]) {
        String str="ba";
        checkpalindrom(str);
    }
}
