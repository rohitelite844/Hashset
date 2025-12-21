import java.util.HashSet;

public class HS2 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		
		hs.add("Red");
		hs.add("White");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Black");
		hs.add("Green");
		System.out.println(hs);
		System.out.println();
		
		
		for(String x:hs){
			
			System.out.println(x);
			
		}

	}

}
