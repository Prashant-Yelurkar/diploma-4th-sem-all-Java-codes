import java.awt.*;
import java.applet.*;

public class human extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Human Face Using Applet.",80,80);

        g.drawOval(70,120,150,150);
        g.fillOval(110,150,30,30);
        g.fillOval(150,150,30,30);
        int x[]={145,135,155,145};
        int y[]={180,210,210,180};
        g.setColor(Color.cyan);
        g.fillPolygon(x,y,4);
        g.setColor(Color.pink);
        g.fillArc(100,200,90,60,180,180);

        g.fillArc(45,165,60,60,90,180);
        g.fillArc(185,165,60,60,90,-180);
    }

}
/*<applet code=human.class width=300 height=300></applet>*/