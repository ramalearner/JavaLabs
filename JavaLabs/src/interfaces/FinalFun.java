package interfaces;

public final class FinalFun {
    private int x, y;
    public FinalFun(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String []args) {
        FinalFun f1 = new FinalFun(100,200);
        f1.x = 1000;
    }
}
