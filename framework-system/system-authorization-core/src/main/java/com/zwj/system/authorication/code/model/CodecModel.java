package com.zwj.system.authorication.code.model;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.model.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author: zwj
 * @Date: 8/2/19
 * @Time: 1:45 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class CodecModel implements Model {
    private String id;

    private String name;

    private String code;

    private String description;

    private String systemId;

    private List<ComboBoxModel> codeList;
}
