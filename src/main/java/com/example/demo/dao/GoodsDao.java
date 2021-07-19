package com.example.demo.dao;

import com.example.demo.entity.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDao {
    @Insert("insert into goods(goodsid,companyname,state,role,supply,proarea,goodsprice,drlivergoods,tranprice,quality) values(#{goodsid},#{companyname},#{state},#{role},#{supply},#{proarea},#{goodsprice},#{drlivergoods},#{tranprice},#{quality})")
    public int addGoods(Goods goods) throws Exception;

    @Select("select * from goods where goodsid=#{goodsid}")
    public Goods getGoods(@Param("goodsid")String goodsid) throws Exception;

    @Select("select * from goods")
    public List<Goods> getAllGoods() throws Exception;
}
