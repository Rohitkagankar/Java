public class E1_largeString {
    public static void main(String[] args) {
        String Fruits[]={"mango","apple","banana","orange"};
        String large=Fruits[0];
        for(int i=1; i<Fruits.length; i++){
            if(large.compareToIgnoreCase(Fruits[i])<0){
                large=Fruits[i];
            }
        }
        System.out.println(large);
    }
}
