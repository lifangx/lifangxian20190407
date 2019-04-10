package com.example.www.lifangxian20190407.mvp.presenter;

import com.example.www.lifangxian20190407.mvp.View.View;
import com.example.www.lifangxian20190407.mvp.model.Molde;

public class MainPresent implements Presenter, Molde.Callbacks {
    private Molde molde;
    private View view;

    public MainPresent(Molde molde, View view) {
        this.molde = molde;
        this.view = view;
    }

    @Override
    public void doData(String url) {
        molde.getData(url,this);
    }

    @Override
    public void success(String data) {
        view.success(data);
    }

    @Override
    public void fail(String error) {
        view.fail(error);
    }
}
