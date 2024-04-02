import java.util.ArrayList;
//the sum of two arrlist element is equal to target or not

public class H5_PairSumEqToTarget {

    //first approach O(n*2)
    public static boolean targetSum(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    //second approach O(n)
    public static boolean targetSumExist(ArrayList<Integer> list, int target){
        int fidx=0;
        int lidx=list.size()-1;
        while (fidx < lidx) {
            if(list.get(fidx)+list.get(lidx)==target){
                return true;
            }
            if(list.get(fidx)+list.get(lidx) < target){
                fidx++;
            }
            if(list.get(fidx)+list.get(lidx) > target){
                lidx--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target=5;
        System.out.println(targetSum(list, target));

        System.out.println(targetSumExist(list, target));

    }
}
