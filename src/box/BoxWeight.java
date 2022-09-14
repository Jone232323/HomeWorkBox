package box;

public class BoxWeight extends Box {
    public BoxWeight(double weigth) {
        super(weigth);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(getWeigth());
    }
}
