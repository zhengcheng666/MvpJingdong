package com.example.mvpjingdong.presenter;


import com.example.mvpjingdong.base.BasePresenter;
import com.example.mvpjingdong.bean.Bean;
import com.example.mvpjingdong.contract.HomeContract;
import com.example.mvpjingdong.model.HomeModel;
import com.example.mvpjingdong.net.CallBackinterface;
import com.example.mvpjingdong.net.URLConstant;

public class HomePresenter extends BasePresenter<HomeContract.IMainView,HomeContract.IMainModel> implements HomeContract.IMainPresenter {

    @Override
    public HomeContract.IMainModel getiModel() {
        return new HomeModel(this);
    }

    @Override
    public void getData() {
        iModel.getLoginData(URLConstant.NEWLIST, new CallBackinterface<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                iView.onSuccess(bean);
            }

            @Override
            public void onFail(String s) {

            }
        });
    }

}
