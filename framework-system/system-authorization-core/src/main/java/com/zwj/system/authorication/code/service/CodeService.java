package com.zwj.system.authorication.code.service;

import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.repository.CodeRepository;
import com.zwj.system.authorication.code.service.interf.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 4:05 PM
 * @description:
 */
@Service
public class CodeService implements ICodeService {

    @Autowired
    private CodeRepository codeRepository;

    @Override
    public JpaRepository<CodeEntity, String> getRepository() {
        return codeRepository;
    }
}
