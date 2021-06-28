/*Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. 

*/


class RunningSum1d {
    fun runningSum(nums: IntArray): IntArray {
         //var resultArray = IntArray(nums.size)
         //resultArray[0] = nums[0]
         for(i in 1 until nums.size){
             //resultArray[i] = resultArray[i-1]+nums[i]
             nums[i] = nums[i-1]+nums[i]
         }
         //return resultArray
         return nums
    }
}
