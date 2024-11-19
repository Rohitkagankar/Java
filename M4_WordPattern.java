import java.util.HashMap;
import java.util.Map;

public class M4_WordPattern {
    public static boolean isMatch(String s,String pattern){
        String [] words=s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        Map<Character,String> charToWord=new HashMap<>();
        Map<String,Character> wordToChar=new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char currChar=pattern.charAt(i);
            String word=words[i];

            if(charToWord.containsKey(currChar)){
                if(!charToWord.get(currChar).equals(word)){
                    return false;
                }
            }else{
                if(wordToChar.containsKey(word)){
                    return false;
                }
                charToWord.put(currChar, word);
                wordToChar.put(word,currChar);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="hello and hello and";
        String pattern="abab";

        System.out.println(isMatch(s,pattern));
    }
}
