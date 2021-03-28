package com.blog.bloguser.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;// int          null,
  private String account;// varchar(255) null,
  private String password;// varchar(255) null,
  private String nick;// varchar(255) null,
  private String phone;// varchar(255) null
  private String salt;
  private Boolean active;
  private String last_ip;
  private Boolean pull_black;
  private Date create_time;
  private Date update_time;
}
