import java.util.HashSet;

public class Pr {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("red");
		hs.add("green");
		hs.add("black");
		hs.add("white");
		
		System.out.println(hs);
		HashSet<String> hs2=new HashSet<>();
		hs2.add("red");
		hs2.add("pink");
		hs2.add("black");
		hs2.add("orange");
		
		System.out.println(hs2);
		HashSet<String> hs3=new HashSet<>();
		
		for(int i=0;i<hs.size();i++)
		{
		
		if(hs.contains(hs2))
		{
			System.out.println(hs3.add("Yes"));
			
		}
		
		else
		{
			System.out.println(hs3.add("No"));
			
		}
		System.out.println(hs3);
		}
		
		
	}
	

}
