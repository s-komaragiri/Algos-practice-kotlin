class MostWaterContainer {

/*

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

*/
    fun maxArea(height: IntArray): Int {
        
        // O(n^2) solutuion 
        // var area=0
        // for(i in height.indices){
        //     for(j in i+1 until height.size){
        //         val hVal = if(height[i]<height[j]) height[i] else height[j]
        //         val lVal = j-i
        //         if(hVal*lVal > area) area=hVal*lVal
        //     }
        // }
        // return area
        
        //O(n) solution
        
        var area = 0 
        var left = 0
        var right = height.size-1
        
        while (left < right){
            area = Math.max(area,(Math.min(height[left],height[right]) * (right-left)))
            if(height[left]<height[right]) left++ else right--
        }
        return area
    }
}
