package StringCode;

/**
 * 反转字符串
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * <p>
 * 示例：
 * <p>
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class String_344 {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(s);
        return stringBuilder.reverse().toString();

    }
}
