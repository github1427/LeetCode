package MathCode;

/**
 * 反转整数
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */
public class Math_7 {
    public static void main(String[] args) {
        System.out.println(reverse1(1563847412));
//        System.out.println(reverse1(-123));
        System.out.println(Integer.MAX_VALUE);
    }
    public static int reverse(int x){
        String strRev;
        String s=String.valueOf(x);
        StringBuilder stringBuilder=new StringBuilder();
        int maxValue=Integer.MAX_VALUE;
        if (x<0){
            stringBuilder.append(s.substring(1));
            strRev=stringBuilder.reverse().toString();
            if (strRev.length()==10){
                for (int i=0;i<10;i++){
                    if (strRev.charAt(i)>String.valueOf(maxValue).charAt(i)){
                        return 0;
                    }else if (strRev.charAt(i)<String.valueOf(maxValue).charAt(i)){
                        break;
                    }
                }
            }
            return Integer.valueOf("-"+strRev);
        }else {
            stringBuilder.append(s);
            strRev=stringBuilder.reverse().toString();
            if (strRev.length()==10){
                for (int i=0;i<10;i++){
                    if (strRev.charAt(i)>String.valueOf(maxValue).charAt(i)){
                        return 0;
                    }else if (strRev.charAt(i)<String.valueOf(maxValue).charAt(i)){
                        break;
                    }
                }
            }
            return Integer.valueOf(strRev);
        }
    }

    //大神的代码
    public static int reverse1(int x){
        int y=0;
        boolean flag=true;
        int maxValue=Integer.MAX_VALUE;
        if (x<0){
            x=-x;
            flag=false;
        }
        while (x>0){
            if (y>maxValue/10){
                return 0;
            }
            y=y*10+x%10;
            x=x/10;
        }
        if (flag){
            return y;
        }else {
            return -y;
        }
    }
}
