package com.prabhakar.recyclerview_iv_we;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText etOption;
    private EditText etSendMsg;
    private ImageView sendBtn;
    private ArrayList<BaseModel> msgList = new ArrayList<>();
    ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setRecyclerView();
    }

    private void setRecyclerView() {
        chatAdapter = new ChatAdapter(msgList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chatAdapter);
    }

    private void buildList() {
        if (etOption.getText().toString().equals("0")) {
            msgList.add(new SenderModel(etSendMsg.getText().toString()));
        } else if (etOption.getText().toString().equals("1")) {
            msgList.add(new ReceiverModel(etSendMsg.getText().toString()));

        }
        chatAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        etOption = findViewById(R.id.etChoice);
        etSendMsg = findViewById(R.id.etSendMessage);
        sendBtn = findViewById(R.id.ivSend);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildList();
            }
        });
    }
}