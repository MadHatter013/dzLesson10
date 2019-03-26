package task4;

public class Studio{
    public void dressMan(Clothing[] clothing) {
        for (Clothing c: clothing) {
            if (c instanceof Shirt){
                ((Shirt)c).dressMan();
            }
            if (c instanceof Tie){
                ((Tie)c).dressMan();
            }
            if (c instanceof Pants){
                ((Pants)c).dressMan();
            }
        }
    }

    public void dressWoman(Clothing[] clothing) {
        for (Clothing c: clothing) {
            if (c instanceof Shirt){
                ((Shirt)c).dressWoman();
            }
            if (c instanceof Skirt){
                ((Skirt)c).dressWoman();
            }
            if (c instanceof Pants){
                ((Pants)c).dressWoman();
            }
        }
    }

    @Override
    public String toString() {
        return "Studio{}";
    }
}
