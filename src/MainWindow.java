import javax.swing.*;

/**
 * class create the window
 */
public class MainWindow extends JFrame {

    /**
     * window and the filds
     */

    public MainWindow(){

        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340,360);
        setLocation(500,500);
        setVisible(true);
        add(new GameField());
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}