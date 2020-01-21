import javax.swing.JPanel;

import java.awt.Color;

import java.awt.Graphics;

public class gui extends JPanel {

    

    private static final String Red = null;
    private static final String Color = null;
    private static final java.awt.Color R = null;

    public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(R);
            g.fillOval(10, 10, 200, 200);
            
        }
}