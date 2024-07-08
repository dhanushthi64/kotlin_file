import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int len2 = nums2.length;
        for (int i = len2 - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nextGreater.put(nums2[i], st.peek());
            } else {
                nextGreater.put(nums2[i], -1);
            }
            st.push(nums2[i]);
        }
        int len1 = nums1.length;
        int[] res = new int[len1];
        for (int j = 0; j < len1; j++) {
            res[j] = nextGreater.getOrDefault(nums1[j], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] res = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i]);
        }
    }
}
