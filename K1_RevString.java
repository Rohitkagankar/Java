public class K1_RevString {
    public static String ReverseString(String str){
        // int start=0;
        int end=str.length()-1;
        StringBuilder newStr=new StringBuilder();
        while(0<=end){
            char temp=str.charAt(end);
            newStr.append(temp);
            end--;
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str="123";
        System.out.println(ReverseString(str));
    }
}
