public class MaximumSixNine {
    static int maximum(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(nums));
    }

    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum(num));
    }
}
