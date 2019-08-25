package kd.liming.mall.user.mapper;

import kd.liming.mall.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
	@Select("select * from ums_member")
	List<User> selectAll();
}
