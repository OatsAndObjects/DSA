/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val dp = Array(5){-1}
    var str = stairsSpaceOpm(4,dp)
    print(str)
}

fun stairRec(n:Int):Int{
    if(n<=1){
        return 1
    }
    
    if(n==2){
        return 2
    }
    
    return stairRec(n-1) + stairRec(n-2) + stairRec(n-3)
}

fun stairTopDown(n:Int, dp:Array<Int>):Int{
    
    if(n<=1){
        return 1
    }
    
    if(n==2){
        return 2
    }
    
    if(dp[n]!=-1){
        return dp[n]
    }
    
    dp[n] = stairTopDown(n-1, dp) + stairTopDown(n-2,dp) + stairTopDown(n-3,dp)
    return dp[n]
}

fun stairBottomUp(n:Int,dp:Array<Int>):Int{
    
   dp[0] = 1
   dp[1] = 1
   dp[2] = 2
    
    for(i in 3 .. n){
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
    }
    
    return dp[n]
}

fun stairsSpaceOpm(n:Int,arr:Array<Int>):Int{
    
    
    if(n<=1){
        return 1
    }
    
    if(n==2){
        return 2
    }
    
    var current = -1
    var prev1 = 2
    var prev2 = 1
    var prev3 = 1
    
    for(i in 3 .. n){
        current = prev1 + prev2 + prev3
        prev3 = prev2
        prev2 = prev1
        prev1 = current
    }
    
    return current
    
}








