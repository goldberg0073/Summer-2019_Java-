package collection;

import java.io.FileInputStream;
import java.util.*;


public class OfficeHoursCollection {


	
	 public void textreader() {

	}


	public static void main(String[] args) {
		
		int []arr={10,10,20,20,20,30,30,40,10,10,20,20};
		NumberOfPairs(arr);

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
	public static void NumberOfPairs(int[] numberOfSocks){

		ArrayList<Integer>listOfSocks=new ArrayList<>();
	 	for(int each:numberOfSocks){
	 		listOfSocks.add(each);
		}

		LinkedHashSet<Integer> NoDup=new LinkedHashSet<>();

		int pairs=0;
		for (int i = 0; i < listOfSocks.size(); i++) {  //10,10,20,20,40,40,10,40,30
			if (!NoDup.contains(listOfSocks.get(i))) {
				NoDup.add(listOfSocks.get(i));
			} else {
				pairs++;
				NoDup.remove(listOfSocks.get(i));
			}
		}

		System.out.println("pairs = " + pairs);

	}

	
}
