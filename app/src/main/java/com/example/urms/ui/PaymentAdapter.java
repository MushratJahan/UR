package com.example.urms.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.urms.Payment;
import com.example.urms.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.ViewHolder> {
    Context context;
    List<Payment> payment_list;

    public PaymentAdapter(Context context,List<Payment>payment_list) {
        this.context = context;
        this.payment_list = payment_list;
    }
    @NotNull
    @Override
    public PaymentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     if (payment_list != null && payment_list.size() >0){
         Payment model = payment_list.get(position);
         holder.date_tv.setText(model.getDate());
         holder.payment_tv.setText(model.getPayment());
     }else {
         return;
     }
    }

    @Override
        public int getItemCount() {
        return payment_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date_tv,payment_tv;
        public ViewHolder(View itemView) {
            super(itemView);

            date_tv=itemView.findViewById(R.id.date_tv);
            payment_tv=itemView.findViewById(R.id.payment_tv);

        }
    }
}
