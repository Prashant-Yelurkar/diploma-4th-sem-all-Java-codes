/* 
 <applet code="StatusMsg.class" width=300 height=200> 
 </applet> 
 */ 
 import java.applet.*; 
 import java.awt.*; 
 public class StatusMsg extends Applet 
 { 
	public void init()
	{
		System.out.println("Initialized");
	}

    public void paint(Graphics g) 
    { 
        g.setColor(Color.red);
        g.fillOval(10,10,50,50);  
        showStatus("Hello Circle");  //The text in status bar will be shown 
    } 
 }