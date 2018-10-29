package com.kj.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @package: com.kj.leetcode
 * @ClassName: TwoSum
 * @Description: TODO
 * @author: Zhongyi
 * @date: 2018/10/29 9:52
 **/
public class TwoSum {

	/*
	给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

	你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 */
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {

			int j = target - nums[i];
			if(map.containsKey(j)){
				int[] tmp = {map.get(j), i};
				return tmp;
			}

			map.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		System.out.println(JSON.toJSONString(twoSum.twoSum(nums, 17)));
	}
}
