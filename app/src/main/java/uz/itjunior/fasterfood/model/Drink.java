package uz.itjunior.fasterfood.model;

public class Drink extends Food {

    private double liter;

    public Drink() {
    }

    public Drink(String id,
                 String title,
                 String type,
                 String description,
                 double price,
                 double rating,
                 int img,
                 double liter) {

        super(id, title, type, description, price, rating, img);
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }
}
