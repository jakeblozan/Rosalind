import java.util.Scanner;

/**
 * Write a description of class Mendels1stLaw here.
 * 
 * Probabilities are: 1, 0.5, 1, 0.75, 0.5, 0
 * 
 * @author (Jake Blozan) 
 * @version (11/29/16)
 */
public class Mendels1stLaw
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the integers: ");
        int dom = scan.nextInt();
        int het = scan.nextInt();
        int rec = scan.nextInt();
        int total = dom + het + rec;
        
    }
}
