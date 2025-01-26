import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWithPanel implements WindowListener {
    private Frame f;
    private Panel p;

    public FrameWithPanel(){
        f=new Frame("Frame title: Random");
        p = new Panel();
    }
    public void LaunchFrame(){
        f.addWindowListener(this);
        f.setSize(1600,800);
        f.setBackground(Color.blue);
        f.setLayout(null);

        p.setSize(150,150);
        p.setBackground(Color.red);
        f.add(p);
        f.setVisible(true);
    }
    public void windowClosing(){
        System.exit(1);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

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
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        FrameWithPanel fp = new FrameWithPanel();
        fp.LaunchFrame();
    }
}
