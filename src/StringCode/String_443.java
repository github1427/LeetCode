package StringCode;

/**
 * 压缩字符串
 * 给定一组字符，使用原地算法将其压缩。
 * <p>
 * 压缩后的长度必须始终小于或等于原数组长度。
 * <p>
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * <p>
 * 在完成原地修改输入数组后，返回数组的新长度。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * ["a","a","b","b","c","c","c"]
 * <p>
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 * <p>
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * 示例 2：
 * <p>
 * 输入：
 * ["a"]
 * <p>
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 * <p>
 * 说明：
 * 没有任何字符串被替代。
 * 示例 3：
 * <p>
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * <p>
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 * <p>
 * 说明：
 * 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
 * 注意每个数字在数组中都有它自己的位置。
 * 注意：
 * <p>
 * 所有字符都有一个ASCII值在[35, 126]区间内。
 * 1 <= len(chars) <= 1000。
 */
public class String_443 {
    public static void main(String[] args) {
        char[] chars = {'a'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int count = 1;
        int len=0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                len++;
                if (count >1) {
                    chars[len-1]=chars[i];
                    for (int i1=0;i1<String.valueOf(count).length();i1++){
                        chars[len++] = String.valueOf(count).charAt(i1);
                    }
                    count = 1;
                }else {
                    chars[len-1]=chars[i];
                }
            }
        }
        if (count > 1) {
            chars[len]=chars[chars.length-1];
            for (int i1=0;i1<String.valueOf(count).length();i1++){
                chars[++len] = String.valueOf(count).charAt(i1);
            }
            len++;
        }else {
            chars[len]=chars[chars.length-1];
            len++;
        }
        return len;
    }

    //另一种简洁的代码
    public static int compress2(char[] chars){
        if (chars.length==0){
            return 0;
        }
        int index=0;
        for (int i=0;i<chars.length;i++){
            int count=0;
            char curr=chars[i];
            while (i<chars.length&&chars[i]==curr){
                count++;
                i++;
            }
            chars[index++]=curr;
            if (count>1){
                for (char c:String.valueOf(count).toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        return index;
    }
}
