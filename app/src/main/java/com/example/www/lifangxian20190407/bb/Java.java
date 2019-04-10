package com.example.www.lifangxian20190407.bb;

public class Java {

    private Results result;

    public Results getResult() {
        return result;
    }

    public void setResult(Results result) {
        this.result = result;
    }

    public Java(Results result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Java{" +
                "result=" + result +
                '}';
    }
}
