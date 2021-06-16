package uz.itjunior.fasterfood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.adapter.FoodGridAdapter;
import uz.itjunior.fasterfood.adapter.FoodHorizontalAdapter;
import uz.itjunior.fasterfood.model.Category;
import uz.itjunior.fasterfood.model.Chef;
import uz.itjunior.fasterfood.model.Food;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView rvHorizontal;
    private RecyclerView rvVertical;
    private FoodHorizontalAdapter adapter;
    private List<Food> foods;
    private List<Category> categories;
    private FoodGridAdapter gridAdapter;

    private Chef chef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        findView();
        showFood();
        showCategory();

        chef = new Chef(R.drawable.bahriddin_chustiy, "id", "Bahriddin", "Chustiy");


    }

    private void showFood() {
        foods = new ArrayList<>();
        adapter = new FoodHorizontalAdapter(this, foods);

        addFood();

        rvHorizontal.setHasFixedSize(true);
        rvHorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvHorizontal.setAdapter(adapter);
    }

    private void addFood() {
        foods.add(new Food("id", "Hamburger", "Burger", chef, "Very tasty burger", 18000.00, R.drawable.burger_1));
        foods.add(new Food("id", "Pizza Italiano", "Pizza", chef, "Very tasty pizza", 65000.00, R.drawable.pizza_piese));
        foods.add(new Food("id", "Jazz Kebab", "Kebab", chef, "Jalal's kebab", 10000.00, R.drawable.kebab_1));
        foods.add(new Food("id", "Free cheers", "Free", chef, "Very tasty free", 18000.00, R.drawable.hamburger_with_free));
        foods.add(new Food("id", "Hamburger", "Burger", chef, "Very tasty burger", 18000.00, R.drawable.burger_1));
        foods.add(new Food("id", "Pizza Italiano", "Pizza", chef, "Very tasty pizza", 65000.00, R.drawable.pizza_piese));
        foods.add(new Food("id", "Jazz Kebab", "Kebab", chef, "Jalal's kebab", 10000.00, R.drawable.kebab_1));
        foods.add(new Food("id", "Free cheers", "Free", chef, "Very tasty free", 18000.00, R.drawable.hamburger_with_free));

    }

    private void showCategory() {
        categories = new ArrayList<>();
        gridAdapter = new FoodGridAdapter(this, categories);

        addCategory();

        rvVertical.setHasFixedSize(true);
        rvVertical.setLayoutManager(new GridLayoutManager(this, 2));
        rvVertical.setAdapter(gridAdapter);

    }

    private void addCategory() {

        categories.add(new Category(R.drawable.burger_1, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.burger_3, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.kebab_1, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.pizza_piese, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.mac_chiato, "Coffee", "Hot coffee", new FoodListActivity()));
        categories.add(new Category(R.drawable.burger_3, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.kebab_1, "Burgers", "Testy Burgers for you", new FoodListActivity()));
        categories.add(new Category(R.drawable.pizza_piese, "Burgers", "Testy Burgers for you", new FoodListActivity()));

    }

    private void findView() {
        rvHorizontal = findViewById(R.id.main_food_horizontal_rv);
        rvVertical = findViewById(R.id.main_catalog_food_rv);
    }
}