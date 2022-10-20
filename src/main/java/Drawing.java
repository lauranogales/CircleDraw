import shapes.Circle;
import shapes.Rect;

import java.awt.*;
import java.awt.event.WindowAdapter; //changes of development branch
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    Point p = new Point(200,200);
    Color c = new Color(0x82266);
    private Circle circ ;
    private Rect rect;
    private Frame f;
    public Drawing(){
        setupFrame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        setupCanvas();
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    public void paint(Graphics g){
        circ = new Circle(p,c,100);
        rect = new Rect(50, 40, p,c);
        circ.draw(g);
        rect.draw(g);
    }

}
