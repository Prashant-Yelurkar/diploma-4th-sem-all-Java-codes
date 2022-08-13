import java.awt.*;
import java.applet.*;

public class applet2 extends Applet
{
    Font f2 = new Font("Time New Roman",Font.BOLD,24);
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.setFont(f2);
        g.drawString("Hello Friends",100,100);
    }
}
