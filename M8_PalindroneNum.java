public class M8_PalindroneNum {
    public static boolean isPalindron(int x){
        if(x <0){
            return false;
        }
        int original=x;
        int reversed=0;
        while(x !=0){
            int digit=x%10;
            if(reversed > (Integer.MAX_VALUE-digit)/10){
                return false;
            }
            reversed= reversed*10+digit;
            x/=10;
        }
        return original==reversed;
        
    }
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindron(x));
    }
}
