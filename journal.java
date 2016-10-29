import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class mainfrm extends JFrame implements ActionListener,Runnable
{
	Thread t;
	Font f1,f2;
	Color c1,c2;
	JLabel l1,l2,l3;
	JTextField tf1,tf2;
	JButton b1,b2,b3,b4,b5,b6,b7,bc,about;
	mainfrm()
	{
		f1=new Font("Copperplate Gothic Bold",Font.BOLD,50);
		f2=new Font("Monotype Corsiva",Font.BOLD,30);
		l3=new JLabel(new ImageIcon("YingYang.jpg"));
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		l1=new JLabel("JDiary");
		l2=new JLabel("Digital Diary Software");
		l1.setFont(f1);
		l2.setFont(f2);
		c1=new Color(255,0,0);
		c2=new Color(0,0,255);
		l1.setForeground(c1);
		l2.setForeground(c2);
		b1=new JButton("Address Book");
		b2=new JButton("Gallery");
		b3=new JButton("Converter");
		b4=new JButton("Timer");
		b5=new JButton("StopWatch");
		b6=new JButton("Calculator");
		b7=new JButton("Task Input");
		bc=new JButton("Exit");
		about=new JButton("About Us");
		setLayout(null);
		l1.setBounds(390,15,425,80);
		l2.setBounds(340,85,380,80);
		l3.setBounds(40,20,170,170);
		tf1.setBounds(40,370,140,25);
		tf2.setBounds(40,400,140,25);
		b1.setBounds(300,190,140,30);
		b2.setBounds(500,235,140,30);
		b3.setBounds(300,280,140,30);
		b4.setBounds(500,325,140,30);
		b5.setBounds(300,370,140,30);
		b6.setBounds(500,415,140,30);
		b7.setBounds(300,460,140,30);
		bc.setBounds(40,505,140,30);
		about.setBounds(40,450,140,30);
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(bc);
		add(about);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		bc.addActionListener(this);
		tf1.setEditable(false);
		tf2.setEditable(false);
		about.addActionListener(this);
		tf1.setFont(new Font("Arial Black",Font.BOLD,19));
		tf2.setFont(new Font("Arial Black",Font.BOLD,19));
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf2.setHorizontalAlignment(JTextField.RIGHT);
		t=new Thread(this);
		t.start();
		always obj = new always();	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			this.setVisible(false);
			contact obj=new contact();
			obj.setVisible(true);
			obj.setSize(800,600);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setLocation(200,100);
			obj.setResizable(false);
		}
		if(e.getSource()==b2)
		{
			this.setVisible(false);
			gallery obj=new gallery();
			obj.setTitle("Gallery");
			obj.setSize(1000,750);
			obj.setVisible(true);
			obj.setLocation(100,10);
			obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
			obj.setResizable(false);
		}
		if(e.getSource()==b3)
		{
			this.setVisible(false);
			conversion obj=new conversion();
			obj.setSize(500,600);
			obj.setTitle("CONVERTOR");
			obj.setVisible(true);
			obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
			obj.setResizable(false);
			obj.setLocation(200,100);
		}
		if(e.getSource()==b4)
		{
			this.setVisible(false);
			timfrm obj=new timfrm();
			obj.setSize(350,280);
			obj.setVisible(true);
			obj.setTitle("Timer");
			obj.setLocation(200,100);
			obj.setResizable(false);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(e.getSource()==b5)
		{
			this.setVisible(false);
			stwfrm obj=new stwfrm();
			obj.setSize(440,280);
			obj.setVisible(true);
			obj.setTitle("Stop Watch");
			obj.setResizable(false);
			obj.setLocation(200,100);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(e.getSource()==b6)
		{
			this.setVisible(false);
			calculator obj=new calculator();
			obj.setSize(320,380);
			obj.setVisible(true);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(e.getSource()==b7)
		{
			this.setVisible(false);
			mtifrm obj=new mtifrm();
			obj.setSize(900,650);
			obj.setVisible(true);
			obj.setTitle("Master Task Input");
			obj.setResizable(false);
			obj.setLocation(200,100);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(e.getSource()==bc)
		{
			t.stop();
			System.exit(0);
		}
		if(e.getSource()==about)
		{
			System.out.println("Project by Amanjot Singh & Ranjit Singh");
		}
	}
	public void run()
	{
		String dat,tim;
		String m[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		dat="";
		tim="";
		while(true)
		{
			int date= new GregorianCalendar().get(GregorianCalendar.DATE);
			int month= new GregorianCalendar().get(GregorianCalendar.MONTH);
			int year= new GregorianCalendar().get(GregorianCalendar.YEAR);
			int hr = new GregorianCalendar().get(GregorianCalendar.HOUR);
			int min = new GregorianCalendar().get(GregorianCalendar.MINUTE);
			int sec=new GregorianCalendar().get(GregorianCalendar.SECOND);
			int ampm = new GregorianCalendar().get(GregorianCalendar.AM_PM);
			String mon=m[month];
			dat=date+" "+mon+","+year;
			if(ampm==0)
				tim=hr+":"+min+":"+sec+" "+"AM";
			else if(ampm==1)
				tim=hr+":"+min+":"+sec+" "+"PM";
			tf1.setText(dat);
			tf2.setText(tim);
		}
	}
	public static void main(String arg[])
	{
		mainfrm obj=new mainfrm();
		obj.setSize(730,590);
		obj.setVisible(true);
		obj.setTitle("JDiary 1.0");
		obj.setLocation(200,100);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


