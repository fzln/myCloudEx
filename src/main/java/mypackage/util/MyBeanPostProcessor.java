package mypackage.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by f on 29.05.17.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

        @Override
        public Object postProcessAfterInitialization(Object object, String name) throws BeansException {
                System.err.println("postProcessAfterInitialization(): " + object);
                return object;
        }

        @Override
        public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
                return object;
        }

}