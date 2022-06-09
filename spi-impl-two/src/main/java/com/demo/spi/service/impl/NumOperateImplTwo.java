package com.demo.spi.service.impl;

import com.demo.spi.service.INumOperate;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2022/6/9 9:57
 */
public class NumOperateImplTwo implements INumOperate {
    @Override
    public int exec(int num1, int num2) {
        return num1 - num2;
    }
}
