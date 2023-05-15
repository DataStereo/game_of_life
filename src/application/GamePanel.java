package application;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private  final static int CELLSIZE = 50;
    private final static Color backgroundColor = Color.black;
    private final static Color foregroundColor = Color.green;
    private final static Color gridColor = Color.gray;

    private int topBottomMargin;
    private int leftRightMargin;

    public GamePanel(){
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELLSIZE)+CELLSIZE)/2;
        topBottomMargin = ((height % CELLSIZE)+CELLSIZE)/2;

        g2.setColor(backgroundColor);
        g2.fillRect(0, 0, width, height);

        g2.setColor(foregroundColor);
        drawGrid(g2, width, height);
    }

    private void drawGrid(Graphics2D g2, int width, int height){
        g2.setColor(gridColor);
        for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE){
            g2.drawLine(x,topBottomMargin, x, height - topBottomMargin);
        }
        for(int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE){
            g2.drawLine(leftRightMargin,y, width - leftRightMargin, y);
        }
    }
}
