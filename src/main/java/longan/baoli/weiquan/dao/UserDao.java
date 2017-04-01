package longan.baoli.weiquan.dao;

import longan.baoli.weiquan.JooqDao;
import longan.baoli.weiquan.model.User;
import net.gddata.lawq.tables.records.UserRecord;
import org.jooq.Result;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static net.gddata.lawq.Tables.USER;

/**
 * Created by zhangzf on 17/3/30.
 */
@Component
public class UserDao extends JooqDao<UserRecord,User,Integer> {
    protected UserDao() {
        super(USER, User.class);
    }

    @Override
    protected Integer getId(User user) {
        return user.getId();
    }

    public List<User> getUser() {
        Result<UserRecord> fetch = create().selectFrom(USER).fetch();
        return null!=fetch?fetch.into(User.class):new ArrayList<>();
    }
}
