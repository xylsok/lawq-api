package longan.baoli.weiquan.service;

import longan.baoli.weiquan.api.UserService;
import longan.baoli.weiquan.dao.UserDao;
import longan.baoli.weiquan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangzf on 17/3/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public String userAdd(User user) {
        try {
            user.setCreateTime(new Date());
            userDao.save(user);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUser();
    }
}
