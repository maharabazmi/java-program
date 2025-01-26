import java.awt.*;
import java.awt.event.*;

public class MouseExample implements WindowListener, MouseMotionListener, MouseListener {
    private Frame f;
    private TextField t;

    public MouseExample(){
        f=new Frame("Mouse Example ");
        t=new TextField(30);
    }
    public void launchFrame(){
        Label l = new Label("Click and drag the mouse");
        f.add(l,BorderLayout.NORTH);
        f.add(t,BorderLayout.SOUTH);
        f.setLayout(new FlowLayout());
        f.addMouseMotionListener(this);
        f.addMouseListener( this);
        f.addWindowListener(this);
        f.setSize(300,200);
        f.setVisible(true);
        //f.addWindowListener(this);
        f.setBackground(Color.CYAN);
    }

    public void mouseDragged(MouseEvent e){
        String s = "Mouse dragged: X="+e.getX()+" Y="+e.getY();
        t.setText(s);
    }
    public void mouseEntered(MouseEvent e){
        String s ="This mouse entered";
        t.setText(s);
    }
    public void mouseExited(MouseEvent e){
        String s = " The mouse has left the building ";
        t.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String s = "Mouse moved : x"+e.getX()+"Y: "+e.getY();
        t.setText(s);
    }
    public void mouseClicked(MouseEvent e){
        String s = "mouse clicked: "+e.getClickCount();
        t.setText(s);
    }
    public void mouseRelesed(MouseEvent e){}
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void windowClosing(WindowEvent e){
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

    public static void main(String[] args) {
        MouseExample m =new MouseExample();
        m.launchFrame();
    }
}
