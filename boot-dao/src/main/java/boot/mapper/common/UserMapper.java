package boot.mapper.common;

import boot.db.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by admin on 2019/1/14.
 */
@Mapper
public interface UserMapper
//        extends Mapper<User>,MySqlMapper <User>
{

    List<User> getUserList();
}
