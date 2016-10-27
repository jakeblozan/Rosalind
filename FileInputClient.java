/*
 * Reg Hahne
 * This program demonstrates the reading of different types of data in multiple ways
 * 10/7/2014
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileInputClient 
{
	public static void main(String[] args) throws IOException
	{
		//reading integer values and displaying them immediately
		//setting up communication to data
		Scanner inFile = new Scanner(new File("readints.txt"));
		System.out.println("Reading integers and display immediately:");
		while(inFile.hasNext())
		{
			int num = inFile.nextInt();
			System.out.print(num + " ");
		}
		inFile.close();
		
		//reading String values and displaying them immediately
		//setting up communication to data
		Scanner inFile2 = new Scanner(new File("readStrings.txt"));
		System.out.println("\n\nReading Strings and display immediately:");
		while(inFile2.hasNext())
		{
			String str = inFile2.next();
			System.out.print(str + " ");
		}
		inFile2.close();
		
		//reading String values line by line and displaying them immediately
		//setting up communication to data
		Scanner inFile3 = new Scanner(new File("readStrings.txt"));
		System.out.println("\n\nReading Strings line by line and display immediately:");
		while(inFile3.hasNext())
		{
			String str = inFile3.nextLine();
			System.out.print(str + " ");
		}
		inFile3.close();
	}
}
