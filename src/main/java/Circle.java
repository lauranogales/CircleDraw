import java.awt.*; //change made

public class Circle extends Shape{
    private  int rad;
    public Circle(Point pos, Color col, int radius){
        super(pos, col);
        rad=radius;

    }
    public void draw(Graphics g){
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad,rad);
    }
}


