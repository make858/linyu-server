package com.cershy.linyuserver.service;

import com.cershy.linyuserver.entity.UserSet;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户设置表 服务类
 * </p>
 *
 * @author heath
 * @since 2024-07-16
 */
public interface UserSetService extends IService<UserSet> {

    UserSet getUserSet(String userId);
}
