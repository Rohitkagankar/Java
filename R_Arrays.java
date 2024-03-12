public class R_Arrays {
    public static void update(int m[],int nonchange){
        nonchange=10;
        for(int i=0; i<m.length; i++){
            m[i]=m[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchange=5;
        update(marks,nonchange);
        System.out.println(nonchange);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}
