package id.my.hendisantika.springbootmybatissample2.mapper;

import id.my.hendisantika.springbootmybatissample2.model.TODO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mybatis-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/24/24
 * Time: 08:01
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface ToDoMapper {

    @Select("SELECT * FROM t_todo")
    List<TODO> findAll();

    @Select("SELECT * FROM t_todo WHERE id = #{id}")
    TODO findById(@Param("id") Long id);

    @Delete("DELETE FROM t_todo WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

    @Insert("INSERT INTO t_todo(id, title, body) " +
            " VALUES (#{id}, #{title}, #{body})")
    int createNew(TODO item);

    @Update("UPDATE tbl_todo SET title=#{title}, " +
            " body=#{body} WHERE id=#{id}")
    int update(TODO item);
}
