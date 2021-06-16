package uz.itjunior.fasterfood.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.itjunior.fasterfood.R;
import uz.itjunior.fasterfood.model.Category;
import uz.itjunior.fasterfood.model.Food;

public class FoodGridAdapter extends RecyclerView.Adapter<FoodGridAdapter.FoodHolder> {

    private final Context context;
    private final List<Category> categories;

    public FoodGridAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }


    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food_grid, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodGridAdapter.FoodHolder holder, int position) {

        Category category = categories.get(position);
        holder.imgFood.setImageResource(category.getImage());
        holder.txtTitle.setText(category.getTitle());
        holder.txtDescription.setText(category.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, category.getActivity().getClass()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class FoodHolder extends RecyclerView.ViewHolder {

        private final ImageView imgFood;
        private final TextView txtTitle;
        private final TextView txtDescription;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.item_food_grid_img);
            txtTitle = itemView.findViewById(R.id.item_food_grid_title_txt);
            txtDescription = itemView.findViewById(R.id.item_food_grid_description_txt);

        }
    }
}
