import java.applet.*;
import java.awt.*;
public class shape extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Draw Rectangle",35,20);
        g.drawRect(60,30,40,40);
        
        g.drawString("Fill Rectangle",35,90);
        g.fillRect(60,100,40,40);

        g.drawString("Round-Rectangle",30,160);
        g.drawRoundRect(60,170,40,40,10,10);

        g.drawString("Fill-Round-Rectangle",15,230);
        g.fillRoundRect(60,240,40,40,10,10);

        g.drawString("Horizontal line",30,300);
        g.drawLine(30,310,120,310);
        g.drawLine(30,320,120,320);

        g.drawString("Vertical line",30,340);
        g.drawLine(60,350,60,370);
        g.drawLine(90,350,90,370);


        g.drawString("Circle",60,400);
        g.drawOval(60,410,40,40);

        g.drawString("Fill Circle",60,470);
        g.fillOval(60,480,40,40);
        
        g.drawString("Oval",60,540);
        g.drawOval(30,550,80,40);

        g.drawString("Fill Oval",40,610);
        g.fillOval(30,620,80,40);


        g.drawString("Draw Arc Right",180,20);
        g.drawArc(190,30,40,40,90,-180);

        g.drawString("Draw Arc Left",180,90);
        g.drawArc(190,100,40,40,90,180);

        g.drawString("Fill Arc Right",180,160);
        g.fillArc(190,170,40,40,90,-180);

        g.drawString("Fill Arc left",180,220);
        g.fillArc(190,230,40,40,90,180);


        g.drawString("Draw Polygon 4 ponint",160,290);
        int x[]={210,170,250,210};
        int y[]={300,350,350,300};
        g.drawPolygon(x,y,4);


        g.drawString("Fill Polygon 4 ponint",160,370);
        int a[]={210,170,250,210};
        int b[]={390,440,440,390};
        g.fillPolygon(a,b,4);


        Font f = new Font("Time New Roman",Font.BOLD,20);
        g.setFont(f);
        String strfont="Set Font Time";
        g.drawString(strfont,150,490);

        String strcolor="Set Color Red";
        g.setColor(Color.red);
        g.drawString(strcolor,150,520);

    }
}
/*<applet code=shape.class width=290 height=800></applet>*/