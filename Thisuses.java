class This{
	int len;
	int breth;
	
	void show(int len,int breth)
	{
		this.len=len;
		this.breth=breth;
		System.out.println("Print lentgh and breadth");
	}
	void diplay()
	{
		this.show(len, breth);
	}
}

public class Thisuses {

	public static void main(String[] args) {
		This s=new This();
		s.show(4,5);
		

	}

}
