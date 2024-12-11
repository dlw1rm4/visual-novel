import java.awt.*;
import javax.swing.*;

public class MainScreen extends JFrame{
    public MainScreen() {
        this.setTitle("Visual Novel Game");
		this.setSize(1000, 500);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("ur mom", SwingConstants.CENTER);
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(204, 213, 174));
        panel.add(label, BorderLayout.CENTER);

        this.add(panel);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainScreen();
    }
}