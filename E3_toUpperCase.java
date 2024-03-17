public class E3_toUpperCase {
    public static String toUpperCase(String str){
        StringBuilder newstr=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        newstr.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));

            }else{
                newstr.append(str.charAt(i));
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        String str="hello , i am rohit";
        System.out.println(toUpperCase(str));

    }
}
