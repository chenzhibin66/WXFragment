package com.example.administrator.wxfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String TAG ="MainActivity";
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        Button btn_wx=(Button)findViewById(R.id.btn_wx);
        Button btn_contact=(Button)findViewById(R.id.btn_contact);
        Button btn_me=(Button)findViewById(R.id.btn_me);
        Button btn_discover=(Button)findViewById(R.id.btn_discover);
        btn_wx.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
        btn_discover.setOnClickListener(this);
        btn_me.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())   {
            case R.id.btn_wx:
                Log.d(TAG, "onClick: wx");
                fragmentManager.beginTransaction().replace(R.id.ll_layout,new WxFragment()).commit();
                break;
            case R.id.btn_contact:
                fragmentManager.beginTransaction().replace(R.id.ll_layout,new ContactFragment()).commit();
                break;
            case R.id.btn_discover:
                fragmentManager.beginTransaction().replace(R.id.ll_layout,new DiscoverFragment()).commit();
                break;
            case R.id.btn_me:
                fragmentManager.beginTransaction().replace(R.id.ll_layout,new MeFragment()).commit();
                break;
        }

    }
}
