package InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindMaxOfArray {
    public static void main(String[] args) {
        int[]arr={12,837,4,64,390,74,106,630,5,3,50,73};
        int maxOfArray = MaxOfArray(arr);
        System.out.println("maxOfArray = " + maxOfArray);
    }




    public static int MaxOfArray(int[]arr){

        ArrayList<Integer>list=new ArrayList<>();
        for(int each:arr){
            list.add(each);
        }

         int max=Integer.MIN_VALUE;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>max){
                max=list.get(i);
            }
        }



        return max;

    }
}
