package boot.service.services.imp;


import boot.accessor.common.UserAccessor;
import boot.db.User;
import boot.service.services.UserServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/1/10.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServices")
public class UserServiceImp implements UserServices {
    @Autowired
    private UserAccessor userAccessor;
     @Override
    public List<User> getUsers() {
        List<User> list=userAccessor.getUserList();
        return list;
    }


}
