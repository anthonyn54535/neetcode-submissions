class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        contains = set()
        for n in nums:
            if n in contains:
                return True
            else:
                contains.add(n)
        return False