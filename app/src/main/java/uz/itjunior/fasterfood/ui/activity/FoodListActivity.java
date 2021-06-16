package uz.itjunior.fasterfood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.adapter.FoodViewPagerAdapter;
import uz.itjunior.fasterfood.model.Chef;
import uz.itjunior.fasterfood.model.Food;

public class FoodListActivity extends AppCompatActivity {

    private RecyclerView rv;
    private FoodViewPagerAdapter adapter;
    private List<Food> foods;
    private Chef chef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_food_list);

        rv = findViewById(R.id.food_list_rv);
        foods = new ArrayList<>();
        adapter = new FoodViewPagerAdapter(this, foods);
        chef = new Chef(R.drawable.bahriddin_chustiy, "id", "Bahriddin", "Chustiy");
        addFood();
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv.setAdapter(adapter);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(rv);

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
}