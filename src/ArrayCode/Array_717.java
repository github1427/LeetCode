package ArrayCode;

/**
 * 1比特与2比特字符
 * 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * <p>
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * bits = [1, 0, 0]
 * 输出: True
 * 解释:
 * 唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
 * 示例 2:
 * <p>
 * 输入:
 * bits = [1, 1, 1, 0]
 * 输出: False
 * 解释:
 * 唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
 */
public class Array_717 {
    public static void main(String[] args) {
        int[]bits={1,0,0,0,0};
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int len=bits.length;
        if (bits[len-1]==1){
            return false;
        }
        int count=1;
        for (int i=0;i<len-1;i++){
            if (bits[i]==1){
                i++;
            }
            count=i;
        }
        return count != len - 1;
    }

}
