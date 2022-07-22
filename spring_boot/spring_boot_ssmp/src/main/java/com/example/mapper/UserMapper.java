package com.example.mapper;

import com.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author example
 * @since 2022-07-22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
