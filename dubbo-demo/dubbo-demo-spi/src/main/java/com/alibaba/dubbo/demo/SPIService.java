package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * 用于测试@SPI的接口
 *
 * @author fomeiherz
 * @date 2020/2/23 10:07
 */
@SPI("impl")
//@SPI("impl2")
public interface SPIService {
    void hello();
}
