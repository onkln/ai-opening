package ap.users.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 开发者用户表
 * @TableName ai_developer
 */
@TableName(value ="ai_developer")
@Data
public class AiDeveloper {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 加密密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 真实姓名/企业名称
     */
    @TableField(value = "real_name")
    private String real_name;

    /**
     * 资质审核 0待审核 1通过 2驳回
     */
    @TableField(value = "auth_status")
    private Integer auth_status;

    /**
     * 账户余额
     */
    @TableField(value = "balance")
    private BigDecimal balance;

    /**
     * 账号状态 0禁用 1正常
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 逻辑删除 0未删 1已删
     */
    @TableField(value = "deleted")
    private Integer deleted;
}