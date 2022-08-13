/*
<applet code="SetBackgroundColoeExample" width=200 Height =200></applet>
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class SetBackgroundColoeExample extends Applet
{
    public void paint(Graphics g)
    {
        /*
        *setbackground color of an applet using
        *void setBacground(Color c)method
        */
        setBackground(Color.red);
    }
}