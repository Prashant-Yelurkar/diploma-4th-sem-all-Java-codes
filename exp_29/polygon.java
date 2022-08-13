import java.awt.*;
import java.applet.*;
public class polygon extends Applet
{
    public void paint(Graphics g)
    {

        g.drawString("Draw Polygon 4 ponint",40,50);
        int x[]={90,50,130,90};
        int y[]={80,120,120,80};
        g.drawPolygon(x,y,4);
    }
}
/*<applet code=polygon.class width=200 height=200></applet>*/