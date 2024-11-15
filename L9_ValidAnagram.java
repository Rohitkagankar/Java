import java.util.Arrays;

public class L9_ValidAnagram {
    public static boolean validAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        char [] schar=s.toCharArray();
        char [] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);

        return Arrays.equals(schar, tchar);
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

        System.out.println(validAnagram(s,t));
    }
}
