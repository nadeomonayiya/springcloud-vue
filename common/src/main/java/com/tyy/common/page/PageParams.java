package com.tyy.common.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description 分页查询通用参数
 * @author Mr.M
 * @date 2022/9/6 14:02
 * @version 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {

    //当前页码
    private Long pageNo = 1L;

    //每页记录数默认值
    private Long pageSize =10L;



}
