import java.util.HashMap;
import java.util.Map;

public class K2_RomanToInteger {
    public static int RomToInt(String roman){
        Map<Character,Integer> romanValues=new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total=0;
        int prev=0;

        for(int i=roman.length()-1; i>=0; i--){
            char currChar=roman.charAt(i);
            int currVal=romanValues.get(currChar);

            if(currVal < prev){
                total-=currVal;
            }else{
                total+=currVal;
            }
            
        }
        return total;
    }
    public static void main(String[] args) {
        String roman="VII";
        System.out.println(RomToInt(roman));
    }
}
