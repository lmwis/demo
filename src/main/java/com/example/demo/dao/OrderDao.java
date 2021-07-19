package com.example.demo.dao;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderDao {
    @Insert("insert into order(orderid,agreementid,goodsid,state) values(#{orderid},#{agreementid},#{goodsid},#{state})")
    public int addOrder(Order order) throws Exception;

    @Select("select * from order where orderid=#{orderid}")
    public Order getOrder(@Param("orderid")String orderid) throws Exception;

    @Select("select * from order")
    public List<Order> getAllOrder() throws Exception;
}
