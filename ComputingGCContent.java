import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 * Write a description of class ComputingGCContent here.
 * 
 * @author (Jake Blozan) 
 * @version (10/28/16)
 */
public class ComputingGCContent
{
    public static void main(String[] args) throws IOException {
        String data = new Scanner(new File("rosalind_gc.txt")).useDelimiter("\\A").next();
        System.out.println("Fetching data...");
        int strings = 0;
        int length = data.length();
        for (int i = 0; i < length; i++) {
            if (data.charAt(i) == '>') {
                strings++;
            }
        }
        int[] indexes = new int[strings];
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (data.charAt(i) == '>') {
                indexes[counter] = i;
                counter++;
            }
        }
        String[] tags = new String[strings];
        for (int i = 0; i < strings; i++) {
            tags[i] = data.substring((indexes[i] + 1), (indexes[i] + 14));
        }
        String[] content = new String[strings];
        for (int i = 0; i < strings; i++) {
            if (i < (strings - 1)) {
                content[i] = data.substring((indexes[i] + 15), (indexes[i + 1] - 1));
            }
            else {
                content[i] = data.substring((indexes[i] + 15), data.length());
            }
        }
        double[] gcContent = new double[strings];
        for (int i = 0; i < strings; i++) {
            double GCs = 0.0;
            double all = 0.0;
            for (int q = 0; q < content[i].length(); q++) {
                char X = content[i].charAt(q);
                if (X == 'G' || X == 'C') {
                    GCs++;
                    all++;
                    //System.out.println("got one");
                }
                else if (X == 'T' || X == 'A'){
                    all++;
                }
                //System.out.println("");
            }
            System.out.println(GCs);
            System.out.println("\t" + all);
            double currentContent = GCs / all;
            gcContent[i] = currentContent;
            System.out.println(currentContent);
            System.out.println("");
            System.out.println("");
        }
        double currentTop = gcContent[0];
        int whichTag = 0;
        for (int i = 0; i < strings; i++) {
            double newTop = gcContent[i];
            if (newTop > currentTop) {
                currentTop = newTop;
                whichTag = i;
            }
        }
        System.out.println(tags[whichTag]);
        System.out.println(currentTop);
    }
}