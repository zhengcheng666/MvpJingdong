package com.example.mvpjingdong.model;


import com.example.mvpjingdong.contract.HomeContract;
import com.example.mvpjingdong.net.CallBackinterface;
import com.example.mvpjingdong.net.RetrofitUtils;

public class HomeModel implements HomeContract.IMainModel {

    private HomeContract.IMainPresenter homePresenter;

    public HomeModel(HomeContract.IMainPresenter homePresenter) {

        this.homePresenter = homePresenter;
    }


    @Override
    public <T> void getLoginData(String newlist, CallBackinterface<T> beanCallBackinterface) {
        RetrofitUtils.getInstance().getLogin(newlist,beanCallBackinterface);
    }
}
