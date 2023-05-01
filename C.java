import java.util.Scanner;

public class C {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int contador = 0;
		
		String part[] = new String[n];
		boolean tab[] = new boolean[m];
		
		for (int i = 0; i < n; i++) {
			part[i] = sc.next();
		}
		
		for (int i = 0; i < n - 1; i++) {
			
			String rep = part[i];
			
			for (int a = i + 1; a < n; a++) {
				for (int j = 0; j < m; j++) {
					if (rep.charAt(j) == 'o') {
						tab[j] = true;
					} else {
						if (part[a].charAt(j) == 'o') {
							tab[j] = true;
						} else {
							tab[j] = false;
						}
					}
				}
				
				int trus = 0;
				
				for (int z = 0; z < m; z++) {
					if (tab[z]) {
						trus++;
					}
				}
				
				if (trus == m) {
					contador++;
				}							
				
			}

		}
		
		System.out.println(contador);
	
	}
	
}