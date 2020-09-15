package cn.dsx.bulkinjection.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author DouShaoxun
 * @Date 2020-09-15 20:01
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChildrenBBean extends BasisBean{
    private String b;
}
