package task4;

public class Tie extends Clothing implements ManClothing {
    public Tie( int size, double cost, String color) {
        this.cost = cost;
        this.size = size;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println("Вся информация о мужком галстуке (цена : размер : цвет) " + cost + " : " + size + " : " + color);
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
        return "Tie{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
