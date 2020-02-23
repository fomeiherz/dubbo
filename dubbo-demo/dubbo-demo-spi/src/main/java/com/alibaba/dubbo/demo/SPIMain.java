package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * SPI的测试类
 *
 * @author fomeiherz
 * @date 2020/2/23 9:39
 */
public class SPIMain {

    public static void main(String[] args) {
        // 创建ExtensionLoader类
        SPIService spiService = ExtensionLoader.getExtensionLoader(SPIService.class).getDefaultExtension();
        // 获取其他实现
        //SPIService spiService = ExtensionLoader.getExtensionLoader(SPIService.class).getExtension("impl2");
        spiService.hello();
    }

}
