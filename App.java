import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("SNAKE");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // opens the window in the centre of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // THE PROGRAM WLL TERMINATE WHEN THE USER CLICK ON THE X
                                                              // BUTTON THE WINDOW
        // now we nee dthe jpanel window insted of creating that jpanel here create a
        // new class that will inherit the jpanel

        // going to create an instance of the snake game
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }
}