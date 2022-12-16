package org.susamlu.springweb.component;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author Sam Lu
 * @date 2022/12/12
 */
@Component
public class OrderBean extends BaseOrderBean implements Ordered {

    @Override
    public int getOrder() {
        return 1;
    }

}