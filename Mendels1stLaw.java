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
        double probDomDom = (dom / total) * (dom / (total - 1));
        System.out.println(probDomDom);
        double probDomHet = (dom / total) * (het / (total - 1));
        System.out.println(probDomHet);
        double probDomRec = (dom / total) * (rec / (total - 1));
        System.out.println(probDomRec);
        double probHetDom = (het / total) * (dom / (total - 1));
        System.out.println(probHetDom);
        double probHetHet = (het / total) * (het / (total - 1));
        System.out.println(probHetHet);
        double probHetRec = (het / total) * (rec / (total - 1));
        System.out.println(probHetRec);
        double probRecDom = (rec / total) * (dom / (total - 1));
        System.out.println(probRecDom);
        double probRecHet = (rec / total) * (het / (total - 1));
        System.out.println(probRecHet);
        double probRecRec = (rec / total) * (rec / (total - 1));
        System.out.println(probRecRec);
        double totalProb = probDomDom + probDomHet + probDomRec + probHetHet + probHetRec + probRecRec;
        System.out.println(totalProb);
    }
}
