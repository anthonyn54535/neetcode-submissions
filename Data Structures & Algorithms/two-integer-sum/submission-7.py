class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        process = dict()
        for i in range(len(nums)):
            if target - nums[i] not in process.keys():
                process[nums[i]] = i
            else:
                return [process[target-nums[i]], i]