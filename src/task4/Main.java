package task4;

public class Main {
    public static void main(String[] args) {
        Clothing[] clothing = {
                new Shirt(32, 340, "Yellow"),
                new Pants(40, 120, "Red"),
                new Skirt(34, 280, "Brown"),
                new Tie(38, 90, "Green")
        };
        Studio studio = new Studio();
        studio.dressMan(clothing);
        System.out.println();
        studio.dressWoman(clothing);
    }

}
