package application;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        super("Game of Life");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
