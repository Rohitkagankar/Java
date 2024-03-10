public class N_PaternDrawing {
 public static void main(String[] args) {
    for (int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    int n=5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }

    n=5;
    char ch ='A';
    for (int line=1; line<=n; line++){
        for (int j=1; j<=line; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
 }   
}
