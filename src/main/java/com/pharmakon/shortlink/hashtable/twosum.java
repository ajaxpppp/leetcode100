package com.pharmakon.shortlink.hashtable;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 3, 5, 6};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("result = " + result.toString());
    }

        /**
     * 寻找数组中两个数的和等于目标值的索引位置
     * 使用哈希表存储已遍历元素的值和索引，通过查找目标值与当前元素差值的方式快速定位
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param nums 整数数组，用于查找两个数之和
     * @param target 目标和值
     * @return 包含两个索引位置的数组，如果未找到则返回空数组
     */
    public static int[] twoSum(int[] nums, int target) {
    // 检查输入数组有效性，数组为空或长度小于2时无法找到两个数
    if (nums == null || nums.length < 2) {
        return new int[0];
    }

    // 创建哈希表存储数组元素值和对应的索引位置
    HashMap<Integer, Integer> hashtable = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        // 计算当前元素与目标值的差值（补数）
        int complement=target-nums[i];
        // 在哈希表中查找补数是否存在
        Integer prevIndex  = hashtable.get(complement);
        // 如果补数存在，说明找到了两个数的和等于目标值，返回两个数的索引
        if(prevIndex!=null){
            return new int[]{prevIndex,i};
        }
        // 将当前元素值和索引存入哈希表，供后续元素查找使用
        hashtable.put(nums[i],i);
    }
    // 遍历完成未找到符合条件的两个数，返回空数组
    return new int[0];
}


}
