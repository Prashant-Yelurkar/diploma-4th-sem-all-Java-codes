import java.awt.*;
import java.applet.*;

public class applet4 extends Applet
{
    Font f2 = new Font("Time New Roman",Font.BOLD,24);
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.setFont(f2);
        g.drawString("Welcome to the World of Applet",10,100);
        g.drawRect(120,150,150,150);
        g.setColor(Color.green);
        g.fillRect(121,151,149,149);
        g.setColor(Color.black);
        g.drawOval(130,160,130,130);
        g.setColor(Color.white);
        g.fillOval(150,180,40,40);
        g.fillOval(200,180,40,40);
        g.fillArc(160,220,70,60,180,180);
    }
    
}
/*<applet code=applet4.class width=400 height = 350></applet>*/