
public class UnaryOperatorsDemo {

	public static void main(String[] args) {
		int a = 50;
		int b = a++;
		System.out.println("b = a++ "+b);
		int c = 50;
		int d = ++c;
		System.out.println("d = ++c "+d);
		
		int e = 50;
		int f = e--;
		System.out.println("f = e-- "+f);
		int g = 50;
		int h = --g;
		System.out.println("h = --g "+h);
		
	}
}
