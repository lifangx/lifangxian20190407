package com.example.www.lifangxian20190407.net;

import android.os.Handler;
import android.os.Message;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpUtils {
    private int HTTP_SUCCESS=1000;
    private int HTTP_FAIL=1001;
    public OkHttpUtils get(String url){
        init(url,0,null);
        return this;
    }
    public OkHttpUtils post(String url,FormBody.Builder bodybuilder){
        init(url,1,bodybuilder);
        return this;
    }

    private void init(String url, int type,FormBody.Builder bodybuilder) {
        OkHttpClient client=new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(url);
        if(type==0){
            builder.get();
        }else{
            RequestBody body=new FormBody.Builder().build();
            builder.post(body);
        }
        Request request=builder.build();
        final Message message=new Message();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                message.what=HTTP_FAIL;
                handler.sendMessage(message);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                message.what=HTTP_SUCCESS;
                message.obj=response.body().string();
                handler.sendMessage(message);
            }
        });
    }

     Handler handler=new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            return false;

        }
    });
}
