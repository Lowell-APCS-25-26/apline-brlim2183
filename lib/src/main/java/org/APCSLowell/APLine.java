package org.APCSLowell;

public class APLine {
    int a, b, c;
    public APLine(int a1, int b2, int c3) {
        a=a1;
        b=b2;
        c=c3;
    }
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
    public double getSlope() {
        return -(double)a / (double)b;
    }
}
