package com.blog.bloguser.service;

import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.BaseResponse;
import com.blog.base.userApi.response.UserInfo;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

  public BaseResponse<UserInfo> register(RegisterEntity registerEntity);

  public BaseResponse<String> imgCode(String s);

  public BaseResponse<String> emailCode(String s);

  public BaseResponse<UserInfo> login(@RequestBody LoginEntity loginEntity);

  public BaseResponse<UserInfo> getUserInfo(String s);

  public BaseResponse<Boolean> updateUserInfo(@RequestBody UserInfoEntity userInfoEntity);

  public BaseResponse<Boolean> resetPwd(@RequestBody RestPwdEntity restPwdEntity);

  public BaseResponse<Boolean> Logout(String s);

  public BaseResponse<Boolean> DestroyUser(String s);

}
