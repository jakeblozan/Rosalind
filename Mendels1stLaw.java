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
        System.out.println("Input the integers: ");
        double dom = scan.nextDouble();
        double het = scan.nextDouble();
        double rec = scan.nextDouble();
        double total = dom + het + rec;
        System.out.println(total);
        double probDomDom = (dom / total) * ((dom - 1) / (total - 1));
        double probDomHet = (dom / total) * (het / (total - 1));
        double probDomRec = (dom / total) * (rec / (total - 1));
        double probHetDom = (het / total) * (dom / (total - 1));
        double probHetHet = (het / total) * ((het - 1) / (total - 1));
        double probHetRec = (het / total) * (rec / (total - 1));
        double probRecDom = (rec / total) * (dom / (total - 1));
        double probRecHet = (rec / total) * (het / (total - 1));
        double probRecRec = (rec / total) * ((rec - 1) / (total - 1));
        double odds = probDomDom + probDomHet + probDomRec + probHetDom + (probHetHet * 0.75) + (probHetRec * 0.5) + probRecDom + (probRecHet * 0.5);
        System.out.println(odds);
    }
}