package com.demo.cn.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: ZPT
 * @Description:    返回信息实体类
 * @Date: 2019-11-12 17:03
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BackMessage {

        //0表示成功;-1表示失败
        private int status;
        //向前端返回的内容
        private String massage;

}
