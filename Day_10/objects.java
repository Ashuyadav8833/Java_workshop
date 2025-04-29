class rectangle {
    int length = 0, width = 0;

    rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area is : " + (length * width));
    }
}

public class objects {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(3,4);
        r1.area();
    }
}