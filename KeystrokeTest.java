package Engine1;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeystrokeTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // keeping unused for later implementation.
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '5') {
                    System.out.println("The key 5 has been pressed");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used
            }
        });

        frame.add(textField);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}