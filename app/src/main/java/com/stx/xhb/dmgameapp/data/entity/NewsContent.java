package com.stx.xhb.dmgameapp.data.entity;

/**
 * @author: xiaohaibin.
 * @time: 2018/9/5
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @describe:
 */
public class NewsContent {

    /**
     * pagesize : 10
     * page : 1
     * time : 1535076178701
     * sign : d2fa5047f53cccd99ade57edeaf10ca5
     */

    private int pagesize=10;
    private int page=1;
    private long time;
    private String sign="";

    public NewsContent(int page,long time,String sign) {
        this.time=time;
        this.sign=sign;
        this.page = page;
    }
}
