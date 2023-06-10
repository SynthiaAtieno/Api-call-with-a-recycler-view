package com.example.fetchapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {


    List<Posts> postsList;

    public AdapterClass(List<Posts> posts) {

        this.postsList = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Posts posts = postsList.get(position);

        holder.id.setText("ID \n"+postsList.get(position).getId());
        holder.userid.setText("User id \n"+postsList.get(position).getUserId());
        holder.title.setText("Title \n"+postsList.get(position).getTitle());
        holder.body.setText("Body \n"+postsList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id, userid, title, body;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.txtid);
            userid = itemView.findViewById(R.id.txtuserid);
            title = itemView.findViewById(R.id.txttitle);
            body = itemView.findViewById(R.id.txtbody);


        }
    }
}
