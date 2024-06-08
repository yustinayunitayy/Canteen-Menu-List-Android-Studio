package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class MenuAdapter  extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private List<String> menuItems;

    public MenuAdapter(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        String menuItem = menuItems.get(position);
        holder.bind(menuItem);
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        private TextView menuItemTextView;

        public MenuViewHolder(View itemView) {
            super(itemView);
            menuItemTextView = itemView.findViewById(android.R.id.text1);
        }

        public void bind(String menuItem) {
            menuItemTextView.setText(menuItem);
        }
    }
}