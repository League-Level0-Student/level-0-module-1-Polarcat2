package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		for (int repeat = 0; repeat < 2; repeat++) {
			for (int count = 0; count < 12; count++) {
				System.out.print("badger, ");
			}
			for (int count = 0; count < 2; count++) {
				System.out.print("mushroom, ");
			}
			System.out.println();
		}
		System.out.println("                                         a snake!!!");
	}
}
