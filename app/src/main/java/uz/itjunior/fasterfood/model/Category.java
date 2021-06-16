package uz.itjunior.fasterfood.model;

import android.app.Activity;

public class Category {

    private int image;
    private String title;
    private String description;
    private Activity activity;

    public Category(int image, String title, String description, Activity activity) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.activity = activity;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
