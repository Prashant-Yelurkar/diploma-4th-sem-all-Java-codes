import java.awt.*;
import java.applet.*;

public class applet3 extends Applet
{
    Font f2 = new Font("Time New Roman",Font.BOLD,24);
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.setFont(f2);
        g.drawString("Welcome to the World of Applet",10,100);
    }
    
}
/*<applet code=applet3.class width=400 height = 200></applet>*/