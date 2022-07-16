package org.example.dao;

import java.util.List;
import org.example.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

public interface AccountDao {
    @Insert("insert into accounts(name,money)values(#{name},#{money})")
    void save(Account account);
    @Delete("delete from accounts where id = #{id} ")
    void delete(Integer id);

    @Update("update accounts set name = #{name} , money = #{money} where id = #{id} ")
    void update(Account account);

    @Select("select * from accounts")
    List<Account> findAll();

    @Select("select * from accounts where id = #{id} ")
    Account findById(Integer id);

}
