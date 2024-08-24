public class TrapingRainwater {

    public static void trapRainWater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int totalTrapedWater = 0;

        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            totalTrapedWater += waterLevel - height[i];
        }

        System.out.println(totalTrapedWater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trapRainWater(height);
    }
}
