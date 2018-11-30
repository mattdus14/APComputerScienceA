
public class Pyramid {

	public static void pyramid(int n) {
		int space = (n-1);
		for(int rows = 1; rows <= n; rows++) {
			for(int i = 0; i < space; i ++) {
				System.out.print(" ");
			}
			for(int block = 1; block <= rows*2-1; block++) {
				System.out.print("*");
			}
			space--;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(4);
	}

}
