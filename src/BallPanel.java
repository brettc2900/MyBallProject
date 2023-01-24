import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

public class BallPanel extends JPanel{
    private BallClass ball;
    private int x, y, xSpeed, ySpeed, size;
    public BallPanel(){
        setBackground(Color.RED);
        ball = new BallClass();
        this.setFocusable(true);
this.addKeyListener(new KeyListener()
{
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        int blah = e.getKeyCode();
        if(blah==37){
            ball.moveLeft();
        }
        if(blah==38){
            ball.moveUp();
        }

        if(blah==39){
            ball.moveRight();
        }

        if(blah==40){
            ball.moveDown();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
});
    }


    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        g.fillOval(ball.getX(),ball.getY(),ball.getSize(),ball.getSize());

        x = ball.getX();
        y = ball.getY();
        xSpeed = ball.getXSpeed();
        ySpeed = ball.getYSpeed();

        x+=xSpeed;
        y+=ySpeed;

        if(x>=getWidth()-ball.getSize()||x<=0){
            ball.bounceBack();
        }

        if(y>=getHeight()-ball.getSize()||y<=0){
            ball.bounceUp();
        }



        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);

        }

        repaint();

    }
}