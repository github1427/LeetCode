package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Positions of Large Groups
 */
public class Array_830 {
    public static void main(String[] args) {
        String s="abcdddeeeeaabbbcd";
        List<List<Integer>> bigList=largeGroupPositions(s);
        System.out.println(bigList.toString());
    }

    public static List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> bigList=new ArrayList<>();
        int count=0;
        char [] chars=s.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if (chars[i]==chars[i+1]){
                count++;
            }else {
                if (count+1>=3){
                    List<Integer> smallList=new ArrayList<>();
                    smallList.add(i-count);
                    smallList.add(i);
                    bigList.add(smallList);
                }
                count=0;
            }
        }
        if (count+1>=3){
            List<Integer> smallList=new ArrayList<>();
            smallList.add(chars.length-1-count);
            smallList.add(chars.length-1);
            bigList.add(smallList);
        }
        return bigList;
    }
}
