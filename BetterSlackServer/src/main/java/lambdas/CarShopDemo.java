package lambdas;

public class CarShopDemo {
    public static void main(String[] args) {
        CarSelectionView view = new CarSelectionView();
        int userPrice = 250000;
        view.applyFilter(car -> car.getPrice() > userPrice);
    }
}
