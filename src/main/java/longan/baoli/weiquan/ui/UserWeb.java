package longan.baoli.weiquan.ui;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import longan.baoli.weiquan.api.UserService;
import longan.baoli.weiquan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangzf on 17/3/30.
 */
@Api(value = "用户管理", description = "用户管理")
@RestController
@RequestMapping(value = "/user")
public class UserWeb {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户注册", notes = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String countDb(@RequestBody User user, HttpServletRequest request) {
        System.out.println(request);
        return userService.userAdd(user);
    }

}
