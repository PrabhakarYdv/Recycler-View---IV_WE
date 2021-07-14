package com.prabhakar.recyclerview_iv_we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {
    private TextView sendMsg;

    public SenderViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        sendMsg = itemView.findViewById(R.id.tvSenderMessage);

    }

    public void setData(SenderModel senderModel) {
        sendMsg.setText(senderModel.getSenderMsg());
    }
}
