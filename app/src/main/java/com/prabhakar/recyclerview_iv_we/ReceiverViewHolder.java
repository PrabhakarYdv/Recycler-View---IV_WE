package com.prabhakar.recyclerview_iv_we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {
    private TextView rcvMsg;

    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        rcvMsg = itemView.findViewById(R.id.tvReceiverMessage);

    }

    public void setData(ReceiverModel receiverModel) {
        rcvMsg.setText(receiverModel.getReceiverMsg());
    }
}
