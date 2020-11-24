package OCA_Exam;

final class A1{
	public void A() {
		
	}
}

interface Download{
	public void download();
}
interface Readable extends Download{
	public void readBook();
}
abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read Book");
	}
}
public class Interface_Abstraction extends Book {
	
	public void readBook() {
		System.out.println("Read Book");
	}
	public void download() {
		System.out.println("download");
	}
	
	public Interface_Abstraction() {
		
	}
	public Interface_Abstraction(String str) {
		
	}
	public Interface_Abstraction(int num) {
		this ("name");
	}
	
	
}
