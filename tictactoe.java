import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tictactoe implements ActionListener
{
	JButton s1,s2,s3,s4,s5,s6,s7,s8,s9;
	JFrame frmobj;
	GridLayout gr,gr2;
	BorderLayout bl;
	int i=1,p1=0,p2=0;
	JLabel lbl1,sco1,lbl2,sco2;
	JPanel pnl1,pnl2;
	public void createComp()
	{
		frmobj=new JFrame("TicTacToe");
		gr=new GridLayout(3,3,2,2);
		gr2=new GridLayout(1,4,2,2);
		bl=new BorderLayout();
		pnl1=new JPanel();
		pnl2=new JPanel();
		lbl1=new JLabel("P1->");
		lbl1.setFont(new Font("Algerian",Font.PLAIN,35));
		lbl2=new JLabel("P2->");
		lbl2.setFont(new Font("Algerian",Font.PLAIN,35));
		sco1=new JLabel("0");
		sco1.setFont(new Font("Algerian",Font.PLAIN,35));
		sco2=new JLabel("0");
		sco2.setFont(new Font("Algerian",Font.PLAIN,35));
		s1=new JButton();
		s1.setFont(new Font("Arial",Font.PLAIN,50));
		s2=new JButton();
		s2.setFont(new Font("Arial",Font.PLAIN,50));
		s3=new JButton();
		s3.setFont(new Font("Arial",Font.PLAIN,50));
		s4=new JButton();
		s4.setFont(new Font("Arial",Font.PLAIN,50));
		s5=new JButton();
		s5.setFont(new Font("Arial",Font.PLAIN,50));
		s6=new JButton();
		s6.setFont(new Font("Arial",Font.PLAIN,50));
		s7=new JButton();
		s7.setFont(new Font("Arial",Font.PLAIN,50));
		s8=new JButton();
		s8.setFont(new Font("Arial",Font.PLAIN,50));
		s9=new JButton();
		s9.setFont(new Font("Arial",Font.PLAIN,50));
	}
	public void displayComp()
	{
		frmobj.setLayout(bl);
		frmobj.add(pnl1,BorderLayout.NORTH);
		pnl1.setLayout(gr2);
		pnl1.add(lbl1);
		pnl1.add(sco1);
		pnl1.add(lbl2);
		pnl1.add(sco2);
		frmobj.add(pnl2,BorderLayout.CENTER);
		pnl2.setLayout(gr);
		pnl2.add(s1);
		pnl2.add(s2);
		pnl2.add(s3);
		pnl2.add(s4);
		pnl2.add(s5);
		pnl2.add(s6);
		pnl2.add(s7);
		pnl2.add(s8);
		pnl2.add(s9);

		frmobj.setSize(500,535);
		frmobj.setVisible(true);
		frmobj.setResizable(false);
	}
	public void reset()
	{
		s1.setText("");
		s2.setText("");
		s3.setText("");
		s4.setText("");
		s5.setText("");
		s6.setText("");
		s7.setText("");
		s8.setText("");
		s9.setText("");
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(s1))
		{
			if(s1.getText().equals(""))
			{
			if(i%2==0)
			s1.setText("O");
			else
			s1.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s1.getText().equals("X")&&s2.getText().equals("X")&&s3.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					i=1;
					p1++;
					sco1.setText(""+p1);
				}
				else if(s1.getText().equals("O")&&s2.getText().equals("O")&&s3.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset(); 
					i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s1.getText().equals("X")&&s4.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s4.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s1.getText().equals("X")&&s5.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s5.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}	
		}
		else if(ae.getSource().equals(s2))
		{
			if(s2.getText().equals(""))
			{
			if(i%2==0)
			s2.setText("O");
			else
			s2.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s1.getText().equals("X")&&s2.getText().equals("X")&&s3.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s2.getText().equals("O")&&s3.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s2.getText().equals("X")&&s5.getText().equals("X")&&s8.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s2.getText().equals("O")&&s5.getText().equals("O")&&s8.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}	
		}
		else if(ae.getSource().equals(s3))
		{
			if(s3.getText().equals(""))
			{
			if(i%2==0)
			s3.setText("O");
			else
			s3.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s1.getText().equals("X")&&s2.getText().equals("X")&&s3.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset(); 
					i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s2.getText().equals("O")&&s3.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s3.getText().equals("X")&&s6.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s3.getText().equals("O")&&s6.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s3.getText().equals("X")&&s5.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s3.getText().equals("O")&&s5.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else if(ae.getSource().equals(s4))
		{
			if(s4.getText().equals(""))
			{
			if(i%2==0)
			s4.setText("O");
			else
			s4.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s1.getText().equals("X")&&s4.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s4.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s4.getText().equals("X")&&s5.getText().equals("X")&&s6.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s4.getText().equals("O")&&s5.getText().equals("O")&&s6.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else if(ae.getSource().equals(s5))
		{
			if(s5.getText().equals(""))
			{
			if(i%2==0)
			s5.setText("O");
			else
			s5.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s2.getText().equals("X")&&s5.getText().equals("X")&&s8.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s2.getText().equals("O")&&s5.getText().equals("O")&&s8.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s4.getText().equals("X")&&s5.getText().equals("X")&&s6.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s4.getText().equals("O")&&s5.getText().equals("O")&&s6.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s1.getText().equals("X")&&s5.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s5.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s3.getText().equals("X")&&s5.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s3.getText().equals("O")&&s5.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else if(ae.getSource().equals(s6))
		{
			if(s6.getText().equals(""))
			{
			if(i%2==0)
			s6.setText("O");
			else
			s6.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s3.getText().equals("X")&&s6.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s3.getText().equals("O")&&s6.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s4.getText().equals("X")&&s5.getText().equals("X")&&s6.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s4.getText().equals("O")&&s5.getText().equals("O")&&s6.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);


				}
			}
		
		}
		else if(ae.getSource().equals(s7))
		{
			if(s7.getText().equals(""))
			{
			if(i%2==0)
			s7.setText("O");
			else
			s7.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s1.getText().equals("X")&&s4.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s4.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s7.getText().equals("X")&&s8.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s7.getText().equals("O")&&s8.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s3.getText().equals("X")&&s5.getText().equals("X")&&s7.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s3.getText().equals("O")&&s5.getText().equals("O")&&s7.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else if(ae.getSource().equals(s8))
		{
			if(s8.getText().equals(""))
			{
			if(i%2==0)
			s8.setText("O");
			else
			s8.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s7.getText().equals("X")&&s8.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s7.getText().equals("O")&&s8.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s2.getText().equals("X")&&s5.getText().equals("X")&&s8.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s2.getText().equals("O")&&s5.getText().equals("O")&&s8.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else if(ae.getSource().equals(s9))
		{
			if(s9.getText().equals(""))
			{
			if(i%2==0)
			s9.setText("O");
			else
			s9.setText("X");
			i++;
			}
			else
			{
				JOptionPane.showMessageDialog(frmobj,"Choose another box","Error!",JOptionPane.ERROR_MESSAGE);
			}
			if(i>4)
			{
				if(s3.getText().equals("X")&&s6.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s3.getText().equals("O")&&s6.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s7.getText().equals("X")&&s8.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s7.getText().equals("O")&&s8.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
				else if(s1.getText().equals("X")&&s5.getText().equals("X")&&s9.getText().equals("X"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 1 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p1++;
					sco1.setText(""+p1);

				}
				else if(s1.getText().equals("O")&&s5.getText().equals("O")&&s9.getText().equals("O"))
				{
					JOptionPane.showMessageDialog(frmobj,"Player 2 wins","Congrats",JOptionPane.INFORMATION_MESSAGE);
					reset();
					 i=1;
					p2++;
					sco2.setText(""+p2);

				}
			}
		
		}
		else
		{}
		if((s1.getText().equals("X")||s1.getText().equals("O"))&&(s2.getText().equals("X")||s2.getText().equals("O"))&&(s3.getText().equals("X")||s3.getText().equals("O"))&&(s4.getText().equals("X")||s4.getText().equals("O"))&&(s5.getText().equals("X")||s5.getText().equals("O"))&&(s6.getText().equals("X")||s6.getText().equals("O"))&&(s7.getText().equals("X")||s7.getText().equals("O"))&&(s8.getText().equals("X")||s8.getText().equals("O"))&&(s9.getText().equals("X")||s9.getText().equals("O")))
		{
			JOptionPane.showMessageDialog(frmobj,"Oops.. Both of you are good enough","Tie",JOptionPane.WARNING_MESSAGE);
			reset();
			i=1;
		}
		
		
	

	}	
	public void reg()
	{
		s1.addActionListener(this);
		s2.addActionListener(this);
		s3.addActionListener(this);
		s4.addActionListener(this);
		s5.addActionListener(this);
		s6.addActionListener(this);
		s7.addActionListener(this);
		s8.addActionListener(this);
		s9.addActionListener(this);

	}
	
	public static void main(String args[])
	{
		tictactoe obj=new tictactoe();
		obj.createComp();
		obj.displayComp();
		obj.reg();
		//obj.reset();
	}
}