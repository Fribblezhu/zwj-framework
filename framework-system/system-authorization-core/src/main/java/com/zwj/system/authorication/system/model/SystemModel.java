package com.zwj.system.authorication.system.model;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.model.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zwj
 * @Date: 7/12/19
 * @Time: 4:23 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class SystemModel implements Model {
    private String id;

    private String name;

    private long sortIndex;

    private String path;

    private int level;

    private String code;

    private List<ComboBoxModel> children = new ArrayList<>();
}
