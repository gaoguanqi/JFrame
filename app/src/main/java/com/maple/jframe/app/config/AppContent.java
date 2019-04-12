package com.maple.jframe.app.config;

/**
 * author: gaogq
 * time: 2018/12/14 17:21
 * description:
 */
public interface AppContent {
    /**
     * 需要以键值对持久化到SharePerference文件中的Key常量值
     */
    class SaveInfoKey {
        public static final String HASWECLOME = "hasWeclome";
        public static final String HASLOGIN = "hasLogin";
    }

    /**
     * Bundle中需要作为Key传递的常量EXTRA开头
     */
    class BundleKey {
        /**
         * 进入AccountActivity界面必须要传入的参数
         */
        public static final String EXTRA_EMAIL = "email";
        public static final String EXTRA_TYPE = "type";
        public static final String EXTRA_ID = "id";


    }

    class GlobalValue {

        //解锁钱包成功后告诉上一个界面
        public static final int TAG_UNPDAE = 1;
        public static final int TAG_RETURN = 2;


    }

    /**
     * 存放参与API请求的常量
     */
    class ApiParams {

        //中文
        public static String LANGUAGE_CN = "cn";
        //英文
        public static String LANGUAGE_EN = "en";


    }

    class WebPageUrl {
        private static final String LOAN_PREFIX = "";

        //立即借款
        public static final String LOAN_BORROW = LOAN_PREFIX + "/#/Borrow";

    }
}
