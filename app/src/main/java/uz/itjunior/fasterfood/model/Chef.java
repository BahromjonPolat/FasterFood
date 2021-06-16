package uz.itjunior.fasterfood.model;

public class Chef {

    private int image;
    private String id;
    private String name;
    private String lastname;

    public Chef(int image, String id, String name, String lastname) {
        this.image = image;
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
