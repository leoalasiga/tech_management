package com.als.management.base;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 公用基础类
 *
 * @author 刘嘉杰
 * @version 1.0.0
 * @date 2020-12-14 22:49
 */
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2692089571296506891L;

    /**
     * id
     */
    private Long id;

    /**
     * 更新时间
     */
    private LocalDate updateTime;

    /**
     * 删除标志 0删除 1未删除
     */
    private Integer isDelete;

    /**
     * 版本号
     */
    private Integer version;
}
