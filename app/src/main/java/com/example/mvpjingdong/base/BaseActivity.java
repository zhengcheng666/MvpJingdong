package com.example.mvpjingdong.base;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @创建时间 2020/12/25 20:27
 */
public abstract class BaseActivity <T extends BasePresenter>extends AppCompatActivity implements BaseView {
    //泛型是基类P层的对象  就是代表P层的对象就是
    public T per;


}
