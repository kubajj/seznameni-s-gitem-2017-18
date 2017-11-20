public class Prvocinitele {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		while (scanner.hasNextInt()) {
			int cislo = scanner.nextInt();
			
			if (cislo < 1) {
				System.out.printf("%d neresim.\n", cislo);
				continue;
			}
			
			System.out.printf("%d =", cislo);
			int delitel = 2;
			boolean first = true;
			while (delitel <= cislo) {
				if ((cislo % delitel) == 0) {	
				    if (first){
					System.out.printf(" %d", delitel);
					first = false;
				    } else {
					System.out.printf(" * %d", delitel);
				    }
				    	cislo /= delitel;
		       		} else {			    
				    delitel++;
				}
			}				
			System.out.println();
		}
	}
}

