package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Algorithms extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=smHnz2RHJBY&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=92";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=EjVHtpWkIho&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=85";
        }
        else if(i==3)
        {
            s="https://www.youtube.com/watch?v=ZtZaR7EcI5Y&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=84";
        }
        else if (i==4)
        {
            s="https://www.youtube.com/watch?v=saofdNsZiYY&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=111";
        }
        else if (i==5)
        {
            s="https://www.youtube.com/watch?v=Gc4mWrmJBsw&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=94";
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
        setContentView(R.layout.algorithms);
    }
}
