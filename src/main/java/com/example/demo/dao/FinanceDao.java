package com.example.demo.dao;

import com.example.demo.entity.Finance;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FinanceDao {
    @Insert("insert into finance(companyname,surplusmoney,frozenmoney) values(#{companyname},#{surplusmoney},#{frozenmoney})")
    public int addFinance(Finance finance) throws Exception;

    @Select("select * from finance where companyname=#{companyname}")
    public Finance getFinance(@Param("companyname")String companyname) throws Exception;

    @Select("select * from finance")
    public List<Finance> getAllFinance() throws Exception;
}
