import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandle implements WindowListener, ActionListener {
    private Frame f;
    private Button b1,b2,b3;
    private TextField t1;

    public EventHandle(){
        f = new Frame("Button hendelling");
        b1 = new Button("YES");
        b1.setActionCommand("Yes button");//action command ta set kore dite hobe
        b2=new Button("NO");
        b2.setActionCommand("No button");
        b3 = new Button("Clear");
        b3.setActionCommand("Clear button");
        t1=new TextField(50);
    }

    public void LaunchFrame(){
        b1.addActionListener(this);// button ta kaz korbe tai action listener dia newa hoice
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.blue);

        b2.addActionListener(this);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.green);

        b3.addActionListener(this);
        b3.setForeground(Color.blue);
        b3.setBackground(Color.yellow);

        t1.setForeground(Color.blue);
        t1.setForeground(Color.BLACK);

        f.setLayout(new FlowLayout());// last e amadr shob kicu frame er maje diye dite hobe
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(t1);
        f.addWindowListener(this);
        f.setSize(350,250);
        f.setBackground(Color.CYAN);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String str;
        if (e.getActionCommand().equals("Yes button")) {
            str = "You press YES button";
            t1.setText(str);
        } else if (e.getActionCommand().equals("No button")) {
            str = "You press NO button";
            t1.setText(str);
        } else if (e.getActionCommand().equals("Clear button")) {
            t1.setText("");  // Clear the text field
        }
    }
    public void actionperformed(ActionEvent e){
        System.exit(0);
}// CLOSING E TAP korle chole jabe eta use korle
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        EventHandle er = new EventHandle();
        er.LaunchFrame();
    }
}
