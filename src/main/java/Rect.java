import java.awt.*;

public class Rect {
    private int w;
    private int h;
    private Point pos;
    private Color col;

    public Rect(int w, int h,Point pos, Color col){
        this.w = w;
        this.h = h;
        this.col = col;
        this.pos = pos;
    }
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }
}
