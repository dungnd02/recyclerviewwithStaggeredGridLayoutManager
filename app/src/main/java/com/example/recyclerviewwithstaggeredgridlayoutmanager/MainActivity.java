package com.example.recyclerviewwithstaggeredgridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView revUser;
    private  UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        revUser = findViewById(R.id.recyle_user);
        userAdapter = new UserAdapter();

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        revUser.setLayoutManager(staggeredGridLayoutManager);
        userAdapter.setData(getListUser());
        revUser.setAdapter(userAdapter);



    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User 4"));
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User 4"));
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"User 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"User 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"User 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"User 4"));
        return list;
    }
}