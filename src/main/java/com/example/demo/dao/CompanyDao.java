package com.example.demo.dao;

import com.example.demo.entity.Company;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CompanyDao {
    @Insert("insert into company(companyid,companyname,companysamplename,legalperson,registpart,registmoney,companycontacts,companyphone,companyfax,companyemail,companylicense,companytax,companynum,companybank,companybankNum,companypermit,companyperson,companysituation,companytransport,companyintroduce) " +
            "values(#{companyid},#{companyname},#{companysamplename},#{legalperson},#{registpart},#{registmoney},#{companycontacts},#{companyphone},#{companyfax},#{companyemail},#{companylicense},#{companytax},#{companynum},#{companybank},#{companybankNum},#{companypermit},#{companyperson},#{companysituation},#{companytransport},#{companyintroduce})")
    public int addCompany(Company company) throws Exception;

    @Select("select * from company where companyid=#{companyid}")
    public Company getCompany(@Param("companyid")String companyid) throws Exception;

    @Select("select * from company")
    public List<Company> getAllCompany() throws Exception;
}
