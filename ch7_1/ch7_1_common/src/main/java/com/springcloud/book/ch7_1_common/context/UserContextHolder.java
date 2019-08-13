package com.springcloud.book.ch7_1_common.context;

import com.springcloud.book.ch7_1_common.vo.UserInfoModel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/13
 * @Time: 22:06
 * @email: inwsy@hotmail.com
 * Description: 用户上下文
 */
public class UserContextHolder {

    public static ThreadLocal<String> context = new ThreadLocal<String>();

    public static String get() {
        return context.get();
    }

    public static void set(String token) {
        context.set(token);
    }

    public static void shutdown() {
        context.remove();
    }
}
