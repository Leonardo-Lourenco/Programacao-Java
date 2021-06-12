/**
 * 
 */
package basico;


public class Aula28 {

	
	public static void main(String[] args) {
		
		// AULA 28: Laço FOR EACH
		
		
		/**
		String[] nomes = {"Leo", "Coffee", "Tag", "Rebeca", "Dryca", "Ana","Rainara", "Maria"};
		
		for(int i = 0; i<nomes.length; i++) {
			
			System.out.println(nomes[i]);
			
			
		}
		
		*/
		
		// Laço FOR EACH
		
		
		String[] nomes = {"Leo", "Coffee", "Tag", "Rebeca", "Dryca", "Ana","Rainara", "Maria"};
		
		for(String i:nomes) {
			
			System.out.println("Nomes: " +i);
		}
		
		
	}

}
