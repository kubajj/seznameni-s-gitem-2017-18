// https://github.com/kubajj/seznameni-s-gitem-2017-18.git/* Nakresli (krasnou) pyramidu. */
public class Pyramida {
	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		
		for (int y = 0; y < vyska; y++) {
		    for (int i = 1; i < vyska - y; i++){
			System.out.printf(" ");
		    }
		    for (int x = 0; x < y * 2 + 1; x++) {
				System.out.printf("X");
			}
			System.out.println();
		}
	}
}
