package com.example.tasks;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Tasks_Adapter extends RecyclerView.Adapter<Tasks_Adapter.ViewHolder>{
    private List<item> images;
    private Context context;
    @NonNull
    @Override
    public Tasks_Adapter.ViewHolder onCreateViewHolder() {
        return onCreateViewHolder(, );
    }

    @NonNull
    @Override
    public Tasks_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Tasks_Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder {
    }
}
