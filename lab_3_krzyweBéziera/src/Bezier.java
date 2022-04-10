
import javax.swing.*;
import java.awt.*;
import static java.lang.StrictMath.pow;

public class Bezier extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.BLUE);
        double Px, Py;
        double[] x = {67, 26, 26, 73, 73, 64, 64, 55, 55, 189, 189, 132, 132, 82, 82, 191, 191, 196, 196, 199, 199, 231, 231, 191};
        double[] y = {45, 3, 3, 303, 303, 315, 315, 327, 327, 149, 149, 149, 149, 149, 149, 303, 303, 317, 317, 325, 325, -1, -1, 40};
        double[] gx = {467, 467,467 ,469,469, 469};
        double[] gy = {106, 91,91,419,419,404};
        double[] bx = {315, 300,300, 608,608, 593};
        double[] by = {107, 107,107, 109,109, 109};
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(20f,
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER,
                10));
        for(int i = 0; i <= 0; i++) {
            for(double t = 0; t <=1; t=t+0.001) {
                Px = pow(1-t,3) * gx[4*i] + 3 * pow(1-t,2) * t * gx[4*i+1] + 3 * (1-t) * pow(t,2) * gx[4*i+2] + pow(t,3) * gx[4*i+3];
                Py = pow(1-t,3) * gy[4*i] + 3 * pow(1-t,2) * t * gy[4*i+1] + 3 * (1-t) * pow(t,2) * gy[4*i+2] + pow(t,3) * gy[4*i+3];
                for(int u = 0; u < 9; u++) {
                    g2.drawLine((int) Px, (int) Py, (int) Px, (int) Py);
                }
            }
        }
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(20f,
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER,
                10));
        for(int i = 0; i <= 0; i++) {
            for(double t = 0; t <=1; t=t+0.001) {
                Px = pow(1-t,3) * bx[4*i] + 3 * pow(1-t,2) * t * bx[4*i+1] + 3 * (1-t) * pow(t,2) * bx[4*i+2] + pow(t,3) * bx[4*i+3];
                Py = pow(1-t,3) * by[4*i] + 3 * pow(1-t,2) * t * by[4*i+1] + 3 * (1-t) * pow(t,2) * by[4*i+2] + pow(t,3) * by[4*i+3];
                for(int u = 0; u < 9; u++) {
                    g2.drawLine((int) Px, (int) Py, (int) Px, (int) Py);
                }
            }
        }
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(20f,
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER,
                10));
        for(int i = 0; i <= 5; i++) {
            for(double t = 0; t <=1; t=t+0.001) {
                Px = pow(1-t,3) * x[4*i] + 3 * pow(1-t,2) * t * x[4*i+1] + 3 * (1-t) * pow(t,2) * x[4*i+2] + pow(t,3) * x[4*i+3];
                Py = pow(1-t,3) * y[4*i] + 3 * pow(1-t,2) * t * y[4*i+1] + 3 * (1-t) * pow(t,2) * y[4*i+2] + pow(t,3) * y[4*i+3];
                g2.drawLine((int)Px,(int)Py, (int)Px, (int)Py);
            }
        }

    }
}