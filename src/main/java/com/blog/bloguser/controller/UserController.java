package com.blog.bloguser.controller;

import com.blog.base.userApi.api.UserApi;
import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.BaseResponse;
import com.blog.base.userApi.response.UserInfo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Override
    public BaseResponse<UserInfo> register(RegisterEntity registerEntity) {
        return null;
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
    public BaseResponse<UserInfo> login(LoginEntity loginEntity) {
        return null;
    }

    @Override
    public BaseResponse<UserInfo> getUserInfo(String s) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> updateUserInfo(UserInfoEntity userInfoEntity) {
        return null;
    }

    @Override
    public BaseResponse<Boolean> resetPwd(RestPwdEntity restPwdEntity) {
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
