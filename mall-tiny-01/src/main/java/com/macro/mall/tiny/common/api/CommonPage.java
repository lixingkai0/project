package com.macro.mall.tiny.common.api;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * 分页数据封装类
 * Created by macro on 2019/4/19.
 */
public class CommonPage<T> {
    private Integer pageNum;    //当前页
    private Integer pageSize;   //每页的数量
    private Integer totalPage;  //总页数
    private Long total;         //总记录数
    private List<T> list;       //结果集

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);   //拿结果集来分页
        result.setTotalPage(pageInfo.getPages());       //设置总页数
        result.setPageNum(pageInfo.getPageNum());       //设置当前页
        result.setPageSize(pageInfo.getPageSize());     //每页的数量
        result.setTotal(pageInfo.getTotal());           //总记录数
        result.setList(pageInfo.getList());             //结果集
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
