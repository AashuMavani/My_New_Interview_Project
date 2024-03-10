package com.reward.my_new_interview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Settings_Activity extends AppCompatActivity {
    LinearLayout layoutGames;
    RecyclerView recyclerView;
    Recyclerview_Adapter adapter;
    String name[]={"Change Password","My Addresses","My Wallet","Testimonials","Refer & Earn","Notification Setting","Change Layout","Help & Contact Us","Privacy Policy","About Us","FAQS","Gallery"};
    int img[]={R.drawable.baseline_https_24,R.drawable.baseline_add_location_alt_24,R.drawable.baseline_account_balance_wallet_24,R.drawable.baseline_folder_special_24,R.drawable.baseline_groups_24,R.drawable.baseline_notifications_none_24,R.drawable.baseline_compare_arrows_24,R.drawable.baseline_list_alt_24,R.drawable.baseline_policy_24,R.drawable.baseline_account_box_24,R.drawable.baseline_help_outline_24,R.drawable.baseline_browse_gallery_24};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        recyclerView=findViewById(R.id.recyclerview);
        layoutGames=findViewById(R.id.layoutGames);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Recyclerview_Adapter(Settings_Activity.this,name,img);
        recyclerView.setAdapter(adapter);
        layoutGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Settings_Activity.this, My_Wallet_Money_Activity.class);
                startActivity(intent);
            }
        });



    }
}