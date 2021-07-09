/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       var result = IntArray(2)
       var map = HashMap<Int,Int>()
       
       for(i in nums.indices){
           val remain = target-nums[i]
           if(map.contains(remain)){
               result = intArrayOf(map.get(remain)!!,i)
               break
           }
            map.put(nums[i],i)
       }
       return result
    }
}
