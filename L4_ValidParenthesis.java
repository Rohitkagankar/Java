import java.util.Stack;

class ValidParenthesis{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0; i<str.length(); i++){
            Character curr=str.charAt(i);
            if(curr=='[' || curr=='{' || curr=='('){
                s.push(curr);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='[' && curr==']' || s.peek()=='{' && curr=='}' || s.peek()=='(' && curr==')' ){
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
    public static void main(String[] args) {
       String s = "()[]{}";
       System.out.println(isValid(s));
    }
}