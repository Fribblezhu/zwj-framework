package com.zwj.system.authorication.user.repository;

import com.zwj.system.authorication.user.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zwj
 * @Date: 6/26/19
 * @Time: 5:33 PM
 * @description:
 */
public interface AccountRepository extends JpaRepository<AccountEntity, String> {

    AccountEntity findOneByLoginName(String loginName);

}
