package com.alibaba.dubbo.demo;

import java.util.ServiceLoader;

/**
 * ServiceLoader测试类
 *
 * @author fomeiherz
 * @date 2020/2/23 9:39
 */
public class ServiceLoaderMain {

    public static void main(String[] args) {
        ServiceLoader<ServiceLoaderInterface> printServices = ServiceLoader.load(ServiceLoaderInterface.class);
        for (ServiceLoaderInterface service : printServices) {
            service.sayHello();
        }
    }

}
