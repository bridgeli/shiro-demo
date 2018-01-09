package cn.bridgeli.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

    /**
     * 配置哪些页面需要受保护.
     * 以及访问这些页面需要的权限.
     * anon 可以被匿名访问
     * authc 必须认证(即登录)后才可能访问的页面.
     * logout 登出.
     * roles 角色过滤器
     *
     * @return
     */
    public LinkedHashMap<String, String> buildFilterChainDefinitionMap() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("/login.jsp", "anon");
        map.put("/shiro/login", "anon");
        map.put("/shiro/logout", "logout");
        map.put("/user.jsp", "authc,roles[user]");
        map.put("/admin.jsp", "authc,roles[admin]");
        map.put("/list.jsp", "user");

        map.put("/**", "authc");

        return map;
    }

}
