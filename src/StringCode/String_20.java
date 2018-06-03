package StringCode;

import java.util.Stack;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class String_20 {
    public static void main(String[] args) {
        String s="([])";
        String s1;
        System.out.println(isValid1(s));

    }

    //渣渣代码
    public static boolean isValid(String s){
        int index=0;
        int before=0,after=0;
        String s1,s2;
        while (s.length()>1){
            before=s.length();
            if (s.contains("()")){
                index=s.indexOf("()");
                s1=s.substring(0,index);
                s2=s.substring(index+2);
                s=s1.concat(s2);
            } else if (s.contains("{}")){
                index=s.indexOf("{}");
                s1=s.substring(0,index);
                s2=s.substring(index+2);
                s=s1.concat(s2);
            } else if (s.contains("[]")){
                index=s.indexOf("[]");
                s1=s.substring(0,index);
                s2=s.substring(index+2);
                s=s1.concat(s2);
            }
            after=s.length();
            if (before==after){
                break;
            }
        }
        return s.length() == 0;

    }

    //用栈啊  栈！！！！
    public static boolean isValid1(String s){
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for (char c:chars){
           if (c=='('){
               stack.push(')');
           }else if (c=='{'){
               stack.push('}');
           }else if (c=='['){
               stack.push(']');
           }else if (stack.isEmpty()||stack.pop()!=c){
               return false;
           }
        }
        return stack.isEmpty();
    }
}
