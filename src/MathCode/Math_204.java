package MathCode;

/**
 * 计数质数
 * 统计所有小于非负数整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class Math_204 {
    public static void main(String[] args) {
        System.out.println(countPrimes1(150000));
    }
    public static int countPrimes(int n){
        int count=0;
        for (int i=2;i<n;i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int n){
        if (n==2||n==3){
            return true;
        }
        if (n%6!=1&&n%6!=5){
            return false;
        }
        for (int i=5;i<=Math.sqrt(n);i+=2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //大神代码
    public static int countPrimes1(int n){
        boolean[] booleans=new boolean[n];
        int count=0;
        long j;
        for (int i=2;i<n;i++){
            if (!booleans[i]){
                count++;
                for (j=i;j*i<n;j++){
                    booleans[(int) (j*i)]=true;
                }
            }
        }
        return count;
    }
}
