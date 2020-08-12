package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tree extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=YAdLFsTG70w&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=49";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=-b2lciNd2L4";
        }
        else if(i==3)
        {
            s="https://www.youtube.com/watch?v=vvey2QCs98o&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=50";
        }
        else if (i==4)
        {
            s="https://youtu.be/bvpiyKo9hnI";
        }
        else if (i==5)
        {
            s="https://www.youtube.com/watch?v=Y0fmHaY8lx4";
        }
        else if (i==6)
        {
            s="https://www.youtube.com/watch?v=cySVml6e_Fc&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=58";
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
        setContentView(R.layout.tree);
    }
}
