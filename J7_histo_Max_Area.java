import java.util.*;;

public class J7_histo_Max_Area {
    public static void maxArea(int [] height){
        int maxarea=0;
        int nsl []=new int[height.length];
        int nsr []=new int[height.length];
        //next smaller right-----
        Stack <Integer> s=new Stack<>();
        for(int i=height.length-1; i>=0; i--){
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=height.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left-----
        s=new Stack<>();
        for(int i=0; i<height.length; i++){
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //area-----width=nsr[i]-nsl[i]-1
        for(int i=0; i<height.length; i++){
            int h=height[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=h*width;
            maxarea=Math.max(maxarea, currArea);
        }
        System.out.println("maximun area is "+ maxarea);
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }

}
