package InterviewQuestion;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int reverseNegativeNumber = ReverseNegativeNumber(-1293748);
        System.out.println("reverseNegativeNumber = " + reverseNegativeNumber);
    }

    public static int ReverseNegativeNumber(int num){

        String str=new StringBuilder(""+num).reverse().toString();
        if(num<0){
            str="-"+str.substring(0,str.length()-1);
        }

        return Integer.valueOf(str);
    }
}
