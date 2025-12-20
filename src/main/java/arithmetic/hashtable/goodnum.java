package arithmetic.hashtable;

import java.util.HashMap;

/**
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 * 示例 3：
 *
 * 输入：nums = [1,2,3]
 * 输出：0
 */
public class goodnum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2,1,3,4,2,1,4,6,7,8,1,2,3,2,1,3,4,2,1,4,6,7,8};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                count += hashMap.get(nums[i]);
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                System.out.println("num=" + nums[i] + ", count 加了 " + hashMap.get(nums[i]) + ", 总count=" + count);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        return count;
    }
}
