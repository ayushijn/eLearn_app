package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Hashing extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=zeMa9sg-VJM&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=108";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=KyUTuwz_b7Q";
        }
        else if(i==3)
        {
            s="https://youtu.be/t0Cq6tVNRBA";
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
        setContentView(R.layout.hashing);
    }
}
