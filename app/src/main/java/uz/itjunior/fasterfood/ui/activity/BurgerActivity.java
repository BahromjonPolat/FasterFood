package uz.itjunior.fasterfood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.adapter.FoodGridAdapter;
import uz.itjunior.fasterfood.model.Category;
import uz.itjunior.fasterfood.model.Food;

public class BurgerActivity extends AppCompatActivity {
    private RecyclerView rv;
    private FoodGridAdapter gridAdapter;
    private List<Category> categories;
    private int column;
    private GridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_burger);

        column = 1;

        rv = findViewById(R.id.burger_tv);
        categories = new ArrayList<>();
        gridAdapter = new FoodGridAdapter(this, categories);
        manager = new GridLayoutManager(this, column);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(manager);
        rv.setAdapter(gridAdapter);

        addCategory();

    }

    private void addCategory() {

        categories.add(new Category(R.drawable.burger_1, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.burger_3, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.kebab_1, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.pizza_piese, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.mac_chiato, "Coffee", "Hot coffee", new BurgerActivity()));
        categories.add(new Category(R.drawable.burger_3, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.kebab_1, "Burgers", "Testy Burgers for you", new BurgerActivity()));
        categories.add(new Category(R.drawable.pizza_piese, "Burgers", "Testy Burgers for you", new BurgerActivity()));

    }

    public void changeColumn(View view) {

        if (column == 1) {
            manager.setSpanCount(2);
            column = 2;

        } else {
            manager.setSpanCount(1);
            column = 1;
        }

    }
}