import java.util.*;;

public class P_FunBinToDeci {
    public static void binToDeci(int binNo){
        int myNo=binNo;
        int pow=0;
        int dec=0;
        while(binNo>0){
            int lastDigit=binNo%10;
            dec=dec+(int)(lastDigit* Math.pow(2, pow));
            pow++;
            binNo=binNo/10;
        }
        System.out.println("dicimal of binary no "+myNo+" is "+dec);      
    }
    public static void decTobin(int d){
        int myno=d;
        int bin=0;
        int pow=0;
        while (d>0) {
            int rem=d%2;
            bin=bin+rem*(int)Math.pow(10, pow);
            d=d/2;
            pow++;    
        }
        System.out.println("decimal "+myno+" to binary is "+bin);
    }
    public static void main(String[] args) {
        binToDeci(101);
        decTobin(5);
    }
}
