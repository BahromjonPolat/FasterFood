package uz.itjunior.fasterfood.model;

public class Food {

    private String id;
    private String title;
    private String type;
    private String description;
    private double price;
    private int img;
    private Chef chef;

    public Food() {

    }

    public Food(String id, String title, String type, Chef chef, String description, double price, int img) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.chef = chef;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
