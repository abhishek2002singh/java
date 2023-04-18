import java.util.*;
public class normalstack {
    public static void main(String args[]) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.print(st+" " + "\n top element is "+ " "+st.peek() +" "+ st.size());  
        st.pop(); 
        System.out.println();     
        System.out.print(st+" " + "\n top element is "+ " "+st.peek() +" "+ st.size());
    }
}
