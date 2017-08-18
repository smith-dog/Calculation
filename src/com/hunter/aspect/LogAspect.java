package com.hunter.aspect;

import java.util.Date;

/**
 * Created by Travelsky on 2017/8/9.
 */
public class LogAspect {
        //节点的时间
        private long beforeTime;

        public void beforeMethod() {
            beforeTime = System.currentTimeMillis();
            //System.out.println("before time :" + (beforeTime));
        }

        public void afterMethod() {
            System.out.println("use time :" + (System.currentTimeMillis() - beforeTime));
        }

        public void afterReturning() {
            //System.out.print("use time :" + (beforeTime));
        }

        public void afterThrowing() {
            //System.out.print("use time :" + (beforeTime));
        }

}
