class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        #start the loop from the end of the array
        # find the max value starting from the right 
        # with a default value of -1
        rightMax = -1
        for i in range(len(arr)-1, -1, -1):
            newMax = max(arr[i], rightMax)
            arr[i] = rightMax
            rightMax = newMax
        return arr
        