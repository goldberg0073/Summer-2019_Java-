package InterviewQuestion;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class practicing {

	public static void main (String []args) throws ParseException {
		
		
	    String date="08:25:2020 11:11:22"; 
	   SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MM:dd:yyyy hh:mm:ss");
	    System.out.println(simpleDateFormat.parse(date));
	    
	    // create a map
	    Map<String,Integer>fruits=new LinkedHashMap();
	    fruits.put("Apple", 125);
	    fruits.put("Banana", 390);
	    fruits.put("Strawberry", 67);
	    fruits.put("cherry", 100);
	    fruits.put("Orange", 52);
	    
        List<Entry<String,Integer>>list=new ArrayList<>(fruits.entrySet());
	    list.sort(Entry.comparingByValue());
	    System.out.println(list);
	    for(Entry<String,Integer> each : list) {
	    	if(each.getValue()>50) {
	    		 System.out.println(each.getValue());
	    	}
	    }
	    
	    
	    String str="aaabbbcccfgggtttzzzk";
	   String unique="";
	    for(int i=0;i<str.length();i++) {
	    	int count=0;
	    	for(int j=0;j<str.length();j++) {
	    		if(str.charAt(i)==str.charAt(j)) {
	    			count++;
	    		}
	    		
	    	}
	    	if(count==1) {
    			unique+=""+str.charAt(i);
    		}
	    
	    }
	    
	   
	    System.out.println(unique);
	     FrequencyTest("aaabbbrrrzghghghjjjl");
	    
	    
	    
	    
	    
	    
	    
	}
	public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

        if (map.containsKey(each)) {

            map.put(each, map.get(each) + 1);

        } else {

map.put(each, 1);

        }

        }  

        System.out.println(map);

    }
}