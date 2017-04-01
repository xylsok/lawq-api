package longan.baoli.weiquan.api;

import longan.baoli.weiquan.model.User;

import java.util.List;

/**
 * Created by zhangzf on 17/3/30.
 */
public interface UserService {
    String userAdd(User user);

    List<User> getUsers();
}
