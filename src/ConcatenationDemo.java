
public class ConcatenationDemo {

	public static void main(String[] args) {

		String a="abc", b="pqr";
		int p=1, q=2, r=3;
		
		System.out.println(a+b);
		System.out.println(p+q+r);
		
		System.out.println(a+p+q+r);
		System.out.println(p+a+q+r);
		System.out.println(p+q+a+r);
		System.out.println(p+q+r+a);
	}

}
