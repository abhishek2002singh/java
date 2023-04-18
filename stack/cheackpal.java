import java.util.Stack;

public class cheackpal {
    public static boolean checkpalindrom(String str) {
        Stack<Integer>st=new Stack<>();
        if(str.length()==0||str.length()==1)
        {
            //System.out.println("string are palindrom");
            return true;
        }
        int i=0;
        
        while(str.charAt(i)!='x')
        {
             st.push((int)str.charAt(i));
             i++;
        }
        i++;
        while(i<str.length())
        {
            if(st.isEmpty())
            {
                return false;
            }
            if(str.charAt(i)!=st.peek())
            {
                return false;
            }
            st.pop();
            i++;
        }
        return true;
    }
    public static void main(String args[]) {
        String str="apmb";
        if(checkpalindrom(str))
        {
            System.out.println("palindrom");
        }

        else{
            System.out.println("not palindrom");
        }
        
    }
}
