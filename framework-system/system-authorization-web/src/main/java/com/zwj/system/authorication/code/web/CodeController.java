package com.zwj.system.authorication.code.web;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.RequestPageDTO;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.controller.simple.GenericCURDController;
import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.model.CodeModel;
import com.zwj.system.authorication.code.service.CodeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.zwj.framework.common.controller.message.ResponseMessage.*;

/**
 * @author: zwj
 * @Date: 7/23/19
 * @Time: 8:50 PM
 * @description:
 */
@RestController
@RequestMapping(value = "code")
public class CodeController extends GenericCURDController<String, CodeEntity, CodeModel, CodeService> {

    public CodeController(CodeService service) {
        super(service);
    }


    @Authorize(permission = Permission.ACTION_QUERY)
    @PostMapping(value = "classify/{id:.+}")
    @ApiOperation(value = "根据实体类分页查找")
    private  ResponseMessage classify(@PathVariable(name = "id")String id , @RequestBody List<String> codecIds) {
        CodeModel entity = this.getService().classify(id, codecIds);
        if(entity != null) {
            return success(entity);
        } else {
            return error(404, "分类失败.");
        }
    }

}
