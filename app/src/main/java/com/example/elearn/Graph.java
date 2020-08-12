package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Graph extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=5hPfm_uqXmw&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=80";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=WnBWYW4nQEk";
        }
        else if(i==3)
        {
            s="https://www.youtube.com/watch?v=vf-cxgUXcMk&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=81";
        }
        else if (i==4)
        {
            s="https://www.youtube.com/watch?v=KudAWAMiQog&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=93";
        }


        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
        try {
            startActivity(webIntent);
        } catch (ActivityNotFoundException ex) {
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);
    }
}
