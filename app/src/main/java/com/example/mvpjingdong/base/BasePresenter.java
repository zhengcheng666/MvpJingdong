package com.example.mvpjingdong.base;

/**
 * @创建时间 2020/12/25 20:28
 */
public abstract class BasePresenter <V extends BaseView,M extends BaseModel>{
    public V iView;
    public M iModel;
    public void getVandM(V v){
        iView=v;
        iModel=getiModel();
    }
    public void detachView(){
        if(iView!=null){
            iView=null;
        }
        if(iModel!=null){
            iModel=null;
        }
    }
    public abstract M getiModel();
}
