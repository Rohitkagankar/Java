public class D9_subString {
    public static void pSubString(String str, int start,int end){
        String newStr="";
        for(int i=start; i<end; i++){
            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String str="hello world";
        pSubString(str, 0, 5);

    }
}
