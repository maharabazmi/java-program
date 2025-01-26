import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderEx implements WindowListener {
    private Frame f;
    private Button b1,b2,b3,b4,b5;
    public BorderEx(){
        f= new Frame("Border layout");
        b1= new Button("button 1");
        b2 = new Button(" button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5= new Button("Button 5");
    }
    public void launchFrame(){
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.CENTER);
        f.addWindowListener(this);
        f.setBackground(Color.CYAN);
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void WindowClosing(WindowEvent e){
        System.exit(0);
    }

    public static void main(String[] args) {
        BorderEx bf = new BorderEx();
        bf.launchFrame();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
