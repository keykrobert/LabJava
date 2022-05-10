import java.util.Arrays;
import java.util.Objects;

public class Rectangle {
    int height;
    int width;

    /**
     *
     * @param height
     * @param width
     */
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.height * this.width;
    }
    public int getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public void checker() {
        if(this.height == 0 || this.width == 0){
            System.exit(1);
        }
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public double getDiagonal(){
        return Math.pow(Math.pow(this.height, 2) + Math.pow(this.width, 2), 1/2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getHeight() == rectangle.getHeight() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.checker();
        System.out.println(rectangle.getHeight());
        rectangle.setHeight(5);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

    }
}
