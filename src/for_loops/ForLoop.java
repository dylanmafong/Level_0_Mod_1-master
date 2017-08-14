package for_loops;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 100; i >= 0; i--)
			System.out.println(i);
		for (int i = 0; i >= 100; i--)
			System.out.println(i);

		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");

			}
			if(i%2==1) {
				System.out.println(i+" odd");
			}
		}
		for (int i = 0; i < 778; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		for (int i = 2005; i < 2017; i++) {
			System.out.println("in "+i+ " I was "+(i-2005));
		}
	}
}