import java.util.Arrays;

public class K5_LongestCommonPrefix {
    public static String CommonPrefix(String [] str){
        Arrays.sort(str);
        String str1=str[0];
        String str2=str[str.length-1];
        int index=0;
        while(index < str.length){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return str1.substring(0, index);
    }
    public static void main(String[] args) {
        String [] str={"flower","flow","flag"};
        System.out.println(CommonPrefix(str));

    }
}
