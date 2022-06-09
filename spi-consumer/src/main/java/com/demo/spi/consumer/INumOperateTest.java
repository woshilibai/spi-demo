package com.demo.spi.consumer;

import com.demo.spi.service.INumOperate;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description: spi接口消费端示例
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2022/6/9 10:04
 */
public class INumOperateTest {

    public static void main(String[] args) {
        //  SPI机制，查找所有实现类，顺序执行
        ServiceLoader<INumOperate> numOperates = ServiceLoader.load(INumOperate.class);
        Iterator<INumOperate> iterator = numOperates.iterator();
        if (iterator.hasNext()){
            INumOperate numOperate = iterator.next();
            System.out.println("执行SPI接口方法：" + numOperate.exec(3, 2));
        } else {
            throw new RuntimeException("classpath中未找到SPI接口com.demo.spi.service.INumOperate的实现类");
        }
    }
}
