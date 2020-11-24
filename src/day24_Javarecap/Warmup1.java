package day24_Javarecap;

public class Warmup1 {

	public static void main(String[] args) {
		
		
		
		int[]arr= {10,20,345,98,400,273,10};
	
	int max=0;
	for (int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
	
	int secondMax=0;
	for(int j=0;j<arr.length;j++) {
		if (arr[j]>secondMax&&arr[j]!=max) {
			
			secondMax=arr[j];
		}
			
		}
	
	System.out.println(secondMax);
	
	System.out.println("***************************************");
	int z;
	int min=999999999;
	for( z=0;z<arr.length;z++) {
		if(arr[z]<min) {
			min=arr[z];
		}
	}
	System.out.println(min);
	
	
	
	}
	
	
}
