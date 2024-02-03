package com.xuecheng;

public class PageParams {

    //当前页码
    private Long pageNo = 1L;

    //每页记录数默认值
    private Long pageSize =10L;

    public PageParams(){

    }

    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
