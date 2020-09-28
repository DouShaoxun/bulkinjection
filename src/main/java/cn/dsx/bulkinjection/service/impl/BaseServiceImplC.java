package cn.dsx.bulkinjection.service.impl;

import cn.dsx.bulkinjection.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: Dsx
 * @Date: 2020-09-28 21:56
 * @Description: description
 */
@Service
@Slf4j
public class BaseServiceImplC implements BaseService {
    @Override
    public void fun() {
        log.info("C");
    }
}
