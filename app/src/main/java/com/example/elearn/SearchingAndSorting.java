package com.example.elearn;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchingAndSorting extends Activity {
    public void clickA(View view)
    {
        TextView link =(TextView)view;
        String s="";
        int i=Integer.parseInt(link.getTag().toString());
        if(i==1)
        {
            s="https://www.youtube.com/watch?v=o4bAoo_gFBU&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=97";
        }
        else if(i==2)
        {
            s="https://www.youtube.com/watch?v=9oWd4VJOwr0&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=99";
        }
        else if(i==3)
        {
            s="https://www.youtube.com/watch?v=yCxV0kBpA6M&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=98";
        }
        else if (i==4)
        {
            s="https://www.youtube.com/watch?v=jlHkDBEumP0&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=101";
        }
        else if (i==5)
        {
            s="https://www.youtube.com/watch?v=QN9hnmAgmOc&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=100";
        }
        else if (i==6)
        {
            s="https://www.youtube.com/watch?v=JMlYkE8hGJM&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=104";
        }
        else if (i==7)
        {
            s="https://www.youtube.com/watch?v=Q_eia3jC9Ts&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=103";
        }
        else if (i==8)
        {
            s="https://www.youtube.com/watch?v=9crZRd8GPWM&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=105";
        }
        else if (i==9)
        {
            s="https://www.youtube.com/watch?v=C46QfTjVCNU&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=95";
        }
        else if (i==10)
        {
            s="https://www.youtube.com/watch?v=V_T5NuccwRA&list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU&index=96";
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
        setContentView(R.layout.searchingsorting);
    }
}
