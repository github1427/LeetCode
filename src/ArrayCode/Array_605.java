package ArrayCode;

/**
 * 种花问题
 * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * <p>
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 * <p>
 * 示例 1:
 * <p>
 * 输入: flowerbed = [1,0,0,0,1], n = 1
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: flowerbed = [1,0,0,0,1], n = 2
 * 输出: False
 */
public class Array_605 {
    public static void main(String[] args) {
        int [] flowerbed={1,0,1,0,0,1,0};
        System.out.println(canPlaceFlowers2(flowerbed,1));
    }


    // 我的代码，考虑情况不少。但感觉好理解
    public static boolean canPlaceFlowers(int[] flowerbed,int n) {
        int len=flowerbed.length;
        int count=0;
        if (len==1){
            if (flowerbed[0]==0){
                count++;
            }
        }else {
            if (flowerbed[0]==0&&flowerbed[1]==0){
                flowerbed[0]=1;
                count++;
            }
            for (int i=0;i<len-2;i++){
                if (flowerbed[i]==0&&flowerbed[i+1]==0&&flowerbed[i+2]==0){
                    flowerbed[i+1]=1;
                    count++;
                    i=i+1;
                }
            }
            if (flowerbed[len-1]==0&&flowerbed[len-2]==0){
                count++;
            }
        }
        return count>=n;
    }

    // 大神代码，纸上画一画还成
    public static boolean canPlaceFlowers2(int [] flowerbed,int n){
        int count=1;
        int total=0;
        int len=flowerbed.length;
        for (int i=0;i<len;i++){
            if (flowerbed[i]==0){
                count++;
            }else {
                total=(count-1)/2;
                count=0;
            }
        }
        if (count!=0){
            total+=count/2;
        }
        return total>=n;
    }


}
