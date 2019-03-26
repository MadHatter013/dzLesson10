package task4;

public class Skirt extends Clothing implements WomanClothing {
    public Skirt( int size, double cost, String color) {
        this.cost = cost;
        this.size = size;
        this.color = color;
    }
    @Override
    public void dressWoman() {
        System.out.println("Вся информация о женской юбке (цена : размер : цвет) " + cost + " : " + size + " : " + color);
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
        return "Skirt{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
