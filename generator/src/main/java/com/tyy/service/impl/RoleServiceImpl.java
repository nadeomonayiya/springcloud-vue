package com.tyy.service.impl;

import com.tyy.entity.Role;
import com.tyy.mapper.RoleMapper;
import com.tyy.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author tyy
 * @since 2023-04-28 02:24:09
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
