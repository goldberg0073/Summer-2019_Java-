package repit;


import java.util.ArrayList;
import java.util.Arrays;

public class exercise171 {
	
	
public static void main(String[] args) {
	
	
	ArrayList<String> names = new ArrayList<>();
	names.add("Homayra");
	names.add("Meri");
	names.add(1, "Mikrigul");
	names.add(1, "Tabriz");
	names.add(0, "Asiya");
	
	String str1 = names.get(1); 
	System.out.println( str1 );
	System.out.println(names);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String Str =RemoveDup("aaaaaabbbbbcccccdddddffffffjjjjj");
	System.out.println(Str);
}	

 

public static String RemoveDup(String str) {
	String Result="";

	
	for(int i=0;i<str.length();i++) {
		if(!Result.contains(str.substring(i, i+1))) {
			Result+=str.substring(i,i+1);
		}
	}
	
	
	return Result;
	
	
	
	
	
	
	
}

  
  
}