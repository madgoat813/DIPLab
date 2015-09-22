package dip.lab2.student.solution1;

// An useful import if you need it.
import dip.lab2.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
   
 
    public static void main(String[] args) {
        
        TipCalculator calculator = new FoodTipCalculator(ServiceQuality.FAIR, 120.68);
        
        TipCalculator calculator2 = new BaggageTipCalculator(ServiceQuality.GOOD, 4);
        
        TipService ts = new TipService(calculator);
        
        TipService ts2 = new TipService(calculator2);
        
        System.out.println(String.format("%.2f", ts.getTip()));
        
        System.out.println(String.format("%.2f", ts2.getTip()));
    }

}
