package com.example.mvpjingdong.view;


import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mvpjingdong.R;
import com.example.mvpjingdong.base.BaseActivity;
import com.example.mvpjingdong.bean.Bean;
import com.example.mvpjingdong.contract.HomeContract;
import com.example.mvpjingdong.fragmetn.HomeFragment;
import com.example.mvpjingdong.fragmetn.ListFragment;
import com.example.mvpjingdong.presenter.HomePresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<HomePresenter> implements HomeContract.IMainView, View.OnClickListener {
    private android.widget.FrameLayout frame;
    private android.widget.RadioGroup rg;
    private android.widget.RadioButton btn1;
    private android.widget.RadioButton btn2;
    private android.widget.RadioButton btn3;
    private android.widget.RadioButton btn4;
    private android.widget.RadioButton btn5;
    private HomeFragment homeFragment;
    private ListFragment listFragment;
    private ArrayList<Bean.DataDTO.BannerDTO> bannerDTOS;
    @Override
    protected void initView() {
        frame = (FrameLayout) findViewById(R.id.frame);
        bannerDTOS = new ArrayList<>();
        rg = (RadioGroup) findViewById(R.id.rg);
        btn1 = (RadioButton) findViewById(R.id.btn1);
        btn2 = (RadioButton) findViewById(R.id.btn2);
        btn3 = (RadioButton) findViewById(R.id.btn3);
        btn4 = (RadioButton) findViewById(R.id.btn4);
        btn5 = (RadioButton) findViewById(R.id.btn5);
        homeFragment = new HomeFragment();
        listFragment = new ListFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame, homeFragment)
                .add(R.id.frame, listFragment)
                .hide(listFragment)
                .show(homeFragment)
                .commit();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }
    @Override
    protected int getlayoutID() {
        return R.layout.activity_main;
    }
    @Override
    protected HomePresenter getper() {
        return new HomePresenter();
    }


    @Override
    protected void initData() {

    }

    @Override
    public void onSuccess(Bean bean) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                getSupportFragmentManager().beginTransaction()
                        .hide(listFragment)
                        .show(homeFragment)
                        .commit();
                break;
            case R.id.btn2:
                getSupportFragmentManager().beginTransaction()
                        .hide(homeFragment)
                        .show(listFragment)
                        .commit();
                break;
            case R.id.btn3:

                break;
            case R.id.btn4:

                break;
            case R.id.btn5:

                break;
        }
    }
}