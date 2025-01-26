import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowExample implements WindowListener {
    private Frame f;
    private Button b1, b2, b3;

    public FlowExample() {
        f = new Frame("Flow layout");
        b1 = new Button("YES");
        b2 = new Button("NO");
        b3 = new Button("EXIT");
    }

    public void launchFrame() {
        f.setLayout(new FlowLayout());
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.addWindowListener(this);
        f.setSize(250, 250);
        f.setBackground(Color.CYAN);
        f.setVisible(true);
    }
    public void windowclosing(WindowEvent e){
        System.exit(0);
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    public static void main(String[] args) {
        FlowExample f = new FlowExample();
        f.launchFrame();
    }
}

