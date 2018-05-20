import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Set;
import java.util.TreeSet;

public class Comptagedemot {

	public static void main(String[] args) throws IOException {

		Path pathFile1 = Paths.get("Toto.txt");
		Path pathFile2 = Paths.get("Titi.txt");
		
		//Set<String> result = new TreeSet<String>();
				
		lecture(pathFile2).contains(lecture(pathFile1));
	
		
	}
	public static Set<String> lecture(Path nameFile) {
		// List<String> list = new ArrayList<String>();
		Set<String> list = new TreeSet<String>();
		int counter = 0;

		try (BufferedReader br = Files.newBufferedReader(nameFile)) {

			for (String mot = br.readLine(); mot != null; mot = br.readLine()) {
				list.add(mot);
				counter++;
			}
			System.out.println("Dans le fichier brut, il y a " + counter + " mots.");
			int counterElt = 0;
			for (String elt : list) {
				counterElt++;
			}
			System.out.println("Maintenant dans le TreeSet, il y a " + counterElt + " mots.");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}
		return list;
	}
}
