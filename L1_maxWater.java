public class L1_maxWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int height [] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
