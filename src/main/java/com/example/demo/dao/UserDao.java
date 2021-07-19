package com.example.demo.dao;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//sgq
@Mapper
public interface UserDao {

    @Insert("insert into users (username,password) values (#{userName},#{password})")
    public int regist(Users user) throws Exception;

    @Select("select * from users where username=#{userName} and password=#{password}")
    public Users login(Users user) throws Exception;

    @Update("update users set password=#{password} where userid=#{userid}")
    public int modifyPasswordByUserid(Users user) throws Exception;

    @Select("select * from users")
    public List<Users> getAllUsers(Integer pageNum,Integer maxPage) throws Exception;

    @Update("update users set state=#{state} where userid=#{userid}")
    public int modifyUserStateByUserid(Users user) throws Exception;

    @Select("select * from users where userid=#{userid}")
    public Users getUserByUserid(Users user) throws Exception;

}