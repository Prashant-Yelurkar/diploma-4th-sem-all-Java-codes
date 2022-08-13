import java.applet.*;
import java.awt.*;
import java.awt.event.*;  



public class project extends Applet implements ActionListener 
{
        int dice = 0;
        int i2 = 0;
        int i = 0;
        int x = 0 ;
        int y = 0 ;
        int x1 =0 ;
        int y1 = 0 ;
        int x2 = 0 ;
        int y2 = 0 ;
        int x3 =0;
        int y3 = 0 ;
        int start = 0;
        String msg2,msg,msg1,str;
        int player1 =0;
        int player2 = 0;
       
        
        Color c[] = {   Color.pink /* 0 */,      Color.cyan /* 1 */,         Color.yellow /* 2 */ ,   Color.white/* 3 */, 
                        Color.orange /* 4 */,    Color.green /* 5 */,        Color.darkGray /* 6 */,  Color.gray /* 7 */,     
                        Color.lightGray /* 8 */, Color.magenta /* 9 */,      Color.red /* 10 */,
                        Color.pink /* 11 */,     Color.black /* 12 */};

                Font o = new Font ("TimesRoman", Font.BOLD , 20);
                Font f = new Font ("TimesRoman", Font.BOLD , 40);

        Button st = new Button("Start"); // start button
        public void paint(Graphics g)
        {
                Graphics2D g2 = (Graphics2D) g;
                        if(start==0)
                        {
                                st.setFont(f);
                                st.setForeground(c[3]);
                                setLayout(null);
                                st.setBackground(c[5]);
                                st.setBounds(700,50,120,60);
                                add(st);
                                st.addActionListener(this);
                        }
                        if(start==1)
                        {
                                st.setBackground(c[10]);
                        }
                                           
                        
                        

                        g2.setStroke(new BasicStroke(1)); 
                        g.setFont (f);
                        g.drawString("SNAKE AND LADDER",110,38);


                        g.setColor(c[12]);
                        g.drawRect(30,50,61,60);
                        g.setColor(c[0]);
                        g.fillRect(31,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("100",35,65);


                        g.setColor(c[12]);
                        g.drawRect(90,50,61,60);
                        g.setColor(c[1]);
                        g.fillRect(91,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("99",95,65);


                        g.setColor(c[12]);
                        g.drawRect(150,50,61,60);
                        g.setColor(c[2]);
                        g.fillRect(151,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("98",155,65);

                        g.setColor(c[12]);
                        g.drawRect(210,50,61,60);
                        g.setColor(c[3]);
                        g.fillRect(211,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("97",215,65);

                        g.setColor(c[12]);
                        g.drawRect(270,50,61,60);
                        g.setColor(c[4]);
                        g.fillRect(271,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("96",275,65);

                        g.setColor(c[12]);
                        g.drawRect(330,50,61,60);
                        g.setColor(c[0]);
                        g.fillRect(331,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("95",335,65);
                
                        g.setColor(c[12]);
                        g.drawRect(390,50,61,60);
                        g.setColor(c[1]);
                        g.fillRect(391,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("94",395,65);

                        g.setColor(c[12]);
                        g.drawRect(450,50,61,60);
                        g.setColor(c[2]);
                        g.fillRect(451,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("93",455,65);

                        g.setColor(c[12]);
                        g.drawRect(510,50,61,60);
                        g.setColor(c[3]);
                        g.fillRect(511,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("92",515,65);

                        g.setColor(c[12]);
                        g.drawRect(570,50,61,60);
                        g.setColor(c[4]);
                        g.fillRect(571,51,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("91",575,65);


                        g.setColor(c[12]);
                        g.drawRect(30,110,61,60);
                        g.setColor(c[4]);
                        g.fillRect(31,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("81",35,125);


                        g.setColor(c[12]);
                        g.drawRect(90,110,61,60);
                        g.setColor(c[0]);
                        g.fillRect(91,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("82",95,125);


                        g.setColor(c[12]);
                        g.drawRect(150,110,61,60);
                        g.setColor(c[1]);
                        g.fillRect(151,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("83",155,125);

                        g.setColor(c[12]);
                        g.drawRect(210,110,61,60);
                        g.setColor(c[2]);
                        g.fillRect(211,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("84",215,125);

                        g.setColor(c[12]);
                        g.drawRect(270,110,61,60);
                        g.setColor(c[3]);
                        g.fillRect(271,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("85",275,125);

                        g.setColor(c[12]);
                        g.drawRect(330,110,61,60);
                        g.setColor(c[4]);
                        g.fillRect(331,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("86",335,125);
                
                        g.setColor(c[12]);
                        g.drawRect(390,110,61,60);
                        g.setColor(c[0]);
                        g.fillRect(391,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("87",395,125);

                        g.setColor(c[12]);
                        g.drawRect(450,110,61,60);
                        g.setColor(c[1]);
                        g.fillRect(451,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("88",455,125);

                        g.setColor(c[12]);
                        g.drawRect(510,110,61,60);
                        g.setColor(c[2]);
                        g.fillRect(511,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("89",515,125);

                        g.setColor(c[12]);
                        g.drawRect(570,110,61,60);
                        g.setColor(c[3]);
                        g.fillRect(571,111,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("90",575,125);


                        g.setColor(c[12]);
                        g.drawRect(30,170,61,60);
                        g.setColor(c[3]);
                        g.fillRect(31,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("80",35,185);


                        g.setColor(c[12]);
                        g.drawRect(90,170,61,60);
                        g.setColor(c[4]);
                        g.fillRect(91,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("79",95,185);


                        g.setColor(c[12]);
                        g.drawRect(150,170,61,60);
                        g.setColor(c[0]);
                        g.fillRect(151,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("78",155,185);

                        g.setColor(c[12]);
                        g.drawRect(210,170,61,60);
                        g.setColor(c[1]);
                        g.fillRect(211,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("77",215,185);

                        g.setColor(c[12]);
                        g.drawRect(270,170,61,60);
                        g.setColor(c[2]);
                        g.fillRect(271,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("76",275,185);

                        g.setColor(c[12]);
                        g.drawRect(330,170,61,60);
                        g.setColor(c[3]);
                        g.fillRect(331,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("75",335,185);
                
                        g.setColor(c[12]);
                        g.drawRect(390,170,61,60);
                        g.setColor(c[4]);
                        g.fillRect(391,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("74",395,185);

                        g.setColor(c[12]);
                        g.drawRect(450,170,61,60);
                        g.setColor(c[0]);
                        g.fillRect(451,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("73",455,185);

                        g.setColor(c[12]);
                        g.drawRect(510,170,61,60);
                        g.setColor(c[1]);
                        g.fillRect(511,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("72",515,185);

                        g.setColor(c[12]);
                        g.drawRect(570,170,61,60);
                        g.setColor(c[2]);
                        g.fillRect(571,171,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("71",575,185);


                        g.setColor(c[12]);
                        g.drawRect(30,230,61,60);
                        g.setColor(c[2]);
                        g.fillRect(31,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("61",35,245);


                        g.setColor(c[12]);
                        g.drawRect(90,230,61,60);
                        g.setColor(c[3]);
                        g.fillRect(91,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("62",95,245);


                        g.setColor(c[12]);
                        g.drawRect(150,230,61,60);
                        g.setColor(c[4]);
                        g.fillRect(151,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("63",155,245);

                        g.setColor(c[12]);
                        g.drawRect(210,230,61,60);
                        g.setColor(c[0]);
                        g.fillRect(211,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("64",215,245);

                        g.setColor(c[12]);
                        g.drawRect(270,230,61,60);
                        g.setColor(c[1]);
                        g.fillRect(271,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("65",275,245);

                        g.setColor(c[12]);
                        g.drawRect(330,230,61,60);
                        g.setColor(c[2]);
                        g.fillRect(331,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("66",335,245);
                
                        g.setColor(c[12]);
                        g.drawRect(390,230,61,60);
                        g.setColor(c[3]);
                        g.fillRect(391,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("67",395,245);

                        g.setColor(c[12]);
                        g.drawRect(450,230,61,60);
                        g.setColor(c[4]);
                        g.fillRect(451,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("68",455,245);

                        g.setColor(c[12]);
                        g.drawRect(510,230,61,60);
                        g.setColor(c[0]);
                        g.fillRect(511,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("69",515,245);

                        g.setColor(c[12]);
                        g.drawRect(570,230,61,60);
                        g.setColor(c[1]);
                        g.fillRect(571,231,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("70",575,245);


                        g.setColor(c[12]);
                        g.drawRect(30,290,61,60);
                        g.setColor(c[1]);
                        g.fillRect(31,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("60",35,305);


                        g.setColor(c[12]);
                        g.drawRect(90,290,61,60);
                        g.setColor(c[2]);
                        g.fillRect(91,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("59",95,305);


                        g.setColor(c[12]);
                        g.drawRect(150,290,61,60);
                        g.setColor(c[3]);
                        g.fillRect(151,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("58",155,305);

                        g.setColor(c[12]);
                        g.drawRect(210,290,61,60);
                        g.setColor(c[4]);
                        g.fillRect(211,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("57",215,305);

                        g.setColor(c[12]);
                        g.drawRect(270,290,61,60);
                        g.setColor(c[0]);
                        g.fillRect(271,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("56",275,305);

                        g.setColor(c[12]);
                        g.drawRect(330,290,61,60);
                        g.setColor(c[1]);
                        g.fillRect(331,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("55",335,305);
                
                        g.setColor(c[12]);
                        g.drawRect(390,290,61,60);
                        g.setColor(c[2]);
                        g.fillRect(391,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("54",395,305);

                        g.setColor(c[12]);
                        g.drawRect(450,290,61,60);
                        g.setColor(c[3]);
                        g.fillRect(451,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("53",455,305);

                        g.setColor(c[12]);
                        g.drawRect(510,290,61,60);
                        g.setColor(c[4]);
                        g.fillRect(511,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("52",515,305);

                        g.setColor(c[12]);
                        g.drawRect(570,290,61,60);
                        g.setColor(c[0]);
                        g.fillRect(571,291,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("51",575,305);


                        g.setColor(c[12]);
                        g.drawRect(30,350,61,60);
                        g.setColor(c[0]);
                        g.fillRect(31,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("41",35,365);


                        g.setColor(c[12]);
                        g.drawRect(90,350,61,60);
                        g.setColor(c[1]);
                        g.fillRect(91,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("42",95,365);


                        g.setColor(c[12]);
                        g.drawRect(150,350,61,60);
                        g.setColor(c[2]);
                        g.fillRect(151,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("43",155,365);

                        g.setColor(c[12]);
                        g.drawRect(210,350,61,60);
                        g.setColor(c[3]);
                        g.fillRect(211,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("44",215,365);

                        g.setColor(c[12]);
                        g.drawRect(270,350,61,60);
                        g.setColor(c[4]);
                        g.fillRect(271,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("45",275,365);

                        g.setColor(c[12]);
                        g.drawRect(330,350,61,60);
                        g.setColor(c[0]);
                        g.fillRect(331,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("46",335,365);
                
                        g.setColor(c[12]);
                        g.drawRect(390,350,61,60);
                        g.setColor(c[1]);
                        g.fillRect(391,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("47",395,365);

                        g.setColor(c[12]);
                        g.drawRect(450,350,61,60);
                        g.setColor(c[2]);
                        g.fillRect(451,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("48",455,365);

                        g.setColor(c[12]);
                        g.drawRect(510,350,61,60);
                        g.setColor(c[3]);
                        g.fillRect(511,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("49",515,365);

                        g.setColor(c[12]);
                        g.drawRect(570,350,61,60);
                        g.setColor(c[4]);
                        g.fillRect(571,351,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("50",575,365);


                        g.setColor(c[12]);
                        g.drawRect(30,410,61,60);
                        g.setColor(c[4]);
                        g.fillRect(31,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("40",35,425);


                        g.setColor(c[12]);
                        g.drawRect(90,410,61,60);
                        g.setColor(c[0]);
                        g.fillRect(91,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("39",95,425);


                        g.setColor(c[12]);
                        g.drawRect(150,410,61,60);
                        g.setColor(c[1]);
                        g.fillRect(151,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("38",155,425);

                        g.setColor(c[12]);
                        g.drawRect(210,410,61,60);
                        g.setColor(c[2]);
                        g.fillRect(211,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("37",215,425);

                        g.setColor(c[12]);
                        g.drawRect(270,410,61,60);
                        g.setColor(c[3]);
                        g.fillRect(271,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("36",275,425);

                        g.setColor(c[12]);
                        g.drawRect(330,410,61,60);
                        g.setColor(c[4]);
                        g.fillRect(331,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("35",335,425);
                
                        g.setColor(c[12]);
                        g.drawRect(390,410,61,60);
                        g.setColor(c[0]);
                        g.fillRect(391,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("34",395,425);

                        g.setColor(c[12]);
                        g.drawRect(450,410,61,60);
                        g.setColor(c[1]);
                        g.fillRect(451,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("33",455,425);

                        g.setColor(c[12]);
                        g.drawRect(510,410,61,60);
                        g.setColor(c[2]);
                        g.fillRect(511,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("32",515,425);

                        g.setColor(c[12]);
                        g.drawRect(570,410,61,60);
                        g.setColor(c[3]);
                        g.fillRect(571,411,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("31",575,425);


                        g.setColor(c[12]);
                        g.drawRect(30,470,61,60);
                        g.setColor(c[3]);
                        g.fillRect(31,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("21",35,485);


                        g.setColor(c[12]);
                        g.drawRect(90,470,61,60);
                        g.setColor(c[4]);
                        g.fillRect(91,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("22",95,485);


                        g.setColor(c[12]);
                        g.drawRect(150,470,61,60);
                        g.setColor(c[0]);
                        g.fillRect(151,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("23",155,485);

                        g.setColor(c[12]);
                        g.drawRect(210,470,61,60);
                        g.setColor(c[1]);
                        g.fillRect(211,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("24",215,485);

                        g.setColor(c[12]);
                        g.drawRect(270,470,61,60);
                        g.setColor(c[2]);
                        g.fillRect(271,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("25",275,485);

                        g.setColor(c[12]);
                        g.drawRect(330,470,61,60);
                        g.setColor(c[3]);
                        g.fillRect(331,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("26",335,485);
                
                        g.setColor(c[12]);
                        g.drawRect(390,470,61,60);
                        g.setColor(c[4]);
                        g.fillRect(391,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("27",395,485);

                        g.setColor(c[12]);
                        g.drawRect(450,470,61,60);
                        g.setColor(c[0]);
                        g.fillRect(451,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("28",455,485);

                        g.setColor(c[12]);
                        g.drawRect(510,470,61,60);
                        g.setColor(c[1]);
                        g.fillRect(511,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("29",515,485);

                        g.setColor(c[12]);
                        g.drawRect(570,470,61,60);
                        g.setColor(c[2]);
                        g.fillRect(571,471,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("30",575,485);


                        g.setColor(c[12]);
                        g.drawRect(30,530,61,60);
                        g.setColor(c[2]);
                        g.fillRect(31,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("20",35,545);


                        g.setColor(c[12]);
                        g.drawRect(90,530,61,60);
                        g.setColor(c[3]);
                        g.fillRect(91,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("19",95,545);


                        g.setColor(c[12]);
                        g.drawRect(150,530,61,60);
                        g.setColor(c[4]);
                        g.fillRect(151,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("18",155,545);

                        g.setColor(c[12]);
                        g.drawRect(210,530,61,60);
                        g.setColor(c[0]);
                        g.fillRect(211,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("17",215,545);

                        g.setColor(c[12]);
                        g.drawRect(270,530,61,60);
                        g.setColor(c[1]);
                        g.fillRect(271,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("16",275,545);

                        g.setColor(c[12]);
                        g.drawRect(330,530,61,60);
                        g.setColor(c[2]);
                        g.fillRect(331,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("15",335,545);
                
                        g.setColor(c[12]);
                        g.drawRect(390,530,61,60);
                        g.setColor(c[3]);
                        g.fillRect(391,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("14",395,545);

                        g.setColor(c[12]);
                        g.drawRect(450,530,61,60);
                        g.setColor(c[4]);
                        g.fillRect(451,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("13",455,545);

                        g.setColor(c[12]);
                        g.drawRect(510,530,61,60);
                        g.setColor(c[0]);
                        g.fillRect(511,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("12",515,545);

                        g.setColor(c[12]);
                        g.drawRect(570,530,61,60);
                        g.setColor(c[1]);
                        g.fillRect(571,531,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("11",575,545);


                        g.setColor(c[12]);
                        g.drawRect(30,590,61,60);
                        g.setColor(c[1]);
                        g.fillRect(31,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("1",35,605);


                        g.setColor(c[12]);
                        g.drawRect(90,590,61,60);
                        g.setColor(c[2]);
                        g.fillRect(91,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("2",95,605);


                        g.setColor(c[12]);
                        g.drawRect(150,590,61,60);
                        g.setColor(c[3]);
                        g.fillRect(151,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("3",155,605);

                        g.setColor(c[12]);
                        g.drawRect(210,590,61,60);
                        g.setColor(c[4]);
                        g.fillRect(211,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("4",215,605);

                        g.setColor(c[12]);
                        g.drawRect(270,590,61,60);
                        g.setColor(c[0]);
                        g.fillRect(271,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("5",275,605);

                        g.setColor(c[12]);
                        g.drawRect(330,590,61,60);
                        g.setColor(c[1]);
                        g.fillRect(331,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("6",335,605);
                
                        g.setColor(c[12]);
                        g.drawRect(390,590,61,60);
                        g.setColor(c[2]);
                        g.fillRect(391,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("7",395,605);

                        g.setColor(c[12]);
                        g.drawRect(450,590,61,60);
                        g.setColor(c[3]);
                        g.fillRect(451,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("8",455,605);

                        g.setColor(c[12]);
                        g.drawRect(510,590,61,60);
                        g.setColor(c[4]);
                        g.fillRect(511,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("9",515,605);

                        g.setColor(c[12]);
                        g.drawRect(570,590,61,60);
                        g.setColor(c[0]);
                        g.fillRect(571,591,60,59);
                        g.setColor(c[12]);
                        g.setFont (o);
                        g.drawString("10",575,605);




                        // Graphics2D g2 = (Graphics2D) g;
                        
                        g2.setStroke(new BasicStroke(3));
                        g.setColor(c[12]);
                        g.drawLine(58,150,58,560);
                        g.drawLine(75,150,75,560);


                        g.drawLine(58,165,75,165);
                        g.drawLine(58,190,75,190);
                        g.drawLine(58,215,75,215);
                        g.drawLine(58,240,75,240);
                        g.drawLine(58,265,75,265);
                        g.drawLine(58,290,75,290);
                        g.drawLine(58,315,75,315);
                        g.drawLine(58,340,75,340);
                        g.drawLine(58,365,75,365);
                        g.drawLine(58,390,75,390);
                        g.drawLine(58,415,75,415);
                        g.drawLine(58,440,75,440);
                        g.drawLine(58,465,75,465);
                        g.drawLine(58,490,75,490);
                        g.drawLine(58,515,75,515);
                        g.drawLine(58,540,75,540);



                        g2.setStroke(new BasicStroke(3));
                        g.setColor(c[12]);
                        g.drawLine(603,90,603,320);
                        g.drawLine(620,90,620,320);
                        g.drawLine(603,105,620,105);
                        g.drawLine(603,130,620,130);
                        g.drawLine(603,155,620,155);
                        g.drawLine(603,180,620,180);
                        g.drawLine(603,205,620,205);
                        g.drawLine(603,230,620,230);
                        g.drawLine(603,255,620,255);
                        g.drawLine(603,280,620,280);    
                        g.drawLine(603,305,620,305);   

                        g2.setStroke(new BasicStroke(3));
                        g.setColor(c[12]);
                        g.drawLine(535,495,405,625);
                        g.drawLine(555,510,420,645);

                        g.drawLine(515,515,531,531);
                        g.drawLine(495,535,513,554);
                        g.drawLine(478,555,495,572);

                        g.drawLine(460,570,476,586);
                        g.drawLine(445,589,461,606);
                        g.drawLine(424,609,440,624);






                        g2.setStroke(new BasicStroke(10));//snake 62
                        g.setColor(c[10]);
                        g.drawOval(110,250,30,30);
                        g.drawArc(100,260, 60, 60,70,-160 );
                        g.drawArc(100,320, 60, 60,90,180 );
                        g.drawArc(100,380, 60, 60,90,-180 );
                        g.drawArc(100,440, 60, 60,90,180 );
                        g.drawArc(100,500, 60, 60,90,-200 );
                        g.setColor(c[2]);
                        g.fillOval(110,250,30,30);
                        g.setColor(c[3]);
                        g.fillOval(150,270,10,10);
                        g.fillOval(140,310,10,10);
                        g.fillOval(97,340,10,10);
                        g.fillOval(140,380,10,10);
                        g.fillOval(140,430,10,10);
                        g.fillOval(97,470,10,10);
                        g.fillOval(150,510,10,10);
                        g.fillOval(140,550,10,10);


                
                        g.setColor(c[5]);//snake 94
                        g.drawOval(400,70,20,20);
                        g.drawArc(400,60, 60, 60,140,100);
                        g.drawArc(400,118, 30, 30,80,-160);
                        g.drawLine(430,138,350,210);
                        g.setColor(c[6]);
                        g.fillOval(400,70,20,20);
                        g.setColor(c[10]);
                        g.fillOval(400,100,10,10);
                        g.fillOval(395,160,10,10);
                        g.fillOval(350,200,10,10);
                        

                        g.setColor(c[8]);//snake 93
                        g.drawOval(470,70,20,20);
                        g.drawLine(480,90,480,210);
                        g.setColor(c[10]);
                        g.fillOval(470,70,20,20);
                        g.setColor(c[6]);
                        g.fillOval(475,110,10,10);
                        g.fillOval(475,150,10,10);
                        g.fillOval(475,190,10,10);





                        g.setColor(c[11]);//snake85
                        g.drawOval(290,130,20,20);
                        g.drawLine(300,157,300,250);
                        g.drawLine(300,250,420,250);    
                        g.drawLine(420,250,420,370);
                        g.setColor(c[6]);
                        g.fillOval(290,130,20,20);  
                        g.setColor(c[5]);
                        g.fillOval(295,170,10,10);
                        g.fillOval(295,200,10,10);   
                        g.fillOval(295,230,10,10);
                        g.fillOval(325,245,10,10);
                        g.fillOval(355,245,10,10);
                        g.fillOval(385,245,10,10);
                        g.fillOval(415,245,10,10);
                        g.fillOval(415,275,10,10);
                        g.fillOval(415,305,10,10);
                        g.fillOval(415,335,10,10);
                        g.fillOval(415,365,10,10);

                        
                        g.setColor(c[9]);//snake 17
                        g.drawOval(240,540,20,20);
                        g.drawLine(250,560,250,600); 
                        g.drawArc(250,590, 30, 30,180,90);
                        g.drawLine(265,620,350,620);
                        g.setColor(c[2]);
                        g.fillOval(240,540,20,20);
                        g.setColor(c[3]);
                        g.fillOval(245,570,10,10);
                        g.fillOval(245,600,10,10);
                        g.fillOval(275,615,10,10);
                        g.fillOval(305,615,10,10);
                        g.fillOval(335,615,10,10);
                        


                        g.setColor(c[10]);//snake 38
                        g.drawOval(180,420,20,20);
                        g.drawLine(204,434,600,610);
                        g.setColor(c[2]);
                        g.fillOval(180,420,20,20);
                        g.setColor(c[2]);
                        g.fillOval(210,434,9,9);
                        g.fillOval(250,452,9,9);
                        g.fillOval(290,470,9,9);
                        g.fillOval(330,488,9,9);
                        g.fillOval(370,506,9,9);
                        g.fillOval(410,523,9,9);
                        g.fillOval(450,540,9,9);
                        g.fillOval(490,558,9,9);
                        g.fillOval(530,576,9,9);
                        g.fillOval(570,595,9,9);


                        g.setColor(c[5]);
                        g.drawOval(120,70,20,20);
                        g.drawLine(130,70,130,200);
                        g.drawLine(130,200,240,200);
                        g.drawLine(240,200,240,500);
                        g.drawLine(240,500,180,500);
                        g.drawLine(180,500,180,620);
                        g.drawLine(180,620,180,620);
                        g.drawLine(180,620,60,620);
                        g.setColor(c[10]);
                        g.fillOval(120,70,20,20);
                        g.setColor(c[7]);
                        g.fillOval(126,100,9,9);
                        g.fillOval(126,140,9,9);
                        g.fillOval(126,180,9,9);
                        g.fillOval(150,195,9,9);
                        g.fillOval(190,195,9,9);
                        g.fillOval(230,195,9,9);
                        g.fillOval(236,220,9,9);
                        g.fillOval(236,260,9,9);
                        g.fillOval(236,300,9,9);
                        g.fillOval(236,340,9,9);
                        g.fillOval(236,380,9,9);
                        g.fillOval(236,420,9,9);
                        g.fillOval(236,460,9,9);
                        g.fillOval(236,490,9,9);
                        g.fillOval(206,495,9,9);
                        g.fillOval(176,495,9,9);
                        g.fillOval(176,535,9,9);
                        g.fillOval(176,575,9,9);
                        g.fillOval(176,615,9,9);
                        g.fillOval(146,615,9,9);
                        g.fillOval(116,615,9,9);
                        g.fillOval(86,615,9,9);
                        g.fillOval(56,615,9,9);








                        g.setColor(c[6]);//snake 50
                        g.drawOval(600,370,20,20);
                        g.drawLine(610,380,480,380);
                        g.drawLine(480,380,480,490);
                        g.setColor(c[10]);
                        g.fillOval(603,373,15,15);
                        g.setColor(c[3]);
                        g.fillOval(570,375,9,9);
                        g.fillOval(540,375,9,9);
                        g.fillOval(510,375,9,9);
                        g.fillOval(480,375,9,9);
                        g.fillOval(476,400,9,9);
                        g.fillOval(476,430,9,9);
                        g.fillOval(476,460,9,9);
                        g.fillOval(476,485,9,9);
                
                
                

                
                

                if(i==0 || i2==0)
                {
                        x=0;
                        y =0;
                        x1=0;
                        y1=0;
                        y2=0;
                        x2=0;
                        x3=0;
                        y2=0;
                        y3=0;

                }
                        
        
                        
                                 
                if((i<101 && i>0 )||  (i2<101 && i2>0))
                {
                        if(i<=10 )
                        {
                                y = 610;
                        }
                        else if(i<=20)
                        {
                               y = 550 ; 
                        }
                        else if(i<=30 )
                        {
                              y = 490 ;   
                        }
                        else if(i<=40 )
                        {
                                y = 430; 
                        }
                        else if(i<=50 )
                        {
                                y = 370; 
                        }
                        else if(i<=60)
                        {
                                y = 310 ; 
                        }
                        else if(i<=70 )
                        {
                                y = 250 ; 
                        }
                        else if (i<=80 )
                        {
                                y = 190 ; 
                        }
                        else if(i<=90 )
                        {
                                y = 130 ; 
                        }
                        else if(i<=100 )
                        {
                                y = 70;
                                 
                        }


                        if(i2<=10 )
                        {
                                y2 = 610;
                        }
                        else if(i2<=20)
                        {
                               y2 = 550 ; 
                        }
                        else if(i2<=30 )
                        {
                              y2 = 490 ;   
                        }
                        else if(i2<=40 )
                        {
                                y2 = 430 ; 
                        }
                        else if(i2<=50 )
                        {
                                y2 = 370; 
                        }
                        else if(i2<=60)
                        {
                                y2 = 310 ; 
                        }
                        else if(i2<=70 )
                        {
                                y2 = 250 ; 
                        }
                        else if (i2<=80 )
                        {
                                y2 = 190 ; 
                        }
                        else if(i2<=90 )
                        {
                                y2 = 130 ; 
                        }
                        else if(i2<=100 )
                        {
                                y2 = 70;
                                 
                        }




                               
                        if(i==1 || i==20 || i==21 || i==40 || i==41 || i==60 || i==61 ||i==80 || i==81 || i==100)
                        {
                                x = 60 ;
                                x1 = 55 ;
                                y1 = 75 ;
                        }
                        if(i2==1 || i2==20 || i2==21 || i2==40 || i2==41 || i2==60 || i2==61 ||i2==80 || i2==81 || i2==100)
                        {
                                x2 = 60 ;
                                x3 = 55 ;
                                y3 = 75 ;
                        }

                        

                        if(i==2 || i ==19 || i ==22 || i==39 || i==42 || i==59 || i==62 || i==79 || i==82 || i==99)
                        {
                                x = 120 ;
                                x1 = 115 ;
                                y1 = 135 ;
                        }
                        if(i2==2 || i2 ==19 || i2 ==22 || i2==39 || i2==42 || i2==59 || i2==62 || i2==79 || i2==82 || i2==99)
                        {
                                x2 = 120 ;
                                x3 = 115 ;
                                y3 = 135 ;
                        }    
                        

                        if(i==3 || i ==18 || i ==23 || i==38 || i==43 || i==58 || i==63 || i==78 || i==83 || i==98)
                        {
                                x = 180 ;
                                x1 = 175 ;
                                y1 = 195 ;                                       
                        }
                        if(i2==3 || i2 ==18 || i2==23 || i2==38 || i2==43 || i2==58 || i2==63 || i2==78 || i2==83 || i2==98)
                        {
                                x2 = 180 ;
                                x3 = 175 ;
                                y3 = 195 ;                                       
                        }



                        if(i==4 || i ==17 || i ==24 || i==37 || i==44 || i==57 || i==64 || i==77 || i==84 || i==97)
                        {
                                x = 240;
                                x1 = 235 ;
                                y1 = 255 ;
                        }
                        if(i2==4 || i2 ==17 || i2 ==24 || i2==37 || i2==44 || i2==57 || i2==64 || i2==77 || i2==84 || i2==97)
                        {
                                x2 = 240;
                                x3 = 235 ;
                                y3 = 255 ;
                        }

                        if(i==5 || i ==16 || i ==25 || i==36 || i==45 || i==56 || i==65 || i==76 || i==85 || i==96 )
                        {
                                x = 300 ;
                                x1 = 295 ;
                                y1 = 315 ;
                        }
                        if( i2==5 || i2 ==16 || i2 ==25 || i2==36 || i2==45 || i2==56 || i2==65 || i2==76 || i2==85 || i2==96)
                        {
                                x2 = 300 ;
                                x3 = 295 ;
                                y3 = 315 ;
                        }



                        if(i==6 || i ==15 || i ==26 || i==35 || i==46 || i==55 || i==66 || i==75 || i==86 || i==95)
                        {
                                x = 360;
                                x1 = 355 ;
                                y1 = 375 ; 
                        }
                        if( i2==6 || i2 ==15 || i2 ==26 || i2==35 || i2==46 || i2==55 || i2==66 || i2==75 || i2==86 || i2==95)
                        {
                                x2 = 360;
                                x3 = 355 ;
                                y3 = 375 ; 
                        }
  

                        if(i==7 || i ==14 || i ==27 || i==34 || i==47 || i==54 || i==67 || i==74 || i==87 || i==94)
                        {
                                x = 420 ;
                                x1 = 415 ;
                                y1 = 435 ;
                        }
                        if(i2==7 || i2 ==14 || i2 ==27 || i2==34 || i2==47 || i2==54 || i2==67 || i2==74 || i2==87 || i2==94)
                        {
                                x2 = 420 ;
                                x3 = 415 ;
                                y3 = 435 ;
                        }
                                

                        if(i==8 || i ==13 || i ==28 || i==33 || i==48 || i==53 || i==68 || i==73 || i==88 || i==93)
                        {
                                x = 480 ;
                                x1 = 475 ;
                                y1 = 495 ;
                        }
                        if(i2==8 || i2 ==13 || i2 ==28 || i2==33 || i2==48 || i2==53 || i2==68 || i2==73 || i2==88 || i2==93)
                        {
                                x2= 480 ;
                                x3 = 475 ;
                                y3 = 495 ;
                        }
                        if(i==9 || i ==12 || i ==29 || i==32 || i==49 || i==52 || i==69 || i==72 || i==89 || i==92)
                        {
                                x = 540 ;
                                x1 = 535 ;
                                y1 = 555 ;
                        }
                        if(i2==9 || i2 ==12 || i2 ==29 || i2==32 || i2==49 || i2==52 || i2==69 || i2==72 || i2==89 || i2==92)
                        {
                                x2 = 540 ;
                                x3 = 535 ;
                                y3 = 555 ;
                        }
                        if( i==10 || i ==11 || i ==30 || i==31 || i==50 || i==51 || i==70 || i==71 || i==90 || i==91)
                        {
                                x = 600;
                                x1 = 595;
                                y1 = 615 ;
                        }
                        if(i2==10 || i2==11 || i2 ==30 || i2==31 || i2==50 || i2==51 || i2==70 || i2==71 || i2==90 || i2==91)
                        {
                                x2 = 600;
                                x3 = 595;
                                y3 = 615 ;
                        }
                                
                          
                        
                        
                }


                        // g2.setStroke(new BasicStroke(6)); //token 1
                        // g.setColor(c[10]);
                        // g.drawOval(720,300,10,10);
                        // g.fillOval(720,300,10,10);

                        // g.drawLine(725,300+10,715,300+30);
                        // g.drawLine(725,300+10,715+ 20,300+30);
                        // g.drawLine(715,300+30,715+20,300+30);

                        // g.setColor(c[12]);
                        // g.drawOval(760,300,10,10);
                        // g.fillOval(760,300,10,10);

                        // g.drawLine(765,300+10,755,300+30);
                        // g.drawLine(765,300+10,755+ 20,300+30);
                        // g.drawLine(755,300+30,755+20,300+30);

                        if(i>0 || i2>0)
                        {
                                g2.setStroke(new BasicStroke(4)); //token 1
                                g.setColor(c[10]);
                                g.drawOval(x,y,10,10);
                                g.fillOval(x,y,10,10);

                                g.drawLine(x+5,y+10,x1,y+30);
                                g.drawLine(x+5,y+10,x1+ 20,y+30);
                                g.drawLine(x-5,y+30,x1+20,y+30);

                
                                g2.setStroke(new BasicStroke(4)); //token 2
                                g.setColor(c[12]);
                                g.drawOval(x2,y2,10,10);
                                g.fillOval(x2,y2,10,10);

                                g.drawLine(x2+5,y2+10,x3,y2+30);
                                g.drawLine(x2+5,y2+10,x3+ 20,y2+30);
                                g.drawLine(x2-5,y2+30,x3+20,y2+30);
                        }
                        
                                g.setColor(c[10]);//player1 Score
                                g.setFont (o);
                                g.drawString(msg,660,300);
                        
                       
                                g.setColor(c[12]); //player2 Score
                                g.setFont (o);
                                g.drawString(msg1,660,500);
                                g.drawString(msg2,650,650);
                        
                if( i == 51 || i2==51)
                {
                        try{
                                
                                
                                Thread.sleep(1000);
                                if(i==51)
                                {
                                        i = 91;
                                        x = 590;
                                        y = 60;
                                        x1 = 585;
                                        y1 = 605;
                                        msg =""+i;
                                }
                                else if(i2==51)
                                {
                                        i2 = 91;
                                        x2 = 590;
                                        y2 = 60;
                                        x3 = 585;
                                        y3 = 605;
                                        msg1 =""+i2;
                                }
                                repaint();

                        }
                        catch (InterruptedException ie) 
                        {}
                        
                }
                if(i==20 || i2 ==20)
                {
                        try{
                                
                                Thread.sleep(1000);
                                if(i==20)
                                {
                                        i = 81;
                                        x = 60;
                                        y = 120;
                                        x1 = 55;
                                        y1 = 75;
                                        msg =""+i;
                                }
                                else if(i2==20)
                                {
                                        i2 = 81;
                                        x2 = 60;
                                        y2 = 120;
                                        x3 = 55;
                                        y3 = 75;
                                        msg1 =""+i2;
                                }

                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if( i == 7 || i2==7)
                {
                        try{
                                Thread.sleep(1000);
                                if(i==7)
                                {
                                        i = 29;
                                        x = 540;
                                        y = 490;
                                        x1 = 535;
                                        y1 = 555;
                                        msg =""+i;

                                }

                                if(i2==7)
                                {
                                        i2 = 29;
                                        x2 = 540;
                                        y2 = 490;
                                        x3 = 535;
                                        y3 = 555;
                                        msg1 =""+i2;
                                }
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }




                if( i == 17 || i2==17)
                {
                        try{
                                
                                Thread.sleep(1000);
                                if(i==17)
                                {
                                        i = 6;
                                        x = 360;
                                        x1 = 355 ;
                                        y1 = 375 ; 
                                        y = 610;
                                        msg =""+i;
                                }
                                else if(i2==17)
                                {
                                    
                                        i2 = 6;
                                        x2 = 360;
                                        x3 = 355 ;
                                        y3 = 375 ; 
                                        y2 = 610;
                                        msg1 =""+i2;
                                }
                                
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if(i ==38 || i2==38)
                { 
                        try{
                               
                                Thread.sleep(1000);
                                if(i==38)
                                {
                                        i = 10;
                                        x = 600;
                                        y = 610;
                                        x1 = 595;
                                        y1 = 615;
                                        msg =""+i;
                                }
                                else if(i2==38)
                                {
                                        i2 = 10;
                                        x2 = 600;
                                        y2 = 610;
                                        x3 = 595;
                                        y3 = 615;
                                        msg1 =""+i2;
                                }
                               
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if(i == 62 || i2 ==62)
                {
                        try{
                                if(i==62)
                                {
                                        i = 19;
                                        x = 120;
                                        y = 550;
                                        x1 = 115;
                                        y1 = 135;
                                        msg =""+i;
                                }
                                else if(i2==62)
                                {
                                        i2 = 19;
                                        x2 = 120;
                                        y2 = 550;
                                        x3 = 115;
                                        y3 = 135;
                                        msg1 =""+i2;
                                }
                                Thread.sleep(1000);
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if(i==85  || i2 ==85)
                {
                        try{
                                Thread.sleep(1000);
                               if(i==85)
                                {
                                        i = 47;   
                                        x = 420;
                                        y = 360;
                                        x1 = 415;
                                        y1 = 435;
                                        msg =""+i;
                                }
                                else if(i2==85)
                                {
                                        i2 = 47;   
                                        x2 = 420;
                                        y2 = 360;
                                        x3 = 415;
                                        y3 = 435;
                                        msg1 =""+i2;
                                }
                                   
                               
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if(i ==94 || i2==94)
                {
                        try{
                                Thread.sleep(1000); 
                                if(i==94)
                                {
                                       i = 75;
                                        x = 360;
                                        y = 180;
                                        x1 = 355;
                                        y1 = 375;
                                        msg =""+i;
                                }
                                else if(i2==94)
                                {
                                        i2 = 75;
                                        x2 = 360;
                                        y2 = 180;
                                        x3 = 355;
                                        y3 = 375;
                                        msg1 =""+i2;
                                }
                                
                                
                                
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }
                if(i==93 || i2== 93)
                {
                        try{
                                Thread.sleep(100);
                                if(i==93)
                                {
                                        i = 73;
                                        x= 480 ;
                                        y = 190;
                                        x1 = 475 ;
                                        y1 = 495 ;
                                        msg =""+i;
                                }
                                else if(i2==93)
                                {
                                        i2 = 73;
                                        x2= 480 ;
                                        y2 = 190;
                                        x3 = 475 ;
                                        y3 = 495 ;
                                        msg1 =""+i2;
                                }
                                
      
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                } 
                if(i == 99 || i2 ==99)
                {
                        try{
                                if(i==99)
                                {
                                        i = 1;
                                        x = 60;
                                        y = 610;
                                        x1 = 55;
                                        y1 = 75;
                                        msg =""+i;
                                }
                                else if(i2==99)
                                {
                                        i2 = 1;
                                        x2 = 60;
                                        y2 = 610;
                                        x3 = 55;
                                        y3 = 75;
                                        msg1 =""+i2;
                                }
                                Thread.sleep(1000);
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                }    
                if(i == 50 || i2 ==50)
                {
                        try{
                                if(i==50)
                                {
                                        i = 28;
                                        x= 480 ;
                                        y = 490;
                                        x1 = 475 ;
                                        y1 = 495 ;
                                        msg =""+i;
                                }
                                else if(i2==50)
                                {
                                        i2 = 28;
                                        x2= 480 ;
                                        y2 = 490;
                                        x3 = 475 ;
                                        y3 = 495 ;
                                        msg =""+i2;
                                }
                                Thread.sleep(1000);
                                repaint();
                        }
                        catch (InterruptedException ie) 
                        {}
                } 
                if(player1==1 || player2==1)
                {
                        g2.setStroke(new BasicStroke(0));
                                if(dice==0)
                                {
                                        
                                        g.setColor(c[12]);
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);
                                        g.setColor(c[12]);
                                        g.setFont (o);
                                        g.drawString("DICE",727,385);
                                        
                                }
                                if(dice ==1)
                                {
                                        g.setColor(c[12]); //dice = 1
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);
                                        g.setColor(c[12]);
                                        g.drawOval(736,365,30,30);
                                        g.setColor(c[10]);
                                        g.fillOval(737,366,29,29);
                                        
                                }    
                                if(dice==2)
                                {
                                        g.setColor(c[12]); //dice =2
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);

                                        g.setColor(c[12]);
                                        g.drawOval(731,375,15,15);
                                        g.drawOval(755,375,15,15);
                                        g.setColor(c[10]);
                                        g.fillOval(732,376,14,14);
                                        g.fillOval(756,376,14,14);  
                                        
                                }
                                if(dice==3)
                                {
                                        g.setColor(c[12]); //dice =3
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);

                                        g.setColor(c[12]);
                                        g.drawOval(730,365,15,15);
                                        g.drawOval(755,365,15,15);
                                        g.drawOval(743,385,15,15);
                                        g.setColor(c[10]);
                                        g.fillOval(731,366,14,14);
                                        g.fillOval(756,366,14,14);
                                        g.fillOval(744,386,14,14);
                                        
                                }
                                if(dice==4)
                                {
                                        g.setColor(c[12]); //dice =4
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);

                                        g.setColor(c[12]);
                                        g.drawOval(731,360,15,15);
                                        g.drawOval(755,360,15,15);
                                        g.drawOval(731,385,15,15);
                                        g.drawOval(755,385,15,15);
                                        g.setColor(c[10]);
                                        g.fillOval(732,361,14,14);
                                        g.fillOval(756,361,14,14);
                                        g.fillOval(732,386,14,14);
                                        g.fillOval(756,386,14,14);
                                        
                                }
                                if(dice==5)
                                {
                                        g.setColor(c[12]); //dice =5
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);

                                        g.setColor(c[12]);
                                        g.drawOval(725,355,15,15);
                                        g.drawOval(760,355,15,15);
                                        g.drawOval(743,374,15,15);
                                        g.drawOval(725,390,15,15);
                                        g.drawOval(760,390,15,15);
                                        
                                        g.setColor(c[10]);
                                        g.fillOval(726,356,14,14);
                                        g.fillOval(761,356,14,14);
                                        g.fillOval(744,375,14,14);
                                        g.fillOval(726,391,14,14);
                                        g.fillOval(761,391,14,14);
                                        
                                }
                                if(dice==6)
                                {
                                        g.setColor(c[12]); //dice =6
                                        g.drawRect(720,350,61,60);
                                        g.setColor(c[2]);
                                        g.fillRect(721,351,60,59);

                                        g.setColor(c[12]);
                                        g.drawOval(731,352,15,15);
                                        g.drawOval(755,352,15,15);

                                        
                                        g.drawOval(731,373,15,15);
                                        g.drawOval(755,373,15,15);

                                        g.drawOval(731,393,15,15);
                                        g.drawOval(755,393,15,15);
                                        g.setColor(c[10]);
                                        g.fillOval(732,353,14,14);
                                        g.fillOval(756,353,14,14);
                                        g.fillOval(732,374,14,14);
                                        g.fillOval(756,374,14,14);
                                        g.fillOval(732,394,14,14);
                                        g.fillOval(756,394,14,14);
                                        
                                }
                                
                                g2.setStroke(new BasicStroke(6)); //token 1
                                g.setColor(c[10]);
                                g.drawOval(820,220,10,10);
                                g.fillOval(820,220,10,10);

                                g.drawLine(820+5,220+10,815,220+30);
                                g.drawLine(820+5,220+10,815+ 20,220+30);
                                g.drawLine(820-5,220+30,815+20,220+30);
                                


                                g2.setStroke(new BasicStroke(6)); //token 1
                                g.setColor(c[12]);
                                g.drawOval(820,520,10,10);
                                g.fillOval(820,520,10,10);

                                g.drawLine(820+5,520+10,815,520+30);
                                g.drawLine(820+5,520+10,815+ 20,520+30);
                                g.drawLine(820-5,520+30,815+20,520+30);
                                
                        
                }   
        }
        public void actionPerformed(ActionEvent ae) 
        { 
                str = ae.getActionCommand(); 
                if(str.equals("Start")) 
                { 
                        msg2="";
                        dice = 0;
                        if(player1==0 && player2==0)
                        {
                                Button p1 = new Button("Player 1");
                                p1.setFont(o);
                                p1.setForeground(c[3]);
                                p1.setBackground(c[10]);
                                p1.setBounds(700,200,100,60);
                                add(p1);
                                p1.addActionListener(this);

                                Button p2 = new Button("Player 2");
                                p2.setFont(o);
                                p2.setForeground(c[3]);
                                p2.setBackground(c[12]);
                                p2.setBounds(700,500,100,60);
                                add(p2);
                                p2.addActionListener(this);
                        }
                        start = 1;
                        player1 = 1;
                        player2 = 0;
                        i = 0;
                        i2 = 0;
                        msg="0";
                        msg1="0";
                        repaint();
                }
                else if(str.equals("Player 1"))
                {
                        if(msg1=="It's Not Your Turn")
                        {
                                msg1=""+i2;
                        }

                        if(player1 == 1)
                        {
                                dice = (int)(Math.random()*(6-1 + 1)+1); 
                                if(dice==6 || i>5) 
                                {
                                        if((i+dice)<=100) 
                                        {
                                                i = i + dice; 
                                        }
                                        msg =""+i;
                                        player2 = 1;
                                        player1 = 0;
                                        
                                }
                                if(i==100)
                                {
                                        msg ="Player 1 Win"   ;
                                        player2 = 0;
                                        player1 = 0;
                                        str="";
                                        msg1="";
                                        
                                }   
                                else
                                {
                                        player2 = 1;
                                        player1 = 0; 
                                }  
                                repaint();               
                        }
                        else
                        {
                                if(i==100 || i2==100)
                                {
                                       msg2 ="Game Over click on Start"   ;
                                
                                }
                                else
                                {
                                        msg ="It's Not Your Turn"   ;
                                }
                                repaint();
                        }        
                }
                else if(str.equals("Player 2"))
                { 
                        if(msg=="It's Not Your Turn")
                        {
                                msg=""+i;
                        }
                        if(player2 == 1)
                        {
                        
                                dice = (int)(Math.random()*(6-1 + 1)+1); 
                                if(dice==6 || i2>5) 
                                {
                                        if((i2+dice)<=100) 
                                        {
                                                i2 = i2 + dice;
                                                msg1 =""+i2; 
                                                
                                        }
                                }
                                if(i2==100)
                                {
                                        msg1 ="Player 2 Win"   ;
                                        player2 = 0;
                                        player1 = 0;
                                        str="";
                                        msg="";
                                }
                                else
                                {
                                        player2 = 0;
                                        player1 = 1;
                                }       
                                repaint();                               
                        }
                        else
                        {
                                if(i==100 || i2==100)
                                {
                                       msg2 ="Game Over click on Start" ;
                                
                                }
                                else
                                {
                                        msg1 ="It's Not Your Turn"   ;
                                }
                                
                                repaint();
                        }  
                        
                }     
        }
        /*
        <applet code=project.class width=880 height=1000>
        </applet>
        
        */
                 
}