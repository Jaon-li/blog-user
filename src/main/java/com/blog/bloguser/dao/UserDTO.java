package com.blog.bloguser.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.IDLType;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class UserDTO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String account;
    private String password;
    private String nick;
    private String phone;
    private String salt;
    private String active;
    private String last_ip;
    private Boolean pull_black;
    private Date create_time;
    private Date update_time;

}
