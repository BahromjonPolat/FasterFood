package uz.itjunior.fasterfood.adapter;

import android.content.Context;
import android.content.Intent;
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
import uz.itjunior.fasterfood.ui.activity.FoodInfoActivity;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder>{


    private final Context context;
    private final List<Food> foods;

    public FoodAdapter(Context context, List<Food> foods) {
        this.context = context;
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_food_vertical, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.FoodHolder holder, int position) {
        Food food = foods.get(position);

        holder.txtTitle.setText(food.getTitle());
        holder.txtType.setText(food.getType());
        holder.txtPrice.setText(String.valueOf(food.getPrice()));
        holder.imgFood.setImageResource(food.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodInfoActivity.class);
                intent.putExtra("chef", food.getChef().getName());
                intent.putExtra("chefImg", food.getChef().getImage());
                intent.putExtra("description", food.getDescription());
                intent.putExtra("title", food.getTitle());
                intent.putExtra("price", food.getPrice());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class FoodHolder extends RecyclerView.ViewHolder {

        private final ImageView imgFood;
        private final TextView txtTitle;
        private final TextView txtType;
        private final TextView txtPrice;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.item_food_vr_img);
            txtTitle = itemView.findViewById(R.id.item_food_vr_title_txt);
            txtType = itemView.findViewById(R.id.item_food_vr_type_txt);
            txtPrice = itemView.findViewById(R.id.item_food_vr_price_txt);
        }
    }
}
