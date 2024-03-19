import java.util.*;
public class D6_string {

    //print string function-----
    public static void printstring(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }
    //palindrone string---------
    public static boolean isPalindrone(String a){
        int n=a.length();
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i)==a.charAt(n-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char ch[]={'a','b','c','d'};
        String name;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(ch);

        //length of string
        System.out.println(name.length());
        //concatination of string
        String firstname="Rohit";
        String lastname="Kagankar";
        String fulname=firstname+ " "+lastname;
        System.out.println(fulname);
        System.out.println(fulname.charAt(0));
        printstring(fulname);

        String a="Abccba";
        System.out.println(isPalindrone(a));
    }
}
