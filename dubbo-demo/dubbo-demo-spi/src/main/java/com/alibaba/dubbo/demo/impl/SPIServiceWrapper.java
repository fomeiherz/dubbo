package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.SPIService;

/**
 * Wrapper实现：Dubbo会自动封装
 *
 * @author fomeiherz
 * @date 2020/2/23 12:36
 */
public class SPIServiceWrapper implements SPIService {
    
    private SPIService spiService;
    
    public SPIServiceWrapper(SPIService spiService) {
        this.spiService = spiService;
    }

    @Override
    public void hello() {
        System.out.println("SPI service wrapper begin.");
        spiService.hello();
        System.out.println("SPI service wrapper end.");
    }
}
