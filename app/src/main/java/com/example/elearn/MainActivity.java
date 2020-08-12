package com.example.elearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void clickLinkedlist(){
        CardView linkedlist = (CardView)findViewById(R.id.card_linkedlist);
        linkedlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LinkedList.class);
                startActivity(i);
            }
        });
    }
    public void clickGraph(){
        CardView graph = (CardView)findViewById(R.id.card_graph);
      graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Graph.class);
                startActivity(i);
            }
        });
    }
    public void clickTree(){
        CardView tree = (CardView)findViewById(R.id.card_tree);
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tree.class);
                startActivity(i);
            }
        });
    }
    public void clickHashing(){
        CardView hashing = (CardView)findViewById(R.id.card_hashing);
        hashing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Hashing.class);
                startActivity(i);
            }
        });
    }
    public void clickSearching(){
        CardView searching = (CardView)findViewById(R.id.card_searchingsorting);
        searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SearchingAndSorting.class);
                startActivity(i);
            }
        });
    }
    public void clickAlgo(){
        CardView algo = (CardView)findViewById(R.id.card_algorithms);
        algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Algorithms.class);
                startActivity(i);
            }
        });
    }
    public void clickQueue(){
        CardView queue = (CardView)findViewById(R.id.card_queue);
        queue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Queue.class);
                startActivity(i);
            }
        });
    }
    public void clickStack(){
        CardView stack = (CardView)findViewById(R.id.card_stack);
        stack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Stack.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickLinkedlist();
        clickGraph();
        clickTree();
        clickHashing();
        clickSearching();
        clickAlgo();
        clickQueue();
        clickStack();
    }
}
