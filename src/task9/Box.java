package task9;

import java.io.Serializable;

public class Box implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private int x;
    private int y;
    private int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public int getVolume() {
        return getX() * getY() * getZ();
    }
}
