
public class Binary {
	public static int binary(int n) {
		return Integer.parseInt(Integer.toBinaryString(n));
	}
	
	public static void main(String[] args) {
		System.out.print(binary(4));
	}
}
