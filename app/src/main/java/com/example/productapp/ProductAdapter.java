package com.example.productapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter{

    private Activity activity;
    private List<Product> listProduct;

    public ProductAdapter(Activity activity, List<Product> listProduct) {
        this.activity = activity;
        this.listProduct = listProduct;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(
                R.layout.item_product, parent, false);
        ProductHolder holder = new ProductHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductHolder pHolder = (ProductHolder) holder;
        Product data = listProduct.get(position);
        pHolder.ivAvatar.setImageResource(data.getImage());
        pHolder.tvName.setText(data.getTitle());
        pHolder.tvDes.setText(data.getDes());
        pHolder.tvPrice.setText(String.valueOf(data.getPrice()));
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        TextView tvName;
        TextView tvDes;
        TextView tvPrice;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvName = itemView.findViewById(R.id.tvName);
            tvDes = itemView.findViewById(R.id.tvDes);
            tvPrice = itemView.findViewById(R.id.tvPrice);

        }
    }
}
