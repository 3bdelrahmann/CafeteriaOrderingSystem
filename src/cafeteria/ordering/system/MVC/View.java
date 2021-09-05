package cafeteria.ordering.system.MVC;

import java.awt.event.WindowEvent;	//for CloseListener()
import java.awt.event.WindowAdapter;	//for CloseListener()
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View implements java.util.Observer {

    //attributes as must be visible within class
    private final JTextArea myTextArea;
    private final JButton button;


    public View() {

        //frame in constructor and not an attribute as doesn't need to be visible to whole class
        JFrame jframe = new JFrame("Generate reports");

        myTextArea = new JTextArea();
        jframe.add("Center", myTextArea);

        //panel in constructor and not an attribute as doesn't need to be visible to whole class
        JPanel jpanel = new JPanel();
        button = new JButton();
        button.setBackground(new java.awt.Color(76, 175, 80));
        button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Generate");
        jpanel.add(button);
        jframe.add("South", jpanel);
        jframe.addWindowListener(new CloseListener());
        jframe.setSize(200, 100);
        jframe.setVisible(true);
        jframe.setBounds(0, 0, 500, 500);
        jframe.setLocationRelativeTo(null);

    }

    @Override
    public void update(Observable obs, Object obj) {
        myTextArea.append("\t\nReceipt:\n\n"
                + "Reference:\t\t" +((Integer)obj).intValue()
                + "\n================================================================\t"
                + "\njCheckBox5:\t\t\tdrink"
                + "\njCheckBox5:\t\t\tdrink"
                + "\n================================================================\t\t"
                + "\njCheckBox6:\t\t\t cake"
                + "\njCheckBox7:\t\t\t cake"
                + "\njCheckBox8:\t\t\t cake");

    }

    //To initialise TextField
    public void setValue(int v) {
        myTextArea.setText("" + v);
    }

    public void addController(ActionListener controller) {
        button.addActionListener(controller);
    }

    public static class CloseListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0);
        }
    }

}
