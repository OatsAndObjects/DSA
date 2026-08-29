/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val dp = Array(7){-1}
    var str = stairsOptim(5)
    print(str)
}

fun stairsRec(i:Int,n:Int):Int{
    //Recursion Solution
    if(i>n){
        return 0
    }
    
    if(i==n){
        return 1
    }
    
    return stairsRec(i+1,n)+stairsRec(i+2,n)
}

fun stairsTopDown(i:Int,n:Int,dp:Array<Int>):Int{
    
    if(i==n){
        return 1
    }
    
    if(i>n){
        return 0
    }
    
    if(dp[i]!=-1){
        return dp[i]
    }
    dp[i] = stairsTopDown(i+1,n,dp) + stairsTopDown(i+2,n,dp)
    return dp[i]
}

fun stairsBottomUp(n:Int,dp:Array<Int>):Int{
    
    dp[n] = 1
    dp[n+1] = 0
    
    for(i in n-1 downTo 0){
        dp[i] = dp[i+1] + dp[i+2]
    }
    
    return dp[0]
}

fun stairsOptim(n:Int):Int{
    
    var current = -1
    var prev1 = 1
    var prev2 = 0
    
    for(i in n-1 downTo 0){
       current = prev1+prev2
       prev2 = prev1
       prev1 = current
    }
    
    return current
    
}


