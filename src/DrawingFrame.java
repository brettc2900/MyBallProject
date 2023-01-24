import javax.swing.*;

public class DrawingFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();
        BallPanel bPanel = new BallPanel();

        //frame.add(panel);
        frame.add(bPanel);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}