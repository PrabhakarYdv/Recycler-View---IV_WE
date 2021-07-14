package com.prabhakar.recyclerview_iv_we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<BaseModel> baseModel;


    public ChatAdapter(ArrayList<BaseModel> baseModel) {
        this.baseModel = baseModel;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_item_layout, parent, false);
                return new SenderViewHolder(view);

            case 1:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout, parent, false);
                return new ReceiverViewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = baseModel.get(position).getViewType();
        switch (viewType) {
            case 0:
                if (holder instanceof SenderViewHolder) {
                    ((SenderViewHolder) holder).setData((SenderModel) baseModel.get(position));
                }
                break;
            case 1:
                if (holder instanceof ReceiverViewHolder) {
                    ((ReceiverViewHolder) holder).setData((ReceiverModel) baseModel.get(position));
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return baseModel.size();
    }

    @Override
    public int getItemViewType(int position) {
        return baseModel.get(position).getViewType();

    }

}
