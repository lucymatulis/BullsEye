/**
 * This class draws the elipses that create the bull's eye and fills them with one of two
 * random colours.
 */

package bullseyetest;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;
/**
 *
 * @author lumat8093
 */

public class bullsEye extends JPanel {
    private static final SecureRandom rn = new SecureRandom();
        Color color1 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
        Color color2 = new Color (rn.nextInt(254), rn.nextInt(254), rn.nextInt(254));
   
    /**
     * This Method draws the bull's eye. It creates the ovals and fills them with the random colours.
     */
    public void paintComponent (Graphics g){
        super.paintComponent(g);
               
        g.setColor(color1);//largest circle
        g.fillOval(10, 10, 200, 200);
        g.setColor(color2);
        g.fillOval(30, 30, 160, 160);
        g.setColor(color1);
        g.fillOval(50, 50, 120, 120);
        g.setColor(color2);
        g.fillOval(70, 70, 80, 80); 
        g.setColor(color1);
        g.fillOval(90, 90, 40, 40);
        g.setColor(color2);
        g.fillOval(110, 110, 5, 5);//smallest circle
    }
}
    
    
    
    
    

