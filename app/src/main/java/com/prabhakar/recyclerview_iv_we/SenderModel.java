package com.prabhakar.recyclerview_iv_we;

public class SenderModel extends BaseModel {
    private String senderMsg;

    public SenderModel(String senderMsg) {
        this.senderMsg = senderMsg;
    }

    public String getSenderMsg() {
        return senderMsg;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
