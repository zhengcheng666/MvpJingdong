package com.example.mvpjingdong.base;



import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @创建时间 2020/12/25 20:27
 */
//公共V层
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {
    //泛型是基类P层的对象  就是代表P层的对象就是
    public T per;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutID());
        if (per != null) {
            //让V层知道T是公共P层的对象
            per = getper();
            per.getVandM(this);
        }
        initData();
        initView();
    }

    //抽象方法可以根据子类的特点，各自实现（写不同的特性的东西。）
    protected abstract T getper();

    protected abstract int getlayoutID();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(per!=null){
            per.detachView();
        }
    }
}
