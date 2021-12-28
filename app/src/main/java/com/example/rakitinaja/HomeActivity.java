package com.example.rakitinaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rakitinaja.adapter.CategoryAdapter;
import com.example.rakitinaja.adapter.BestAdapter;
import com.example.rakitinaja.model.BestModel;
import com.example.rakitinaja.model.CategoryModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    public static ArrayList<CategoryModel> listModel;
    public static ArrayList<BestModel> listProduct;
    ArrayList<String> listInfo;
    ImageView profil;
    CategoryAdapter CategoryAdapter;
    BestAdapter BestAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profil = findViewById(R.id.imageViewProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
        //listcategory
        listModel = new ArrayList<>();
        listModel.add(new CategoryModel(R.drawable.category));
        listModel.add(new CategoryModel(R.drawable.category));
        listModel.add(new CategoryModel(R.drawable.category));
        listModel.add(new CategoryModel(R.drawable.category));


        //listproduct
        listProduct = new ArrayList<>();
        listProduct.add(new BestModel("Amd Ryzen 5 3400G",R.drawable.sample, "Rp 6.200.000,-"));
        listProduct.add(new BestModel("Nvidia GeForce GTX 1050",R.drawable.sample, "Rp 7.200.000,-"));
        listProduct.add(new BestModel("Intel i5 580",R.drawable.sample, "Rp 300.000,-"));
        listProduct.add(new BestModel("Amd Ryzen 5 3400G",R.drawable.sample, "Rp 150.000,-"));

        listInfo = new ArrayList<>();
        listInfo.add("8 cores optimized for high-FPS gaming rigs.\n" +
                "\n" +
                "General Specifications\n" +
                "Platform : Boxed Processor\n" +
                "Product Family : AMD Ryzen™ Processors\n" +
                "Product Line : AMD Ryzen™ 7 Desktop Processors\n" +
                "# of CPU Cores : 8\n" +
                "# of Threads : 16\n" +
                "Max. Boost Clock : Up to 4.7GHz\n" +
                "Base Clock : 3.8GHz\n" +
                "Total L2 Cache : 4MB\n" +
                "Total L3 Cache : 32MB\n" +
                "Default TDP : 105W\n" +
                "Processor Technology for CPU Cores : TSMC 7nm FinFET\n" +
                "Unlocked for Overclocking : Yes\n" +
                "CPU Socket : AM4\n" +
                "Thermal Solution (PIB) : Not included\n" +
                "Max. Operating Temperature (Tjmax) : 90°C\n" +
                "Launch Date : 11/5/2020\n" +
                "*OS Support : \tWindows 10 - 64-Bit Edition\n" +
                "\t\tRHEL x86 64-Bit\n" +
                "\t\tUbuntu x86 64-Bit\n" +
                "\t\t*Operating System (OS) support will vary by manufacturer.");
        listInfo.add("agdagdasdfasfdsadf");
        listInfo.add("halo wolrdkljdfalskf");
        listInfo.add("aku mecnintatadi");


        recyclerView = findViewById(R.id.mainrecycler);
        CategoryAdapter = new CategoryAdapter(listModel);

        recyclerView2 = findViewById(R.id.mainrecycler2);
        BestAdapter = new BestAdapter(listProduct, HomeActivity.this, listInfo);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setAdapter(CategoryAdapter);
        recyclerView.setLayoutManager(layoutManager);


        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setAdapter(BestAdapter);
        recyclerView2.setLayoutManager(layoutManager2);




    }




}