package verifyingNames;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchName {
	
	@SuppressWarnings("resource")
	
	public static void main (String [] args) {

		//user's input (name)
		System.out.print("Enter name: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		// read name
				String fileLocation = "D:\\Java\\Eclipse\\NamesWithGender\\src\\names.csv";
				String word = "";
				
				try {
					BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
					while((word = reader.readLine()) != null) {
						String [] names = word.split(",");
						
						for (int i = 0; i < names.length; i++) {
							
							if (userInput == names[i]) {
								System.out.println('"' + userInput + '"' + " is a Nepali name.");
							}
							else if (userInput != names[i]){
								System.out.println('"' + userInput + '"' +  " is not a Nepali name.");
							}			
						}
					break;
						
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				 catch (IOException e) {
						e.printStackTrace();
				}
		
	}
}

