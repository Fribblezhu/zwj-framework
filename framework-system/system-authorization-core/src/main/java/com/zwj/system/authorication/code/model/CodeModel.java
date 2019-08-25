package com.zwj.system.authorication.code.model;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.model.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 3:29 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class CodeModel implements Model {

    private String id;

    private String name;

    private String code;

    private String description;

    private List<ComboBoxModel> codecList;
    
}
