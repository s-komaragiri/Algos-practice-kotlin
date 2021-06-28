/*Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] */

class GreatestNoOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = mutableListOf<Boolean>()
        var max = 0
        for(c in candies){
            if(c > max){
                max = c
            }
        }
        for(candy in candies){
            if(candy+extraCandies>=max){
                result.add(true)
            }else{
                result.add(false)
            }
        }
        return result
    }
}
