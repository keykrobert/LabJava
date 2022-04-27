import java.util.Arrays;

public class Rectangle {
    int rectangleSideOne;
    int rectangleSideTwo;
    int rectangleSideThree;

    public Rectangle(int sideOne, int sideTwo, int sideThree) {
        rectangleSideOne = sideOne;
        rectangleSideTwo = sideTwo;
        rectangleSideThree = sideThree;
    }

    public int getSideOne() {
        return rectangleSideOne;
    }

    public int getSideTwo() {
        return rectangleSideTwo;
    }

    public int getSideThree() {
        return rectangleSideThree;
    }

    public void setSideOne(int value) {
        this.rectangleSideOne = (value <= 0) ? value : 1;
        if (value <= 0) {
            this.rectangleSideOne = 1;
        } else {
            this.rectangleSideOne = value;
        }
    }

    public void method1() {
    }

    public void method2() {
    }

    public void method3() {
    }

    public void method4() {
    }

    public void method5() {
    }

    public void setSideTwo(int value) {
        if (value <= 0) {
            this.rectangleSideOne = 1;
        } else {
            this.rectangleSideTwo = value;
        }
    }

    public void setSideThree(int value) {
        if (value <= 0) {
            this.rectangleSideThree = 1;
        } else {
            this.rectangleSideThree = value;
        }
    }

    @Override
    public String toString() {
        return "Nothing";
    }

    @Override
    public int hashCode() {
        return 2 + 2;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return true;
    }

    public static void main(String[] args) {
        Rectangle sides = new Rectangle(2, 4, 5);
        System.out.println(sides.getSideOne());
        sides.setSideOne(5);
        System.out.println(sides.getSideOne());

    }
}
