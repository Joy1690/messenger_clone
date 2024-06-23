package com.example.messenger_clone_assignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    private ArrayList<String> mNames_v = new ArrayList<>();
    private ArrayList<String> mImageUrls_v = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       // initRecyclerView ();
        initRecyclerView ();

    }

    private void initRecyclerView(){
        //Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView_h = findViewById(R.id.rv_horizontal);
        RecyclerView recyclerView_v=findViewById(R.id.rv_vertical);


        recyclerView_h.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_v.setLayoutManager(new LinearLayoutManager(this));

        Adapter_horizotal adapter = new Adapter_horizotal( mNames,mImageUrls,this);
        recyclerView_h.setAdapter(adapter);


       // recyclerView.setLayoutManager( new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));



        Adapter_vertical adapter2 = new Adapter_vertical( mNames_v,mImageUrls_v,this);
        recyclerView_v.setAdapter(adapter2);


        //recyclerView.setLayoutManager( new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));




       //  LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        recyclerView_h.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));



       // LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        recyclerView_v.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");


        //-----------
        mImageUrls_v.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames_v.add("Havasu Falls");

        mImageUrls_v.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames_v.add("Trondheim");

        mImageUrls_v.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames_v.add("Portugal");

        mImageUrls_v.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames_v.add("Rocky Mountain National Park");


        mImageUrls_v.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames_v.add("Mahahual");

        mImageUrls_v.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames_v.add("Frozen Lake");


        mImageUrls_v.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls_v.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames_v.add("Austrailia");

        mImageUrls_v.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames_v.add("Washington");



        //-------

    }
}