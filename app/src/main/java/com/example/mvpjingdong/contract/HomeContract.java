package com.example.mvpjingdong.contract;


import com.example.mvpjingdong.base.BaseModel;
import com.example.mvpjingdong.base.BaseView;
import com.example.mvpjingdong.bean.Bean;
import com.example.mvpjingdong.net.CallBackinterface;

public class HomeContract {
    public interface IMainView extends BaseView {

        void onSuccess(Bean bean);

    }
    public interface IMainPresenter{


        void getData();
    }
    public interface IMainModel extends BaseModel {
        <T>void getLoginData(String newlist, CallBackinterface<T> beanCallBackinterface);
    }
}
