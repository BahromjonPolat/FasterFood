package uz.itjunior.fasterfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.model.Food;

public class FoodHorizontalAdapter extends RecyclerView.Adapter<FoodHorizontalAdapter.FoodHolder> {

    private final Context context;
    private final List<Food> foods;

    public FoodHorizontalAdapter(Context context, List<Food> foods) {
        this.context = context;
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food_horizontal, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHorizontalAdapter.FoodHolder holder, int position) {
        Food food = foods.get(position);

        holder.imgFood.setImageResource(food.getImg());
        holder.txtTitle.setText(food.getTitle());
        holder.txtDescription.setText(food.getDescription());
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class FoodHolder extends RecyclerView.ViewHolder {

        private final ImageView imgFood;
        private final TextView txtTitle;
        private final TextView txtDescription;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.item_food_hr_img);
            txtTitle = itemView.findViewById(R.id.item_food_hr_title_txt);
            txtDescription = itemView.findViewById(R.id.item_food_hr_description_txt);
        }
    }
}

