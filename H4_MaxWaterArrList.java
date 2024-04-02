import java.util.ArrayList;


public class H4_MaxWaterArrList {

    // first approach : O(n*2)
    public static int maxWater(ArrayList<Integer> list){
        int max=0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int height=Math.min(list.get(i), list.get(j));
                int width=j-i;
                int currWater=height*width;
                max=Math.max(max, currWater);
            }
        }
        return max;
    }
    //second approach : O(n)
    public static int maxWaterVal(ArrayList<Integer> list){
        int max=0;
        int fpt=0;
        int lpt=list.size()-1;
        while (fpt<lpt) {
            int height=Math.min(list.get(fpt), list.get(lpt));
            int width=lpt-fpt;
            int currWater=height*width;
            max=Math.max(max, currWater);

            if(list.get(fpt)<list.get(lpt)){
                fpt++;
            }else{
                lpt--;
            }  
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWater(list));
        System.out.println(maxWaterVal(list));
    }
}
