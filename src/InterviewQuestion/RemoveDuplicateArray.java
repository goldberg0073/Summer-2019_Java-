package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateArray {
    public static void main(String[] args) {

        int[]arr={12,12,12,2,3,5,84,38,38,38,9,9,9,0,0,2,2};
        removeduplicate(arr);

    }


    public static int[] removeduplicate(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each:arr
             ) {
            list.add(each);

        }
        System.out.println("list = " + list);
        List<Integer> newList=new ArrayList<>();
       for(Integer each:list){
           if(!newList.contains(each)){
               newList.add(each);
           }
       }

        System.out.println("newList = " + newList);
       int[]newarr=new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            newarr[i]=newList.get(i);
        }


        System.out.println("newarr = " + Arrays.toString(newarr));
        return  newarr ;
    }
}
