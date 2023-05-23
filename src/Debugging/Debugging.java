package Debugging;

public class Debugging {
    
    public static double average(int[] nums) {
        int sum = 0;
        // to create an error I made the FOR LOOP look like "for (int i = 0; i <= nums.length; i++)"
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (double) sum / nums.length;
    }
}