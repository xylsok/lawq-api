package longan.baoli.weiquan.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangzf on 17/3/30.
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer role;
    private String phone;
    private Integer louNo;
    private Integer unitNo;
    private Integer floorNo;
    private Integer houseNo;
    private String agreementPaht;
    private String headPortaitPath;
    private Integer reviewStatus;
    private Date    createTime;
}
