package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Queue extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=zp6pBNbUB2U&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=41";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=YqrFeU90Coo&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=42";
        }
        else if(i==3)
        {
            s="https://www.youtube.com/watch?v=wptevk0bshY";
        }
        else if (i==4)
        {
            s="https://www.youtube.com/watch?v=dn01XST9-bI&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=44";
        }
        else if (i==5)
        {
            s="https://www.youtube.com/watch?v=pqg0SOPRlJ4&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=47";
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
        setContentView(R.layout.queue);
    }
}
