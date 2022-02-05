package com.asish.companyinfo.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.asish.companyinfo.R;
import com.asish.companyinfo.adapters.CompanyAdapter;
import com.asish.companyinfo.databinding.ActivityMainBinding;
import com.asish.companyinfo.models.CompanyModel;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RecyclerView recyclerView;
    private CompanyAdapter companyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        recyclerView = binding.recyclerView;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<CompanyModel> companies = Arrays.asList(
            new CompanyModel("Facebook", "Mark", R.drawable.facebook),
            new CompanyModel("Instagram", "Mark", R.drawable.instagram),
            new CompanyModel("Linkedin", "Mark", R.drawable.linkedin),
            new CompanyModel("Quora", "Mark", R.drawable.quora),
            new CompanyModel("Skype", "Mark", R.drawable.skype),
            new CompanyModel("Snapchat", "Mark", R.drawable.snapchat),
            new CompanyModel("Telegram", "Mark", R.drawable.telegram),
            new CompanyModel("whatsapp", "Mark", R.drawable.whatsapp),
            new CompanyModel("yelp", "Mark", R.drawable.yelp));

        companyAdapter = new CompanyAdapter(companies);

        recyclerView.setAdapter(companyAdapter);

    }
}