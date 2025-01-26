import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swap {
    public static void main(String[] args) {
        Frame f = new Frame("swaping");
        MenuBar m = new MenuBar();
        m.setHelpMenu(m.getHelpMenu());

        Label l1 = new Label("First Name");
        Label l2 = new Label("last Name");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        Button b =new Button("Click it");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        f.setLayout(new FlowLayout());
        f.setBackground(Color.CYAN);
        f.setSize(500,500);
        f.setVisible(true);

    }
}
