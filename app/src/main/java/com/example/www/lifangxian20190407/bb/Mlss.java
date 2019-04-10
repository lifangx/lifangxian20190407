package com.example.www.lifangxian20190407.bb;

public class Mlss {
    private CCommodityList commodityList;

    public CCommodityList getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CCommodityList commodityList) {
        this.commodityList = commodityList;
    }

    public Mlss(CCommodityList commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "Mlss{" +
                "commodityList=" + commodityList +
                '}';
    }
}
