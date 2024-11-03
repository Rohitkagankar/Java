public class K7_firstOccuranceOfStr {
    public static int subString(String str, String subStr){
        if(str.isEmpty()) return 0;

        int strLength=str.length();
        int subStrLength=subStr.length();

        for(int i=0; i<=strLength-subStrLength; i++){
            if(str.substring(i, i+subStrLength).equals(subStr)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="Sdiatiwdsanldsalk";
        String subStr="ati";
        System.out.println(subString(str, subStr));

    }
}
