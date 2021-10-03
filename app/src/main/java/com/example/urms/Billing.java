package com.example.urms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.urms.ui.PaymentAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Billing extends AppCompatActivity {

    RecyclerView recycler_view;
    PaymentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);

        recycler_view = findViewById(R.id.recycler_view);
        setRecyclerView();
    }

    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PaymentAdapter(this,getList());
        recycler_view.setAdapter(adapter);
    }
    private List<Payment>getList(){
        List<Payment> payment_list = new ArrayList<>();
        payment_list.add(new Payment("1-08-2017","10000"));
        payment_list.add(new Payment("2-10-2018","40000"));
        payment_list.add(new Payment("3-01-2019","20000"));
        payment_list.add(new Payment("4-09-2019","36000"));
        payment_list.add(new Payment("5-02-2021","14000"));
        return payment_list;
    }

    public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


        public MyAdapter(){

        }
        @NonNull
        @NotNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}