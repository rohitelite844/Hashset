import java.util.HashSet;

public class HS12 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Red");
		hs.add("White");
		hs.add("Black");
		hs.add("Green");
		
		System.out.println("Original hash set contains :"+hs);
		
		hs.remove(hs);
		System.out.println("HashSet content: "+hs);

	}

}
