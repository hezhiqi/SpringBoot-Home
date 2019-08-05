package cn.van.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Copyright (C), 2015-2019, 风尘博客
 * 公众号 : 风尘博客
 * FileName: User
 *
 * @author: Van
 * Date:     2019-04-05 16:06
 * Description: ${DESCRIPTION}
 * Version： V1.0
 */
@Data
@ApiModel(value = "用户信息对象", description = "姓名、性别、年龄")
public class User {
    @ApiModelProperty(value = "主键id")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户性别")
    private String sex;
    @ApiModelProperty(value = "用户年龄")
    private int age;
}
