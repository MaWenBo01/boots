package boot.service.services;

import boot.db.User;

import java.util.List;

/**
 * Created by admin on 2019/1/10.
 */
public interface UserServices {

    List<User> getUsers();
}
