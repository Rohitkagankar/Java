public class M6_AddBinary {
    public static String AddBinary(String s1, String s2){
        StringBuilder result=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;

        while(i >=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=s1.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=s2.charAt(j--)-'0';
            }
            result.append(sum%2);
            carry=sum/2;
        }
        if(carry !=0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s1="101";
        String s2="1";
        System.out.println(AddBinary(s1,s2));
    }
}
