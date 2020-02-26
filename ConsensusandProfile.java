import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class ConsensusandProfile here.
 * 
 * @author (Jake Blozan) 
 * @version (10/25/18)
 */
public class ConsensusandProfile
{
    public static void main(String[] args) throws Exception {
        Scanner data = new Scanner(new File("practice.txt"));
        System.out.println("Fetching data...");
        String input = data.useDelimiter("\\Z").next();
        int length = input.length();
        int strings = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == '>') {
                strings++;
            }
        }
        int stringLength = 0;
        for (int i = 1; i < length; i++) {
            if (input.charAt(i) == '>') {
                break;
            }
            else {
                stringLength = i - 14;
            }
        }
        System.out.println(strings + ", " + stringLength);

        char[][] table = new char[stringLength][strings];
        for  (int k = 0; k < strings; k++) {
            for (int j = 0; j < stringLength; j++) {
                table[j][k] = input.charAt((k * (15 + stringLength)) + j + 13);
                //System.out.println(table[j][k]);
            }
            System.out.println("next");
        }
        //System.out.println(table[0][1]);
        // for  (int k = 0; k < strings; k++) {
        // System.out.println(k);
        // for (int j = 0; j < stringLength; j++) {
        // System.out.print(table[j][k]);
        // }
        // System.out.println("");
        // }
        System.out.println("");
        //System.out.println(Arrays.deepToString(table));

        int[][] profile = new int[stringLength][4];
        for (int k = 0; k < 4; k++) {
            for (int j = 0; j < stringLength; j++) {
                for (int i = 0; i < strings; i++) {
                    switch (k) {
                        case 0: if (table[j][i] == 'A') {
                            profile[j][k]++;
                        }
                        break;
                        case 1: if (table[j][i] == 'C') {
                            profile[j][k]++;
                        }
                        break;
                        case 2: if (table[j][i] == 'G') {
                            profile[j][k]++;
                        }
                        break;
                        case 3: if (table[j][i] == 'T') {
                            profile[j][k]++;
                        }
                        break;
                    }
                }
            }
        }

        String consensus = "";
        for (int j = 0; j < stringLength; j++) {
            for (int k = 0; k < 4; k++) {
                String bit = "";
                switch (k) {
                    case 0: bit = "A";
                    break;
                    case 1: bit = "C";
                    break;
                    case 2: bit = "G";
                    break;
                    case 3: bit = "T";
                    break;
                }
                if (profile[j][k] > profile[j][k - 1]) {
                    consensus = consensus.substring(0, consensus.length() - 1) + bit;
                }
            }
        }

        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
        writer.println(consensus);
        writer.println("");
        for (int k = 0; k < 4; k++) {
            for (int j = 0; j < stringLength + 1; j++) {
                if (j == 0) {
                    switch (k) {
                        case 0: writer.print("A:");
                        break;
                        case 1: writer.print("C:");
                        break;
                        case 2: writer.print("G:");
                        break;
                        case 3: writer.print("T:");
                        break;
                    }
                }
                else {
                    writer.print(" " + profile[j - 1][k]);
                }
            }
            writer.println("");
        }
        writer.close();
    }
}
