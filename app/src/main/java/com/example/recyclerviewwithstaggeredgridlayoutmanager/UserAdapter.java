package com.example.recyclerviewwithstaggeredgridlayoutmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter  extends  RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> slistuser;

    public void setData(List<User> users){
        this.slistuser = users;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemuser,parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  UserAdapter.UserViewHolder holder, int position) {
       User user = slistuser.get(position);
       if(user == null){
           return;
       }
       holder.imgView.setImageResource(user.getResourceID());
       holder.txtName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
       if(slistuser !=null) {
           return slistuser.size();
       }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{


        private ImageView imgView;
        private TextView txtName;
        public UserViewHolder(@NonNull  View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.img_user);
            txtName = itemView.findViewById(R.id.txtname);

        }
    }
}
