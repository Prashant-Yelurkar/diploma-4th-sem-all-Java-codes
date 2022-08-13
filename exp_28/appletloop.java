import java.awt.*;
import java.applet.*;
public class appletloop extends Applet
{
    public void paint(Graphics g)
    {
        for(int i=0; i<=6; i++)
        {
            if((i%2)==0)
            {
                g.drawRect(120, i*60+10, 50, 50);
            }
            else
            {
                g.fillRect(120, i*60+10, 50, 50);
            }
        }
    }
}
/*<applet code=appletloop.class width=400 height = 1000></applet>*/