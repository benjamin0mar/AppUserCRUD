package com.makeasy.frontend.androiddb;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.makeasy.frontend.androiddb.Adapters.UsersAdapter;
import com.makeasy.frontend.androiddb.POJOS.User;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList <User> users;
    UsersAdapter usersAdapter;
    Data data;
    FloatingActionButton addUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createData();

        addUser = (FloatingActionButton) findViewById(R.id.addUser);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        usersAdapter = new UsersAdapter(this, users);
        recyclerView.setAdapter(usersAdapter);

        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(intent);
            }
        });

    }

    public void createData(){
        users= new ArrayList<>();
        users.add(new User("1", "omar ", "romero garcia","http://imagen.png",0));
        users.add(new User("2", "benjamin", "romero perez","http://imagen.png",0));
        users.add(new User("3", "Jose", "garcia gomez","http://imagen.png",0));
        users.add(new User("4", "angela", "romero carrillo","http://imagen.png",0));
        users.add(new User("5", "roberto", "cabrera romero","http://imagen.png",0));
        users.add(new User("6", "Jose", "hoyos garcia","http://imagen.png",0));
        users.add(new User("7", "antonio ", "olivos carrillo","http://imagen.png",0));
        users.add(new User("8", "pepito", "romero garcia","http://imagen.png",0));

        data = new Data(this);
        data.open();
        data.insertUsers(users);
    }




}
