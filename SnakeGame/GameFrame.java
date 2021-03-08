package SnakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    /**
     *
     */
    // private static final long serialVersionUID = 1L;

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
}
