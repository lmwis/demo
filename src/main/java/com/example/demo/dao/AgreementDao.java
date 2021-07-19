package com.example.demo.dao;
import com.example.demo.entity.Agreement;
import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AgreementDao {
    @Insert("insert into agreement (agreementid,acompany,bcompany,transport,price,time) values (#{agreementId},#{aCompany},#{bCompany},#{transport},#{price},#{time})")
    // @Insert("insert into admin (adminname,password,role) values (#{adminName},#{password},#{role})")
    public int addAggreement(Agreement aggrement) throws Exception;

    @Select("select * from agreement where agreementid=#{agreementId}")
    public Agreement getAggreement(Agreement agreement) throws Exception;

    @Select("select * from agreement")
    public List<Agreement> getAllAggreement() throws Exception;

    @Select("select * from agreement where acompany = #{company} or bcompany = #{company}")
    public List<Agreement> getAllAggreementToUser(@Param("company") String company) throws Exception;

    @Update("update agreement set acompany = #{aCompany},bcompany = #{bCompany},transport = #{transport},price = #{price},time = #{time} where agreementid=#{agreementId}")
    public int modifyAgreementByAgreementId(Agreement agreement) throws Exception;

    @Update("update agreement set state = #{state},opinion = #{opinion} where agreementid=#{agreementId}")
    public int modifyAgreementStateByAgreementId(Agreement agreement) throws Exception;
}
