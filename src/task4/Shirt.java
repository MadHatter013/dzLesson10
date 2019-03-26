package task4;

public class Shirt extends Clothing implements ManClothing, WomanClothing {
    public Shirt( int size, double cost, String color) {
        this.cost = cost;
        this.size = size;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Вся информация о мужской футболке (цена : размер : цвет) " + cost + " : " + size + " : " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Вся информация о женской футболке (цена : размер : цвет) " + cost + " : " + size + " : " + color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
