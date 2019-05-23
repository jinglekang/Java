package base.swing.kit;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    Image image;

    public ImagePanel(Image image) {
        this.image = image;
        int w = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(w, h);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
