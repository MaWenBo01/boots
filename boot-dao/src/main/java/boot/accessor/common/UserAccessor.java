package boot.accessor.common;

import boot.db.User;
import boot.mapper.common.UserMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/1/14.
 */
@Slf4j
@Data
@Service
public class UserAccessor {
   @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(){
        List<User> list=new ArrayList<User>();
       /* User u1=new User();
        u1.setName("李");
        User u2=new User();
        u2.setName("张");
        User u3=new User();
        u3.setName("王");
        list.add(u1);
        list.add(u2);
        list.add(u3);*/
        list= userMapper.getUserList();
        //return userMapper.getUserList();
        return list;
    }


}
