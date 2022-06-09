package com.demo.spi.service.impl;

import com.demo.spi.service.INumOperate;

/**
 * @Description: 厂商一对spi接口的实现
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2022/6/9 9:53
 */
public class NumOperateImplOne implements INumOperate {
    @Override
    public int exec(int num1, int num2) {
        return num1 + num2;
    }
}
