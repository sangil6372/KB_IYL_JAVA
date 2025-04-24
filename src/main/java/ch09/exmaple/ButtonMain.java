package ch09.exmaple;

import javax.swing.*;

public class ButtonMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ButtonExample frame = new ButtonExample();
            frame.setVisible(true);
        });
    }
}
