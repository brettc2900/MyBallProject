import javax.swing.*;

public class DrawingFrame{
    public static void main(String[] args){
      System.out.println("made a comment in replt");
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();
        BallPanel bPanel = new BallPanel();

        //frame.add(panel);
        frame.add(bPanel);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}