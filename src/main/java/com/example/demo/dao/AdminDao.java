package com.example.demo.dao;
import com.example.demo.entity.Admin;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface AdminDao {
    @Insert("insert into admin (adminname,password,role) values (#{adminName},#{password},#{role})")
    public int regist(Admin admin) throws Exception;

    @Update("update admin set password=#{password} where adminId=#{adminId}")
    public int modifyPasswordByAdminId(Admin admin) throws Exception;

    @Select("select * from admin where adminname=#{adminName} and password=#{password}")
   //@Select("select * from admin where adminId=#{adminId}")
    public Admin login(Admin admin) throws Exception;

    @Select("select * from admin")
    public List<Admin> getAllAdmin() throws Exception;

    @Select("select * from admin where adminid=#{adminId}")
    public Admin getAdmin(Admin admin) throws Exception;

}
