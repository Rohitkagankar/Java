public class D8_strEqual {
    public static void main(String[] args) {
        String a1="rohit";
        String a2="rohit";
        String a3=new String("rohit");
        if(a1==a2){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(a1==a3){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }


        if(a1.equals(a3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        
    }
}
