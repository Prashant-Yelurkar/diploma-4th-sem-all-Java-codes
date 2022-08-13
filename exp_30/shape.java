import java.awt.*;
import java.applet.*;

public class shape extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Cone",80,50);
        g.drawLine(90,70,50,110);
        g.drawLine(90,70,130,110);
        g.drawArc(50,90,80,40,180,180);


        g.drawString("Cylinder",80,150);
        g.drawOval(70,160,60,20);
        g.drawLine(70,170,70,220);
        g.drawLine(130,170,130,220);
        g.drawOval(70,210,60,20);


        g.drawString("Cube",80,245);
        g.drawRect(70,250,60,60);
        g.drawRect(90,270,60,60);
        g.drawLine(70,250,90,270);
        g.drawLine(130,250,150,270);

        g.drawLine(70,310,90,330);
        g.drawLine(130,310,150,330);

        g.drawString("Squre Inside Circle",50,350);
        g.drawOval(80,360,80,80);
        g.drawRect(95,375,50,50);


        g.drawString("Circle inside Square",50,460);
        g.drawRect(80,470,80,80);
        g.drawOval(80,470,80,80);
        
    }
}
/*<applet code=shape.class width=200 Height=600></applet>*/