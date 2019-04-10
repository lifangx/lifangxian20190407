package com.example.www.lifangxian20190407.bb;

public class Rxxp {
    private CCommodityList commodityList;

    public Rxxp(CCommodityList commodityList) {
        this.commodityList = commodityList;
    }

    public CCommodityList getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CCommodityList commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "Rxxp{" +
                "commodityList=" + commodityList +
                '}';
    }
}
