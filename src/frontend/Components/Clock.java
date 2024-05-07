
package frontend.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class Clock {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Real-Time Clock");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ClockPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

class ClockPanel extends JPanel {
    private JLabel clockLabel;

    public ClockPanel() {
        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 24));
        updateClock();

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        add(clockLabel);
    }

    private void updateClock() {
        clockLabel.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
}