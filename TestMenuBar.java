import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestMenuBar implements WindowListener, ActionListener {
    private Frame f;
    private MenuBar mb;
    private Menu m1,m2,m3;
    private MenuItem mi1,mi2,mi3,mi4;

    public TestMenuBar(){
        f= new Frame("MenuBar Example");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3=new Menu("Help");
        mi1 = new MenuItem("New ");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("load");
        mi4 = new MenuItem("Quit");
    }

    public  void launchFrame(){
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.addSeparator();
        m1.add(mi4);

        mb.add(m1);
        mb.add(m2);
        mb.setHelpMenu(m3);
        f.setMenuBar(mb);

        f.addWindowListener(this);
        f.setSize(400,400);
        f.setBackground(Color.blue);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    public void WindowClosing(){
        System.exit(0);
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
        TestMenuBar tmb = new TestMenuBar();
        tmb.launchFrame();
    }
}
