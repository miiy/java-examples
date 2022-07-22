package com.example.mapper;

import com.example.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author example
 * @since 2022-07-22
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
