import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class ConsensusandProfile here.
 * 
 * @author (Jake Blozan) 
 * @version (1/24/17)
 */
public class ConsensusandProfile
{
	public static void main(String[] args) throws IOException {
		Scanner data = new Scanner(File("practice.txt"));
		System.out.println("Fetching data...");
		int length = data.length();
		int strings = 0;
		for (int i = 0; i < length; i++) {
			if (data.charAt(i) == '>') {
				strings++;
			}
		}
		int stringLength = 0;
		for (int i = 1; i < length; i++) {
			if (data.charAt(i) == '>') {
				break;
			}
			else {
				stringLength = i;
			}
		}
	}
}
