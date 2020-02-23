package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.ServiceLoaderInterface;

/**
 * ServiceLoaderInterface实现类
 *
 * @author fomeiherz
 * @date 2020/2/23 9:37
 */
public class ServiceLoaderInterfaceImpl implements ServiceLoaderInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello JDK SPI.");
    }
}
