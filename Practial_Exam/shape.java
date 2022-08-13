import java.applet.*;
import java.awt.*;

public class shape extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRoundRect(15,10,110,110,30,30);
        g.setColor(Color.blue);
        
        g.drawString("The Round Rectangle",10,140);
    }
}
/*<applet code="shape.class" width ="140" Height="200"></applet>*/