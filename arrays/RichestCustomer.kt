/*
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/

class RichestCustomer {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        for(account in accounts){
            var sum =0
            for(amount in account){
                sum += amount
            }
            if(sum>maxWealth){
                maxWealth = sum
            }
        }
        return maxWealth
    }
}
