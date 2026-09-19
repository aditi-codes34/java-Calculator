
import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
    JFrame frame;
    JLabel lab1,lab2,lab3;
    JTextArea tx1,tx2,tx3;
    JButton btn1,btn2,btn3,btn4,btn5;
    int num1,num2,res;
    
    public Calculator()
    {
        frame= new JFrame("Toolkit");
        lab1= new JLabel("Enter a number");
        lab2= new JLabel("Enter another number");
        lab3= new JLabel("Sum of two numbers");
        
        tx1= new JTextArea("0");
        tx2= new JTextArea("0");
        tx3= new JTextArea("0");
        
        btn1= new JButton("+");
        btn2= new JButton("-");
        btn3= new JButton("*");
        btn4= new JButton("/");
        btn5= new JButton("Reset");
        
        frame.setSize(500,400);
        
        lab1.setBounds(100,50,150,30);
        lab2.setBounds(100,100,150,30);
        lab3.setBounds(100,150,150,30);
        tx1.setBounds(300,50,100,30);
        tx2.setBounds(300,100,100,30);
        tx3.setBounds(300,150,100,30);
        btn1.setBounds(150,200,90,30);
        btn2.setBounds(300,200,90,30);
        btn3.setBounds(150,250,90,30);
        btn4.setBounds(300,250,90,30);
        btn5.setBounds(150,300,90,30);
        
        frame.add(tx1);
        frame.add(tx2);
        frame.add(tx3);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent Ae)
    {
        if( Ae.getSource()==btn5)
        {
            tx1.setText("0");
            tx2.setText("0");
            tx3.setText("0");
        }
        
        if(Ae.getSource()==btn1)
        {
            num1= Integer.parseInt(tx1.getText());
            num2= Integer.parseInt(tx2.getText());
            
            res = num1+num2;
            
            tx3.setText(String.valueOf(res));
        }
        
        if(Ae.getSource()==btn2)
        {
            
            num1= Integer.parseInt(tx1.getText());
            num2= Integer.parseInt(tx2.getText());
            
            res = num1-num2;
            
            tx3.setText(String.valueOf(res));
        }
        
        if(Ae.getSource()==btn3)
        {
            
            num1= Integer.parseInt(tx1.getText());
            num2= Integer.parseInt(tx2.getText());
            
            res = num1*num2;
            
            tx3.setText(String.valueOf(res));
        }
        
        if(Ae.getSource()==btn4)
        {
            
            num1= Integer.parseInt(tx1.getText());
            num2= Integer.parseInt(tx2.getText());
            
            res = num1/num2;
            
            tx3.setText(String.valueOf(res));
        }
    }
    
    public static void main(String args[])
    {
        new Calculator();
    }
}


/**
//Mouse Motion Listener
//dragged
//moved
import javax.swing.*;
import java.awt.event.*;
public class Calculator implements MouseMotionListener
{
    JFrame frame;
    JLabel lab1,lab2,lab3;
    JTextArea tx1,tx2,tx3;
    JButton btn1,btn2;
    int num1,num2,res;
    
    public Calculator()
    {
        frame= new JFrame("Toolkit");
        lab1= new JLabel("Enter a number");
        lab2= new JLabel("Enter another number");
        lab3= new JLabel("Sum of two numbers");
        
        tx1= new JTextArea("0");
        tx2= new JTextArea("0");
        tx3= new JTextArea("0");
        
        btn1= new JButton("+");
        btn2= new JButton("Reset");
        
        frame.setSize(500,400);
        
        lab1.setBounds(100,50,150,30);
        lab2.setBounds(100,100,150,30);
        lab3.setBounds(100,150,150,30);
        tx1.setBounds(300,50,100,30);
        tx2.setBounds(300,100,100,30);
        tx3.setBounds(300,150,100,30);
        btn1.setBounds(150,200,90,30);
        btn2.setBounds(300,200,90,30);
        
        frame.add(tx1);
        frame.add(tx2);
        frame.add(tx3);
        frame.add(btn1);
        frame.add(btn2);
        
        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
        btn1.addMouseMotionListener(this);
        btn2.addMouseMotionListener(this);
        
    }
    
    public void mouseMoved(MouseEvent Me)
    {
      if(Me.getSource()==btn1)
        {
            num1= Integer.parseInt(tx1.getText());
            num2= Integer.parseInt(tx2.getText());
            
            res = num1+num2;
            
            tx3.setText(String.valueOf(res));
        }  
    }
    public void mouseDragged(MouseEvent Me)
    {
      if( Me.getSource()==btn2)
        {
            tx1.setText("0");
            tx2.setText("0");
            tx3.setText("0");
        }  
    }
    
    public static void main(String args[])
    {
        new Calculator();
    }
}
*/
