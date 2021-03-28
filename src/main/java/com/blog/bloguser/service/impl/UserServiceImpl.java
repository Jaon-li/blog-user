package com.blog.bloguser.service.impl;

import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.BaseResponse;
import com.blog.base.userApi.response.UserInfo;
import com.blog.bloguser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  /**
   * 用户注册
   *
   * @param registerEntity
   * @return
   */
  @Override
  public BaseResponse<UserInfo> register(RegisterEntity registerEntity) {
    String email = registerEntity.getEmail();

    return null;
  }

  /**
   * 获取验证码
   *
   * @param s
   * @return
   */
  @Override
  public BaseResponse<String> imgCode(String s) {
    return null;
  }

  /**
   * 邮箱验证码
   *
   * @param email
   * @return
   */
  @Override
  public BaseResponse<String> emailCode(String email) {
    return null;
  }

  /**
   * 用户登录接口
   *
   * @param loginEntity
   * @return
   */
  @Override
  public BaseResponse<UserInfo> login(LoginEntity loginEntity) {
    return null;
  }

  /**
   * 获取用户信息
   *
   * @param s
   * @return
   */
  @Override
  public BaseResponse<UserInfo> getUserInfo(String s) {
    return null;
  }

  /**
   * 更新用户信息
   *
   * @param userInfoEntity
   * @return
   */
  @Override
  public BaseResponse<Boolean> updateUserInfo(UserInfoEntity userInfoEntity) {
    return null;
  }

  /**
   * 重置密码
   *
   * @param restPwdEntity
   * @return
   */
  @Override
  public BaseResponse<Boolean> resetPwd(RestPwdEntity restPwdEntity) {
    return null;
  }

  /**
   * 退出登录
   *
   * @param s
   * @return
   */
  @Override
  public BaseResponse<Boolean> Logout(String s) {
    return null;
  }

  /**
   * 用户注销
   *
   * @param s
   * @return
   */
  @Override
  public BaseResponse<Boolean> DestroyUser(String s) {
    return null;
  }
}
