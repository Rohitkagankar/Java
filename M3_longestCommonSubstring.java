import java.util.HashMap;
import java.util.Map;

public class M3_longestCommonSubstring {
    public static int subString(String s){
        if(s.length()==0){
            return 0;
        }
        Map <Character,Integer> map=new HashMap<>();
        int maxLength=0;
        for(int end=0,start=0; end<s.length(); end++){
            char currChar=s.charAt(end);

            if(map.containsKey(currChar)){
                start=Math.max(start, map.get(currChar)+1);

            }
            map.put(currChar, end);
            maxLength=Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(subString(s));
    }
}
