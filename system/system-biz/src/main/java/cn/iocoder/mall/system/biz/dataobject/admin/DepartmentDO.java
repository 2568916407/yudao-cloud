package cn.iocoder.mall.system.biz.dataobject.admin;

import cn.iocoder.mall.mybatis.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 部门实体
 */
@TableName(value = "department")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DepartmentDO extends DeletableDO {

    /**
     * 部门编号
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 排序值
     */
    private Integer sort;
    /**
     * 父级部门编号
     */
    private Integer pid;

}