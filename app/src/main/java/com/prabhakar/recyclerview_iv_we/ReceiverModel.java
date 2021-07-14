package com.prabhakar.recyclerview_iv_we;

public class ReceiverModel extends BaseModel{
    private String receiverMsg;

    public ReceiverModel(String receiverMsg) {
        this.receiverMsg = receiverMsg;
    }

    public String getReceiverMsg() {
        return receiverMsg;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
