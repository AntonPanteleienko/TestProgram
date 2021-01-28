package com.example.mytest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder {

TextView messages;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        messages = itemView.findViewById(R.id.message_item);
    }
}
