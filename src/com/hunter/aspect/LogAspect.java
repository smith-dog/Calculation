package com.hunter.aspect;

import java.util.Date;

/**
 * Created by Travelsky on 2017/8/9.
 */
public class LogAspect {
        //节点的时间
        private long beforeTime;

        public void beforeMethod() {
            Date date = new Date();
            beforeTime = date.getTime();
            System.out.print("use time :" + (beforeTime));
        }

        public void afterMethod() {
            Date date = new Date();
            System.out.print("use time :" + (date.getTime() - beforeTime));
        }

        public void afterReturning() {
            System.out.print("use time :" + (beforeTime));
        }

        public void afterThrowing() {
            System.out.print("use time :" + (beforeTime));
        }

}
