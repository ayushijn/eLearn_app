package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LinkedList extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
       if(i==1)
       {
           s="https://www.youtube.com/watch?v=dmb1i4oN5oE&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=7";
       }
       else if(i==2)
       {
           s="https://www.youtube.com/watch?v=6wXZ_m3SbEs&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=10";
       }
       else if(i==3)
       {
            s="https://www.youtube.com/watch?v=dq3F3e9o2DM&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=11";
       }
       else if (i==4)
       {
           s="https://www.youtube.com/watch?v=DWpVGpNfDmM&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=8";
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
        setContentView(R.layout.linked_list);
    }
}
