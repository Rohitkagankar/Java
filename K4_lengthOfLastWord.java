public class K4_lengthOfLastWord {
    public static int LastWordLength(String str){
        str=str.trim();
        String [] words=str.split(" ");
        String Lastword=words[words.length-1];
        return Lastword.length();

    }
    public static void main(String[] args) {
        String str=" A Man is very Cleaver ";
        int len=LastWordLength(str);
        System.out.println(len);
    }
}
