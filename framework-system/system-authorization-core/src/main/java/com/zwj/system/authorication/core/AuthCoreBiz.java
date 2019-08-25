package com.zwj.system.authorication.core;

import com.zwj.system.authorication.core.interf.IAuthCoreBiz;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/24/19
 * @Time: 7:04 PM
 * @description:
 */
@Service
public class AuthCoreBiz  implements IAuthCoreBiz {

//
//    @Autowired
//    private IUserService userService;
//
//    @Autowired
//    private IAccountService accountService;
//
//    @Autowired
//    private IOrganizationClassificationService organizationCalssificationService;
//
//    @Override
//    public boolean checkAccountUnique(String loginName) {
//        return userService.checkLoginNameValid(loginName);
//    }
//
//    @Override
//    public AccountEntity createAccount(String name, String loginName, String password, String phone, String email,
//                                       String tenantId, boolean isSuperAdmin, String creatorId) {
//        return accountService.create(name, loginName, password, phone, email, tenantId, isSuperAdmin, creatorId);
//    }
//
//    @Override
//    public OrganizationClassificationEntity createOrganizationClassification(String parentId, String name, String code,
//                                                                                   Integer status, Integer approvalStatus) {
//        return this.organizationCalssificationService.create(parentId, name, code, status, approvalStatus);
//    }
//
//    @Override
//    public AccountEntity updateAccount(AccountEntity accountEntity, String creatorId) {
//        return this.accountService.update(accountEntity, creatorId);
//    }
}
