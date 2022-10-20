import java.awt.*;

public class Rect extends Shape {
    private int w;
    private int h;

    public Rect(int w, int h,Point pos, Color col){
        super(pos, col);
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }
}
