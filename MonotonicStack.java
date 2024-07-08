import java.util.*;

public class MonotonicStack {
    static void find(int[] nums1,int[] nums2){
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            m.put(nums1[i], m.getOrDefault(nums1[i], 0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            m.put(nums2[i], m.getOrDefault(nums2[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> ele:m.entrySet()){
            System.out.println("Key: "+ele.getKey()+" Value: "+ele.getValue());
        }
        List<Integer> ans = new ArrayList<>();
        for(int num:nums1){
            if(m.containsKey(num)){
                if(m.get(num)-1==0){
                    ans.add(num);
                    m.put(num, m.get(num)-1);
                }
            }
        }
        System.out.println((3749%1000)/100);
        res.add(ans);
        // for(int i=0;i<nums1.length;i++){
        //     m.put(nums1[i], m.getOrDefault(nums1[i], 0)+1);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     m.put(nums2[i], m.getOrDefault(nums2[i], 0)+1);
        // }
        for(Map.Entry<Integer,Integer> ele:m.entrySet()){
            System.out.println("Key: "+ele.getKey()+" Value: "+ele.getValue());
        }
        ans = new ArrayList<>();
        for(int num:nums2){
            if(m.containsKey(num)){
                if(m.get(num)-1==0){
                    ans.add(num);
                    m.put(num, m.get(num)-1);
                }
            }
        }
        res.add(ans);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        find(nums1,nums2);
    }
}
