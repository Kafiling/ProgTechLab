//2. file LightComponent.java
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

// A component that draws two rectangles.
public class  LightComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(75, 50, 100, 280);
        g2.draw(box);

        // Draw circle
        Ellipse2D.Double circle1 = new Ellipse2D.Double(85, 60, 80, 80);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(85, 150, 80, 80);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(85, 240, 80, 80);
        g2.setColor(Color.RED);
        g2.fill(circle1);

        g2.setColor(Color.YELLOW);
        g2.fill(circle2);

        g2.setColor(Color.GREEN);
        g2.fill(circle3);

    }
}