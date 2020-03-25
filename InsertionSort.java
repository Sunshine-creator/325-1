package cww0324;

import java.util.List;

//插入排序
public class InsertionSort {
    public static void insertionSort(double[] list){
        for (int i = 0; i <list.length ; i++) {
            double currentElement =list[i];
            int k ;
            for(k = i-1;k>=0&&list[k] > currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        List[] lists = new List {12,23,4,6,1,89,46,37};
        System.out.println(lists);
    }
}
