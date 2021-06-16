package uz.itjunior.fasterfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.model.Food;

public class FoodViewPagerAdapter extends RecyclerView.Adapter<FoodViewPagerAdapter.FoodHolder>{

    private final Context context;
    private final List<Food> foods;

    public FoodViewPagerAdapter(Context context, List<Food> foods) {
        this.context = context;
        this.foods = foods;
    }


    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food_list_info, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewPagerAdapter.FoodHolder holder, int position) {
        Food food = foods.get(position);

        holder.imgChef.setImageResource(food.getChef().getImage());
        holder.imgFood.setImageResource(food.getImg());
        holder.txtChefName.setText(food.getChef().getName());
        holder.txtChefPosition.setText(food.getChef().getLastname());
        holder.txtTitle.setText(food.getTitle());
        holder.txtDescription.setText(food.getDescription());
        holder.txtPrice.setText(String.valueOf(food.getPrice()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, food.getTitle() + " was clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class FoodHolder extends RecyclerView.ViewHolder {

        private final ImageView imgChef;
        private final ImageView imgFood;
        private final TextView txtTitle;
        private final TextView txtChefName;
        private final TextView txtChefPosition;
        private final TextView txtDescription;
        private final TextView txtPrice;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imgChef = itemView.findViewById(R.id.item_food_info_chef_img);
            imgFood = itemView.findViewById(R.id.item_food_info_food_img);
            txtTitle = itemView.findViewById(R.id.item_food_info_title_txt);
            txtChefName = itemView.findViewById(R.id.item_food_info_chef_name_txt);
            txtChefPosition = itemView.findViewById(R.id.item_food_info_chef_position_txt);
            txtDescription = itemView.findViewById(R.id.item_food_info_description_txt);
            txtPrice = itemView.findViewById(R.id.item_food_info_price_txt);
        }
    }
}
