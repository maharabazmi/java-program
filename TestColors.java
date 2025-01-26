import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestColors implements WindowListener, ActionListener {
    private Frame f;
    private Button b;
    public TestColors(){
        f=new Frame("color chart: ");
        b=new Button("Change color");
        b.setActionCommand("button press");
    }
    public void lounchFrame(){
        b.addActionListener(this);
        b.setForeground(Color.WHITE);
        b.setBackground(Color.black);
        f.addWindowListener(this);
        f.setSize(300,300);
        f.setBackground(Color.BLUE);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e){
        int x,y,z;
        if(e.getActionCommand().equals("button press")){
            x=(int)(Math.random()*100);
            y=(int)(Math.random()*100);
            z=(int)(Math.random()*100);
            Color c = new Color(x,y,z);
            f.setBackground(c);
        }
    }
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
        TestColors ct = new TestColors();
        ct.lounchFrame();
    }
}
