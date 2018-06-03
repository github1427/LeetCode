package ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class Array_118 {
    public static void main(String[] args) {
        int numRows=5;
        List<List<Integer>> lists=generate2(numRows);
        System.out.println(lists.toString());
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> bigList=new ArrayList<>();
        Integer [][] number=new Integer[numRows][numRows];
        for (int i=0;i<numRows;i++){
            number[i][0]=1;
            number[i][i]=1;
        }
        for (int row=2;row<numRows;row++){
            for (int index=1;index<row;index++){
                number[row][index]=number[row-1][index-1]+number[row-1][index];
            }
        }
        for (int i=0;i<numRows;i++){
            List<Integer> smallList=new ArrayList<>(Arrays.asList(number[i]));
            smallList.removeAll(Collections.singleton(null));
            bigList.add(smallList);
        }
        return bigList;
    }

    //来自大神们的另一种实现方法
    public static List<List<Integer>> generate2(int numRows){
        List<List<Integer>> bigList=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> smallList=new ArrayList<>();
            for (int i1=0;i1<=i;i1++){
                smallList.add(1);
                for (int i2=i1-1;i2>0;i2--){
                    smallList.set(i2,smallList.get(i2-1)+smallList.get(i2));
                }
            }
            bigList.add(smallList);
        }
        return bigList;
    }
}
