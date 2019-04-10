package com.example.www.lifangxian20190407.mvp.model;

public interface Molde {
    interface  Callbacks{
        void success(String data);
        void fail(String error);
    }
    void getData(String url,Callbacks callbacks);
}
