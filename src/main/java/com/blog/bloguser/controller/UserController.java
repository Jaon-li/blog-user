package com.blog.bloguser.controller;

import com.blog.base.response.BaseResponse;
import com.blog.base.userApi.api.UserApi;
import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.UserInfo;
import com.blog.bloguser.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("用户注册")
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public BaseResponse<UserInfo> register(RegisterEntity registerEntity) {
        return BaseResponse.ok(userService.register(registerEntity));
    }

    @Override
    public BaseResponse<String> imgCode(String s) {
        return null;
    }

    @Override
    public BaseResponse<String> emailCode(String s) {
        return null;
    }

    @Override
    public BaseResponse<UserInfo> login(@RequestBody LoginEntity loginEntity) {
        return null;
    }

    @Override
    public BaseResponse<UserInfo> getUserInfo(String s) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> updateUserInfo(@RequestBody UserInfoEntity userInfoEntity) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> resetPwd(@RequestBody RestPwdEntity restPwdEntity) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> Logout(String s) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> DestroyUser(String s) {
        return null;
    }

}
