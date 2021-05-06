package com.blog.bloguser.service;

import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

  public UserInfo register(RegisterEntity registerEntity);

  public String imgCode(String s);

  public String emailCode(String s);

  public UserInfo login(@RequestBody LoginEntity loginEntity);

  public UserInfo getUserInfo(String s);

  public Boolean updateUserInfo(@RequestBody UserInfoEntity userInfoEntity);

  public Boolean resetPwd(@RequestBody RestPwdEntity restPwdEntity);

  public Boolean Logout(String s);

  public Boolean DestroyUser(String s);

}
