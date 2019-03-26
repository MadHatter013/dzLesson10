package task4;

public enum PartA {
    XXS(32) {
        @Override
        void getDescription() {
            System.out.println("Детский размер");
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    PartA(int euroSize) {
        this.euroSize = euroSize;
    }

    void getDescription() {
        System.out.println("Взрослый размер");
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "PartA{" +
                "euroSize=" + euroSize +
                '}';
    }
}
