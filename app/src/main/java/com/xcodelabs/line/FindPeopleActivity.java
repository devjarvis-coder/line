package com.xcodelabs.line;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FindPeopleActivity extends AppCompatActivity {

    private RecyclerView findFriendList;
    private EditText searchET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_people);

        searchET = findViewById(R.id.search_user_txt);
        findFriendList =findViewById(R.id.find_Friend_list);
        findFriendList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    public static class FindFriendsViewHolder extends RecyclerView.ViewHolder
    {
        TextView userNameTxt;
        Button videoCallBtn;
        ImageView profileImageview;
        RelativeLayout cardView;

        public FindFriendsViewHolder(@NonNull View itemView) {
            super(itemView);

            userNameTxt = itemView.findViewById(R.id.name_contact);
            videoCallBtn = itemView.findViewById(R.id.call_btn);
            profileImageview = itemView.findViewById(R.id.image_contact);
            cardView = itemView.findViewById(R.id.card_view1);
        }
    }
}