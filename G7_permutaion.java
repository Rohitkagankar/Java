//string permutation(if length is 3 then permutations are 3!)
public class G7_permutaion {
    public static void permutationfun(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recorsion
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permutationfun(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="ab";
        permutationfun(str, "");
    }
}
