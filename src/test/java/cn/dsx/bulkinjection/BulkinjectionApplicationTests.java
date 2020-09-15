package cn.dsx.bulkinjection;

import cn.dsx.bulkinjection.bean.BasisBean;
import cn.dsx.bulkinjection.bean.ChildrenABean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class BulkinjectionApplicationTests {

    @Autowired
    private BasisBean basisBean;

    // 批量注入  BasisBean下的子类会注入进去
    @Autowired
    private Map<String, BasisBean> basisBeanMap = new HashMap<>();

    @Autowired
    private Map<String, ChildrenABean> childrenABeanMap = new HashMap<>();

    @Test
    void contextLoads() {
        System.out.println(basisBean);
        System.out.println(basisBeanMap.size());
        System.out.println(childrenABeanMap.size());
    }

}
