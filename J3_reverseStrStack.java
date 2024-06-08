//reverse a string using stack-----
import java.util.*;

public class J3_reverseStrStack {
    public static String reString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;

        }
        StringBuilder newStr =new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            newStr.append(curr);
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reString(str));
    }
}
