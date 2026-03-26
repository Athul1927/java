import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="HelloWorld.class" width=400 height=300>
</applet>
*/

public class HelloWorld extends Applet
{
    public void paint(Graphics g)
    {
        // Face color
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(150, 100, 20, 20);
        g.fillOval(230, 100, 20, 20);

        // Nose
        g.setColor(Color.RED);
        g.fillOval(195, 130, 15, 15);

        // Smile
        g.setColor(Color.BLACK);
        g.drawArc(150, 150, 100, 50, 0, -180);
    }
}