package box;

public class Box {

    private double weigth;

    public Box(double weigth) {
        this.weigth = weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public void showInfo() {
        System.out.print("вес коробки = ");
    }
}
