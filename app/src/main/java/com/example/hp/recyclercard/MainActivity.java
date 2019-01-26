package com.example.hp.recyclercard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<ExampleItem> exampleList= new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.node,"Clicked At Studio"));
        exampleList.add(new ExampleItem(R.drawable.oner,"Clicked At Italy"));
        exampleList.add(new ExampleItem(R.drawable.twor,"Clicked At Rome"));
        exampleList.add(new ExampleItem(R.drawable.threer,"Clicked At Greece"));
        exampleList.add(new ExampleItem(R.drawable.fourr,"Clicked At India"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"Clicked At Santorini"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"Clicked At Pune"));

        //Config for RV
        recyclerView= findViewById(R.id.recyclerView);
        //performance
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter= new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
