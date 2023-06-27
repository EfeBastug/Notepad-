package NotepadPlus;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import javax.swing.*;
public class NotepadPlus implements ActionListener, MouseListener, KeyListener, EventListener {

    private final JButton[] buttons = new JButton[3];
    JFrame frame1 = new JFrame();
    JPanel panel1 = new JPanel();
    JButton button1 = new JButton("A");
    JButton button2 = new JButton("B");

    JButton button3 = new JButton("C");

    NotepadPlus() {
        frame1.setSize(900, 600);
        frame1.setVisible(true);
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;

        JTextField textField = new JTextField();
        textField.setSize(300, 300);

        for (JButton button : buttons) {
            button.addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
