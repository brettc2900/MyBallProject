import java.awt.*;
public class BallClass{
    private int x,y,xSpeed,ySpeed,size;
    private Color color;

    public BallClass(int x, int y, int xSpeed, int ySpeed, int size, Color color){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.size = size;
        this.color = color;
    }

    public BallClass(){
        x=(int)(Math.random()*400)+1;
        y=(int)(Math.random()*400)+1;
        size=(int)(Math.random()*100)+1;
        xSpeed = 1;
        ySpeed = 1;
        color = color.orange;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }

    public int getXSpeed(){
        return xSpeed;
    }

    public int getYSpeed(){
        return ySpeed;
    }

    public void drawBall(Graphics g){
        g.fillOval(x,y,x,y);
    }

    public void moveBall(BallClass ball){
        x+= xSpeed;
        y+= ySpeed;
    }

    public void moveRight(){
        x+=25;
    }

    public void moveLeft(){
        x-=25;
    }

    public void moveUp(){
        y-=25;
    }

    public void moveDown(){
        y+=25;
    }

    public void bounceBack(){
        xSpeed*=-1;
    }

    public void bounceUp(){
        ySpeed*=-1;
    }
}