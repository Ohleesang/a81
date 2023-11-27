/**
 * arr에 입력되었을때 최소공배수를 반환하는 함수
 *
 * 1~15 arr
 * arr[i]<100
 */
//유클리드 호제법 을 이용
//a,b,q,r 이 정수라 가정할때,
//a= b*q+r -> a,,b의 최대 공약수는  b,r의 최대 공약수와 같다(a>b)


class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        var list = arr.toMutableList()
        var res = 0
        list.sort()
        fun gcd(x:Int,y:Int):Int{//x>y이라 가정
            return if(y==0) x else gcd(y,x%y)
        }
        while(list.size!=1){
            res = (list[1]*list[0])/gcd(list[1],list[0])
            list.removeFirst()
            list[0]= res
        }
        answer = list.first()
        return answer
    }
}
fun main(){
    var a =Solution()
    a.solution(intArrayOf(2,4,6,8,14))
    a.solution(intArrayOf(1,2,3))
}