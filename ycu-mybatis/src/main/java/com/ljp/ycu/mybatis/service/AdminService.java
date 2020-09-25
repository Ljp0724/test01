package com.ljp.ycu.mybatis.service;

import com.ljp.ycu.mybatis.model.UmsAdmin;
import com.ljp.ycu.mybatis.result.Result;

public interface AdminService {
    /** 使用用户名和密码进行登录 */
    Result<UmsAdmin> login(UmsAdmin umsAdmin) ;

}
