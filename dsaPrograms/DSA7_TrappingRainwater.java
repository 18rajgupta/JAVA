package dsaPrograms;
public class DSA7_TrappingRainwater {
    static int tarppingRainwater(int height[]) {
        //CALCULATE LEFT MAX BOUNDARY - ARRAY
        int n = height.length;
        int leftMax[] = new int[n];        //AUXILLIARY ARRAY...
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //CALCULATE RIGHT MAX BOUMDARY - ARRAY
        int rightMax[] = new int[n];       //AUXILLIARY ARRAY...
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //LOOP
        int trappedWater = 0;
        int waterlevel = 0;
        for(int i=0; i<n; i++){
            waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rainwater: " + tarppingRainwater(height));
    }
}
