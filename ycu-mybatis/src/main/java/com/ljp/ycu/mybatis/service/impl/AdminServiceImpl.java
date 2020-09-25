package com.ljp.ycu.mybatis.service.impl;

import com.ljp.ycu.mybatis.dao.UmsAdminDao;
import com.ljp.ycu.mybatis.model.UmsAdmin;
import com.ljp.ycu.mybatis.result.CodeMsg;
import com.ljp.ycu.mybatis.result.Result;
import com.ljp.ycu.mybatis.service.AdminService;
import com.ljp.ycu.mybatis.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;



@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UmsAdminDao adminDao;

    @Override
    public Result<UmsAdmin> login(UmsAdmin umsAdmin) {
        UmsAdmin admin = this.adminDao.selectByUsernameAndPassword(umsAdmin);
        if(ObjectUtils.isEmpty(admin)) {
            return Result.error(CodeMsg.USERNAME_PASSWORD_ERROR);
        }
        String dbPwd= admin.getPassword();
        String saltDB= admin.getSalt();

        String calaPass = MD5Util.inputPassToDbPass(umsAdmin.getPassword(), saltDB);

        if(!StringUtils.equals(dbPwd,calaPass)){ // 密码不一致
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        // 返回的admin信息中不能有密码的信息，所以要将密码置空
        admin.setPassword(StringUtils.EMPTY);
        return Result.success(admin);
    }
}
