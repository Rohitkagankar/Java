public class G1_recursion {

    //print 1 to n numbers in reverse order-----
    public static void recorReverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        recorReverse(n-1);
    }
    //print 1 to n numbers-----
    public static void recInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        recInc(n-1);
        System.out.print(n+" ");
    }

    //print factorial of given number-----
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fa=n * fact(n-1);
        return fa;
    }
    //print sum of n natural numbers------
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum=n+sum(n-1);
        return sum;
    }

    //print fibonacii series-----
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fiboseq=fibo(n-1)+fibo(n-2);
        return fiboseq;
    }
    //print array is sorted or not ------
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //print index of element if exist in array
    public static int EleInd(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== key){
            System.out.println(key+" is present at index "+i);
            return i;  
        }
        return EleInd(arr, i+1, key);
    }

    //print last occurance of number----
    public static int lastIndx(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastIndx(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    //print x raised to power value-----
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x *power(x, n-1);
    }
    //optimised solution for power ----
    public static int optPower(int a,int n){
        if(n==0){
            return 1;
        }
        int half=optPower(a, n/2);
        int halfSqr=half*half;
        if(n%2!=0){
            halfSqr=a * halfSqr;
        }
        return halfSqr;
    }
    //tilling problem------
    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //horizontal
        int hori=tillingProblem(n-2);
        
        //vertical
        int vert=tillingProblem(n-1);

        int total=hori+vert;
        return total;
    }
    //remove duplicates from string------
    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx ==str.length()){
            System.out.println(newstr);
            return;
        }
        
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[curr-'a']=true;
            removeDuplicate(str, idx+1, newstr.append(curr), map);
        }
    }

    //friends pairing problem-----
    public static int friendParing(int n){
        if(n==1 || n==0){
            return 1;
        }
        //single pairing
        // int single=friendParing(n-1);

        // //double pairing
        // int pair=friendParing(n-2);
        // int doublepair=(n-1)*pair;

        // int totalpairs=single+doublepair;
        // return totalpairs;
        return friendParing(n-1)+(n-1)*friendParing(n-2);
    }
    //print binary string (not consecutive one's)------
    public static void printBinary(int n, int last, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinary(n-1, 0, str+'0');
        if(last==0){
            printBinary(n-1, 1, str+'1');
        }
    }
    public static void main(String[] args) {
       //print 1 to n numbers in reverse order-----
       int a=10;
       recorReverse(a);
       System.out.println();

       //print 1 to n numbers-----
       int b=15;
       recInc(b);
       System.out.println();

       //print factorial of given number-----
       int n=5;
       System.out.println("factorial is "+fact(n));

       //print sum of n natural numbers------
       int p=5;
       System.out.println("sum is "+sum(p));

        //print fibonacii series-----
        int f=7;
        System.out.println(fibo(f));

        //print array is sorted or not ------
        int arr[]={1,2,3,4,5,6};
        System.out.println(isSorted(arr, 0));

        //print index of element if exist in array
        int arr1[]={1,2,3,4,5,6};
        System.out.println(EleInd(arr1, 0,6));

       //print last occurance of number----
       int arr2[]={1,2,3,4,5,6,5,0,5,7};
       System.out.println(lastIndx(arr2, 5, 0));

       //print x raised to power value-----
       System.out.println(power(2, 2));

       //optimised solution for power ----
       System.out.println(optPower(2, 5));

       //tilling problem------
        System.out.println(tillingProblem(3));

        //remove duplicates from string------
        String str="rrrrkkkkk";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

        //friends pairing problem----------
        System.out.println(friendParing(3));

        //print binary string (not consecutive one's)------
        printBinary(3, 0, "");
        printBinary(5, 0, "");
    }
}

