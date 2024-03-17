public class D7_disStr {
    public static void minDist(String str){
        // int i=0;
        int x=0;
        int y=0;
        for(int i=0; i<str.length(); i++){
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }

            //using if else also we can this problem----
        }
        int mindistance=(x*x)+(y*y);
        float dist=(float)Math.sqrt(mindistance);
        System.out.println(dist);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        minDist(str);
    }
}
