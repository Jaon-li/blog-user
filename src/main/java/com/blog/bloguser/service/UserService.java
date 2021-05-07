package com.blog.bloguser.service;

import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

    UserInfo register(RegisterEntity registerEntity);

    String imgCode(String s);

    String emailCode(String email);

    UserInfo login(@RequestBody LoginEntity loginEntity);

    UserInfo getUserInfo(String s);

    Boolean updateUserInfo(@RequestBody UserInfoEntity userInfoEntity);

    Boolean resetPwd(@RequestBody RestPwdEntity restPwdEntity);

    Boolean Logout(String s);

    Boolean DestroyUser(String s);

}
