package InterviewQuestion;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a=153;
        boolean armstrong = Armstrong(a);
        System.out.println("armstrong = " + armstrong);
    }


    public static boolean Armstrong(int num){

        int a=0 ,b=0 ,c=num ; // 153
        while(num>0){
            a=num%10;   //3                  5                      1
            num/=10;    // 15                1                      0
            b=b+(a*a*a);  //0+(3*3*3)=27     27+(5*5*5)=152          152+(1*1*1)=153
        }
        if(c==b){
            return true;
        }

        return false;
    }

}
