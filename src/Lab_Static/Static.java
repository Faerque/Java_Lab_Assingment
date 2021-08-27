package Lab_Static;

public class Static {
    static int x;

    Static() {
        x++;
        y++;
    }

    public int displayStatic() {
        return x;
    }
    int y;

    public int displayNonStatic() {
        return y;
    }

}
