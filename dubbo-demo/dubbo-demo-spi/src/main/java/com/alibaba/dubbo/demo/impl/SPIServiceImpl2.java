package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.SPIService;

/**
 * SPIService第2个实现类
 *
 * @author fomeiherz
 * @date 2020/2/23 10:08
 */
public class SPIServiceImpl2 implements SPIService {
    @Override
    public void hello() {
        System.out.println("SPIServiceImpl2: Hello dubbo SPI.");
    }
}
