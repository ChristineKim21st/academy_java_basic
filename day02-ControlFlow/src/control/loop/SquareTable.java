package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		for(int idx=1; idx<=10; idx++) {
			int multi = idx*idx;
			System.out.printf("%5d X %5d = %5d%n", idx, idx, multi);
		}
	}

}
