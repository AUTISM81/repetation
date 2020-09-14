public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    public int[] getXY() {
        int[] val = new int[2];
        val[0] = this.x;
        val[1] = this.y;

        return val;
    }

    public String toString() {
    return "cordinates is " + this.x + ", " + this.y;
    }

    public double distance(int x1, int y1) {
        return Math.sqrt( Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
    }

    public double distance(MyPoint a) {
        return Math.sqrt( Math.pow(a.getX()-x, 2) + Math.pow(a.getY()-y, 2));
    }

    public double distance() {
        return Math.sqrt( Math.pow(0-x, 2) + Math.pow(0-y, 2));
    }


}

