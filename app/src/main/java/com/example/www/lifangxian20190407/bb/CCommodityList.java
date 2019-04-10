package com.example.www.lifangxian20190407.bb;

public class CCommodityList {
//    commodityId": 32,
//            "commodityName": "唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋",
//            "masterPic": "http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg",
//            "price": 88,
//            "saleNum": 0
    private String commodityId;
    private String commodityNamel;
    private String masterPic;
    private String price;
    private String saleNum;

    public CCommodityList(String commodityId, String commodityNamel, String masterPic, String price, String saleNum) {
        this.commodityId = commodityId;
        this.commodityNamel = commodityNamel;
        this.masterPic = masterPic;
        this.price = price;
        this.saleNum = saleNum;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityNamel() {
        return commodityNamel;
    }

    public void setCommodityNamel(String commodityNamel) {
        this.commodityNamel = commodityNamel;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "CCommodityList{" +
                "commodityId='" + commodityId + '\'' +
                ", commodityNamel='" + commodityNamel + '\'' +
                ", masterPic='" + masterPic + '\'' +
                ", price='" + price + '\'' +
                ", saleNum='" + saleNum + '\'' +
                '}';
    }
}
