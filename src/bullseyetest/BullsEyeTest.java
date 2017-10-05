/**
 * Lucy Matulis
 * October 5th, 2017
 * This program creates a window containing a bull's eye with 2 random alternating colours.
 * The program does not take user input.
 */

package bullseyetest;
import javax.swing.JFrame;

/**   
 *
 * @author lumat8093
 */
public class BullsEyeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           bullsEye panel = new bullsEye();
           JFrame x = new JFrame();
           x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           x.add(panel);
           x.setSize(230, 250);      
           x.setVisible(true);
           x.setResizable(false);
           
    }
    
}
