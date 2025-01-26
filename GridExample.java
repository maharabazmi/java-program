import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GridExample implements WindowListener {
    private Frame f;
    private Button b1,b2,b3,b4,b5,b6;
    public GridExample(){
        f= new Frame("Grid");
        b1=new Button("Button 1");
        b2= new Button("button 2");
        b3 = new Button("button 3");
        b4 = new Button("Button 4");
        b5= new Button("Button 5");
        b6 = new Button("Button 6");
    }
    public  void launchFrame(){
        f.setLayout(new GridLayout(2,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.addWindowListener(this);
        f.setSize(250,250);
        f.setBackground(Color.CYAN);
        f.setVisible(true);
    }
    public void WindowClosing(WindowEvent e){
        System.exit(0);
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

    public static void main(String[] args) {
        GridExample gd = new GridExample();
        gd.launchFrame();
    }
}
