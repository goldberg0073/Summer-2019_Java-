package collection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;



public class OfficeHoursCollection {

	
	
	 public void textreader() {
		

		
		
	}
		
	
	
	public static void main(String[] args) {
		
		Properties text= new Properties();
		String path="/Users/hichamahloufous/Desktop/hicham.properties";
		
		try {
		FileInputStream file =new FileInputStream(path);
		
		text.load(file);
		}catch(Exception e) {
			
		}
			System.out.println(text.getProperty("hicham"));
		
		
		List<String>cars=new LinkedList<String>(Arrays.asList("GTI","audi","mercedes","bmw","jetta","ford","jeguar"));
		
	cars.add("porche");
	cars.remove(1);
	System.out.println(cars);	
		
	System.out.println("===============================================================================================");
	
	  List<String>cars2=new Vector<String>(Arrays.asList("GTI","audi","mercedes","bmw","jetta","ford","jeguar"));
		
	  cars2.add("porche");
		cars2.remove(1);
		System.out.println(cars2);
		
		System.out.println("==============================================================================================");
	
		Set<String>colors=new TreeSet<String>(Arrays.asList("red","yellow","red","black","white","green","GREEN","green"));
		colors.add("gray");
		
		// TreeSet method from Set interface remove duplicate and doesn't keep order of the list
		
		colors.remove("red");
		colors.remove("white");
		System.out.println(colors);

		
		Iterator<String>itrStr=colors.iterator();
		while(itrStr.hasNext()) {
			System.out.println(itrStr.next()+" ");
		}

		
	}
	
}
