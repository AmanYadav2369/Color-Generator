import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class colors extends JFrame
{
Container c;
JButton btnRed, btnBlue, btnGreen, btnYellow;

colors(){
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.CYAN);

btnRed=new JButton("RED");
btnRed.setBounds(112,70,150,35);
btnRed.setFont(new Font("Arial", Font.BOLD, 25));
btnRed.setBackground(Color.RED);
btnRed.setForeground(Color.WHITE);
c.add(btnRed);

btnBlue=new JButton("BLUE");
btnBlue.setBounds(112,140,150,35);
btnBlue.setFont(new Font("Arial", Font.BOLD, 25));
btnBlue.setBackground(Color.BLUE);
btnBlue.setForeground(Color.WHITE);
c.add(btnBlue);

btnGreen=new JButton("GREEN");
btnGreen.setBounds(112,210,150,35);
btnGreen.setFont(new Font("Arial", Font.BOLD, 25));
btnGreen.setBackground(Color.GREEN);
btnGreen.setForeground(Color.WHITE);
c.add(btnGreen);

btnYellow=new JButton("YELLOW");
btnYellow.setBounds(112,280,150,35);
btnYellow.setFont(new Font("Arial", Font.BOLD, 25));
btnYellow.setBackground(Color.YELLOW);
btnYellow.setForeground(Color.WHITE);
c.add(btnYellow);

ActionListener a1= (ae) -> { c.setBackground(Color.RED);
};
btnRed.addActionListener(a1);

ActionListener a2= (ae) -> { c.setBackground(Color.BLUE);
};
btnBlue.addActionListener(a2);

ActionListener a3= (ae) -> { c.setBackground(Color.GREEN);
};
btnGreen.addActionListener(a3);

ActionListener a4= (ae) -> { c.setBackground(Color.YELLOW);
};
btnYellow.addActionListener(a4);

setSize(400,550);
setLocationRelativeTo(null);
setTitle("colors generator app by Aman Yadav...");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
colors c=new colors();
}
}