package com.example.www.lifangxian20190407.bb;

public class Pzsh {
    private CCommodityList commodityList;

    public Pzsh(CCommodityList commodityList) {
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
        return "Pzsh{" +
                "commodityList=" + commodityList +
                '}';
    }
}
