package control.loop;



public class NineNine2 {

	public static void main(String[] args) {
		final int FROM = 2;
		final int TO   = 10;
		
		for (int line = FROM; line < TO; line += 3) {

			for (int stage = FROM; stage < TO; stage++) {
				
				for (int times = line; times < line + 3; times++)


					System.out.printf("%d * %d = %d    ", times, stage, times * stage);
					System.out.println();

			}

			System.out.println();

		}
		
	}

}
