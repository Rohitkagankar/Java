public class E6_bitEvenOrOdd {
    public static void evenOdd(int n){
        int bit=1;
        if((n & bit)==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even.");
        }
    }
    //get bit at i-th position----
    public static int getIthBit(int num,int i){
        int bit=1<<i;
        if((num & bit)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //set bit at i-th position-----
    public static int setIthBit(int num,int i){
        int bit=1<<i;
        return num | bit;
    }

    //clear ith bit----
    public static int clearBit(int num,int i){
        int bitmask=~(1<<i);
        return num & bitmask;
    }

    //update ith bit ----
    public static int updateIthBit(int num, int i,int j){
        // if(j==0){
        //     return clearBit(num, i);
        // }else{
        //     return setIthBit(num, i);
        // }
        num=clearBit(num, i);
        int newbitmask=j<<i;
        return num |newbitmask;
    }

    //clear last ith bits
    public static int clearLastBits(int num, int i){
        int bitmask=(~0)<<i;
        return num & bitmask;
    }
    //clear bits in range
    public static int clearBitsInRange(int num, int i,int j){
        int a=(~0)<<j+1;
        int b=1<<i-1;
        int bitmask=a|b;
        return num & bitmask;
    }

    //is power of 2
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    
    //count set bits----
    public static int setBits(int n){
        int count=0;
        while (n>0) {
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    //fast exponential-----
    public static int fastExpo(int a, int n){
        int ans=1;
        while (n>0) {
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int n=5;
        evenOdd(4);

        //get ith position
        System.out.println(getIthBit(10, 3));

        //set ith position----
        System.out.println(setIthBit(10, 2));

        //clear ith bit ----
        System.out.println(clearBit(10, 1));

        //update ith bit ----
        System.out.println(updateIthBit(10, 1, 0));

        //clearLastBits------
        System.out.println(clearLastBits(15,2));

        //clear bits in range
        System.out.println(clearBitsInRange(15, 1, 2));

        //is power of 2
        System.out.println(isPowerOfTwo(4));

        //count set bits----
        System.out.println(setBits(15));

        //fast exponential-----
        System.out.println(fastExpo(3, 5));
    }

}
