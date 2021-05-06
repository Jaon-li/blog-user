package com.blog.bloguser.service.impl;

import com.blog.base.emailApi.api.EmailApi;
import com.blog.base.emailApi.req.EmailContentEntity;
import com.blog.base.response.BaseResponse;
import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.UserInfo;
import com.blog.bloguser.dao.UserDTO;
import com.blog.bloguser.mapper.UserMapper;
import com.blog.bloguser.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private EmailApi emailApi;

    /**
     * 用户注册
     *
     * @param registerEntity
     * @return
     */
    @Override
    public UserInfo register(RegisterEntity registerEntity) {


        UserDTO userDTO = new UserDTO();
        userMapper.insert(userDTO);


        return null;
    }

    /**
     * 获取验证码
     *
     * @param s
     * @return
     */
    @Override
    public String imgCode(String s) {
        return null;
    }

    /**
     * 邮箱验证码
     *
     * @param email
     * @return
     */
    @Override
    public String emailCode(String email) {
        EmailContentEntity emailContentEntity = new EmailContentEntity();
        emailContentEntity.setEmails(new ArrayList<String>() {{
            add("zerofire.li@qq.con");
        }});
        emailContentEntity.setTitle("测试验证码");
        emailContentEntity.setContent("内容就是没有内容");
        emailContentEntity.setEnclosureList(null);
//        BaseResponse<Boolean> send = emailApi.send(emailContentEntity);
//        log.info("fanhiu:{}", send);
        return null;
    }

    /**
     * 用户登录接口
     *
     * @param loginEntity
     * @return
     */
    @Override
    public UserInfo login(LoginEntity loginEntity) {
        return null;
    }

    /**
     * 获取用户信息
     *
     * @param s
     * @return
     */
    @Override
    public UserInfo getUserInfo(String s) {
        return null;
    }

    /**
     * 更新用户信息
     *
     * @param userInfoEntity
     * @return
     */
    @Override
    public Boolean updateUserInfo(UserInfoEntity userInfoEntity) {
        return null;
    }

    /**
     * 重置密码
     *
     * @param restPwdEntity
     * @return
     */
    @Override
    public Boolean resetPwd(RestPwdEntity restPwdEntity) {
        return null;
    }

    /**
     * 退出登录
     *
     * @param s
     * @return
     */
    @Override
    public Boolean Logout(String s) {
        return null;
    }

    /**
     * 用户注销
     *
     * @param s
     * @return
     */
    @Override
    public Boolean DestroyUser(String s) {
        return null;
    }
}
