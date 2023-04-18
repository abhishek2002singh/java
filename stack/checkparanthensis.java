import java.util.*;
public class checkparanthensis {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        String str=src.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    System.out.println("not valid paranthensis");
                    return;
                }
                if((st.peek()=='('&&ch==')')||(st.peek()=='{'&&ch=='}')||(st.peek()=='['&&ch==']'))
                {
                     st.pop();
                }
                else{
                    System.out.println("not valid paranthesis");
                    return;
                }
            } 

        }
        if(st.isEmpty())
        {
            System.out.println("valid paranthesis");
        }
        else
        {
            System.out.println("not valid paranthesis");
        }
        
    }
}
