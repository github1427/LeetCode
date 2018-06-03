package MathCode;

/**
 * 有效的完全平方数
 */
public class Math_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num){
        long i=0;
        for (i=1;i<=num;i++){
            if (i*i==num){
                return true;
            }else if (i*i>num){
                return false;
            }
        }
        return false;
    }
}
