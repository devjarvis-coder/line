package com.xcodelabs.line;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NotificationsActivity extends AppCompatActivity {
    private RecyclerView notificationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        notificationList = findViewById(R.id.notifications_list);
        notificationList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    public static class NotificationsViewHolder extends RecyclerView.ViewHolder
    {
        TextView userNameTxt;
        Button acceptBtn, cancelBtn;
        ImageView profileImageview;
        RelativeLayout cardView;

        public NotificationsViewHolder(@NonNull View itemView) {
            super(itemView);

            userNameTxt = itemView.findViewById(R.id.name_notification);
            acceptBtn = itemView.findViewById(R.id.request_accept_btn);
            cancelBtn = itemView.findViewById(R.id.request_declined_btn);
            profileImageview = itemView.findViewById(R.id.image_notification);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }

    
}