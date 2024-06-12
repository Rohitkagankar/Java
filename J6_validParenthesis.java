import java.util.Stack;

public class J6_validParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            if(curr=='(' || curr=='{' || curr=='['){
                s.push(curr);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && curr==')') || (s.peek()=='[' && curr==']') || (s.peek()=='{' && curr=='}')){
                    s.pop();
                }else{
                    return false;
                }
            }

        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack <Character> s=new Stack<>();

        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            
            if(curr==')'){
                int count=0;
                while(s.pop() != '('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="[{()}]";
        String str1="((a+b))";
        System.out.println(isValid(str));
        System.out.println(isDuplicate(str1));


    }
}
