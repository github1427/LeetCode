package StringCode;

/**
 * 二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class String_67 {
    public static void main(String[] args) {
        System.out.println(addBinary1("101111","10"));

    }

    //思路清奇啊少年，真的渣
    public static String addBinary(String a,String b){
        String sum="";
        int pre=0;
        int lenA=a.length(),lenB=b.length();
        int lenMax=Math.max(lenA,lenB), lenMin=Math.min(lenA,lenB);
        for (int i=0;i<lenMin;i++){
                sum=(Integer.valueOf(String.valueOf(a.charAt(lenA-1-i)))+Integer.valueOf(String.valueOf(b.charAt(lenB-1-i)))+pre)%2+sum;
                pre= (Integer.valueOf(String.valueOf(a.charAt(lenA-1-i)))+Integer.valueOf(String.valueOf(b.charAt(lenB-1-i)))+pre)/2;
        }
        for (int j=lenMin;j<lenMax;j++){
            if (lenA>=lenB){
                if (pre==0){
                    sum=a.substring(0,lenA-j)+sum;
                    break;
                }else {
                    sum=(Integer.valueOf(String.valueOf(a.charAt(lenA-1-j)))+pre)%2+sum;
                    pre= (Integer.valueOf(String.valueOf(a.charAt(lenA-1-j)))+pre)/2;
                }
            }else {
                if (pre==0){
                    sum=b.substring(0,lenB-j)+sum;
                    break;
                }else {
                    sum=(Integer.valueOf(String.valueOf(b.charAt(lenB-1-j)))+pre)%2+sum;
                    pre= (Integer.valueOf(String.valueOf(b.charAt(lenB-1-j)))+pre)/2;
                }
            }
        }
        if (pre==1){
            sum="1"+sum;
        }
        return sum;
    }
    //大神的代码
    public static String addBinary1(String a,String b){
        StringBuilder stringBuilder=new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        int pre=0,sum=0;
        while (i>=0||j>=0){
            if (i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if (j>=0){
                sum+=b.charAt(j--)-'0';
            }
            stringBuilder.append((sum+pre)%2);
            pre=(sum+pre)/2;
            sum=0;
        }
        if (pre==1){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}
