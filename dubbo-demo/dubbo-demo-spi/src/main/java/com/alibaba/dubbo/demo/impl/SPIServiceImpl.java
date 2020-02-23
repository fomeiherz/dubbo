package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.SPIService;

/**
 * SPIService第1个实现类
 *
 * @author fomeiherz
 * @date 2020/2/23 10:08
 */
public class SPIServiceImpl implements SPIService {
    @Override
    public void hello() {
        System.out.println("SPIServiceImpl: Hello dubbo SPI.");
    }
}
