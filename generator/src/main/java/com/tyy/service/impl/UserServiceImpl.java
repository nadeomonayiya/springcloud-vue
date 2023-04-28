package com.tyy.service.impl;

import com.tyy.entity.User;
import com.tyy.mapper.UserMapper;
import com.tyy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tyy
 * @since 2023-04-28 02:15:23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
