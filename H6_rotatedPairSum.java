import java.util.ArrayList;
//find if pair exist which sum is equal to target in sorter rotated arraylist
public class H6_rotatedPairSum {
    
    public static boolean pairSum( ArrayList<Integer> list, int target){
        int bp=-1; //braking point
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp=i;
                break;
            }
        }
        int fidx=bp+1;
        int lidx=bp;

        while (fidx != lidx) {
            if(list.get(fidx)+list.get(lidx)==target){
                return true;
            }
            if(list.get(fidx)+list.get(lidx) < target){
                fidx=(fidx+1)% n;
            }else{
                lidx=(n+lidx-1)%  n;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target= 16;
        System.out.println(pairSum(list, target));
    }
}
