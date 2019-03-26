package task4;

public class Pants extends Clothing implements ManClothing, WomanClothing {
    public Pants(int size, double cost, String color) {
        this.cost = cost;
        this.size = size;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Вся информация о мужких штанах (цена : размер : цвет) " + cost + " : " + size + " : " + color);

    }

    @Override
    public void dressWoman() {
        System.out.println("Вся информация о женских штанах (цена : размер : цвет) " + cost + " : " + size + " : " + color);

    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
