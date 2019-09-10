package day7_unary;

public class Kahoot {
public static void main(String[] args) {
	
	
	
	short myShort=200;
	--myShort;
	System.out.println(myShort);
	
	
	
	short myShort1=myShort++;
	System.out.println(myShort1);
	short myShort2=myShort++;
	System.out.println(myShort2);
	
	
	int z =100;
	--z;
	System.out.println(z);
	System.out.println(z--);
	System.out.println(z-- +"\n");
	int x=z--;
    System.out.println(x);
    System.out.println(x++);
     System.out.println(--x);
     System.out.println(--x);
     System.out.println(--x);

     
     
    int outNum1 =46;
    int outNum2= 90;
    System.out.println(outNum1+outNum2);
    
    
    int C=45;
    int F=9*C/5+32;
    	System.out.println(F);
    	
    
    double myMile=60;
    double myKM=myMile*1.609344;
    
    System.out.println(myKM);
    
    double radius=5.5;
    float π=3.14159f;
	double perimetre=2 * radius * π;
	double area = radius * radius * π;
	
	System.out.println(perimetre);
    System.out.println(area);
    
     double width=4;
     double height=7;
     double area1=width*height;
     System.out.println(area1);
     
    		 
     double myNum1=40;
     double myNum2=8;
     double myNum3=12;
     double average=(myNum1+myNum2+myNum3)/3;
     
     System.out.println(average);
     
     short num1=20;
     short num2=20;
     int num3=num1+num2;
     System.out.println(num3);
     
     
     double int1=(double)7.9;
     double int2=(double)6.7;
     double double1=int1+int2;		 
     System.out.println(double1);
     
     
     int a=50;
     int b= --a + +a++ + a-- + a++;
     
     System.out.println(b);
     byte n=30;
     int m= n + 30;
     System.out.println(m);
     
     
    
    	    int m1=100;
    	    int m2=++m1 - m1-- + m1++ - --m1;
    	    int m3=++m2 + m1++ - ++m1 + --m1;

    	    
    	

    	    System.out.println("m 1 = " + m1);
    	    System.out.println("m 2 = " + m2);
    	    System.out.println("m 3 = " + m3);
    	 
    	 int gallon=1000;
    	 double Litter =3.785*gallon;
    	System.out.println( gallon + " gallong equal to "+Litter+"liters");	
    	    
    	    double liter1=100 ;
    	   float gallon1 =(float) (liter1/3.785);
    	  
    	    System.out.println(liter1 +" liter equal to "+gallon1+"gallong");
    	  
    	    
    	    
    	    
    	    int k=1;
    	    k=-k--+k++ /-k--*--k;
    	    System.out.println(k);
    	    
    	    
    	    int B=2;
    	    boolean res=++B==2||--B==2 && --B==2;
    	    System.out.println(res);
    	    
    	    boolean T=true, W=true;
    	    int L=20;
    	    T=(L!=10)||(W=false);
    	    System.out.println(T);
    	    
    	    
    	    int P=20,O=10,M=5;
    	    int X,Y,Z;
    	    X=P++ + O++ + ++M;
    	    Y=--P + --O + P++;
    	    Z=M++ + M++ + ++M;
    	    System.out.println(X);    	    
    	    System.out.println(Y);
    	    System.out.println(Z);
    	    
    	    
    	    int R=10,G=5;
    	    int X1,Y1;
    	    X1=R++ * G--/R++;
    	    Y1=--G+ --R * R--;
    	    System.out.println(X1);
    	    System.out.println(Y1);
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
}
}
