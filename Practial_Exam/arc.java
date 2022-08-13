import java.applet.*;
import java.awt.*;

public class arc extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillArc(20,20,80,80,0,-180);
        g.drawString("Arc with fill color",20,140);
    }
}
/*<applet code="arc.class" width ="140" Height="200"></applet>*/