import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo extends Frame implements ActionListener
{
    TextField name,password;
    public TextFieldDemo()
    {
        setLayout(new FlowLayout());
        Label namep=new Label("Name: ", Label.RIGHT);
        Label passwordp=new Label("Password: ", Label.RIGHT);
        name=new TextField(12);
        password=new TextField(9);
        password.setEchoChar('$');
        add(namep);
        add(name);
        add(passwordp);
        add(password);
        name.addActionListener(this);
        password.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    public void paint(java.awt.Graphics g)
    {
        g.drawString("Name:"+name.getText(),20,100);
        g.drawString("Selected text in the name:"+name.getSelectedText(),20,120);
        g.drawString("Password:"+password.getText(),20,140);
    }
    public static void main(String[] args)
    {
        TextFieldDemo appwin=new TextFieldDemo();
        appwin.setSize(new Dimension(380,180));
        appwin.setTitle("TextFieldDemo");
        appwin.setVisible(true);
    }
}
