import java.util.HashSet;

public class HS5 {

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
		
		if(hs.isEmpty())
		{
			System.out.println("Above ArrayList is Empty");
			
		}
		else{
			System.out.println("Above Arraylist is not Empty");
			
		}
		System.out.println();
		hs.removeAll(hs);
		
		if(hs.isEmpty())
		{
			System.out.println("Above ArrayList is Empty");
		}
		else
		{
			System.out.println("Above Arraylist is not Empty");
		}

	}

}
