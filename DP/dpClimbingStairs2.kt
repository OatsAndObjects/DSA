/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val dp = Array(6){-1}
    var str = stairsOptim(5,0)
    print(str)
}

fun stairsRec(i:Int):Int{
    //Recursion Solution
    if(i<=1){
        return 1
    }
    
    return stairsRec(i-1)+stairsRec(i-2)
}

fun stairsTopDown(i:Int,dp:Array<Int>):Int{
    
    if(i<=1){
        return 1
    }
    
    if(dp[i]!=-1){
        return dp[i]
    }
    dp[i] = stairsTopDown(i-1,dp) + stairsTopDown(i-2,dp)
    return dp[i]
}

fun stairsBottomUp(i:Int,n:Int,dp:Array<Int>):Int{
    
    dp[0] = 1
    dp[1] = 1
    
    for(i in i+2..n){
        dp[i] = dp[i-1] + dp[i-2]
    }
    
    return dp[n]
}

fun stairsOptim(n:Int,i:Int):Int{
    
    var current = 1
    var prev1 = 1
    var prev2 = 1
    
    for(i in i+2 .. n){
       current = prev1+prev2
       prev2 = prev1
       prev1 = current
    }
    
    return current
    
}


