package ArrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 */
public class Array_119 {
    public static void main(String[] args) {
        int rowIndex=1;
        System.out.println(getRow(1).toString());
    }
    public static List<Integer> getRow(int rowIndex){
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            arrayList.add(1);
            for (int j=i-1;j>0;j--){
                arrayList.set(j,arrayList.get(j-1)+arrayList.get(j));
            }
        }
        return arrayList;
    }
}
