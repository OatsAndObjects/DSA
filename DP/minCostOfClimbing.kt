/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val dp = Array(4){0}
    val cost = arrayOf(10,15,20)
    var str = minCost(3,cost)
    print(str)
}

fun minCostClimbingStairs(n:Int, cost:Array<Int>, dp:Array<Int>):Int{
    
    if(n<=1){
        return 0
    }
    
    if(dp[n]!=-1){
        return dp[n]
    }
    
    dp[n] = Math.min(cost[n-1]+minCostClimbingStairs(n-1,cost,dp), cost[n-2]+
            minCostClimbingStairs(n-2,cost,dp))
    return dp[n]
    
}

fun minCostBottomUp(n:Int, cost:Array<Int>, dp:Array<Int>):Int{
    
    if(n<=1){
        return 0
    }
     
    for(i in 2..n){
       dp[i] = minOf(
            cost[i - 1] + dp[i - 1],
            cost[i - 2] + dp[i - 2]
        )
    }
    
    return dp[n]
    
}

fun minCost(n:Int,cost:Array<Int>):Int{
    if(n<=1){
        return 0
    }
    
    var current = 0
    var prev1 = 0
    var prev2 = 0
    
    for(i in 2..n){
        current  = minOf(cost[i-1]+prev1, cost[i-2]+prev2)
        prev2 = prev1
        prev1 = current
    }
    
   return current 
    
}


