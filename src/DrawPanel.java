import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{

    public DrawPanel(){
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillOval(100,200,75,75);
        g.drawString("dog",50,60);
        g.drawLine(10,10,80,80);
        g.drawRect(120,120,120,400);
        g.drawArc(100,100,100,100,180,180);

    }
}