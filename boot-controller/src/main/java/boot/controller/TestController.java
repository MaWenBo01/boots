package boot.controller;

import boot.db.User;
import boot.service.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2019/1/10.
 */
@RestController

public class TestController {

   @Autowired
   private UserServices userServices;

    @RequestMapping(value = "test" ,method = RequestMethod.GET)
    public List<User> getTest()
    {
        List<User> list=userServices.getUsers();
        return list;
    }
}
