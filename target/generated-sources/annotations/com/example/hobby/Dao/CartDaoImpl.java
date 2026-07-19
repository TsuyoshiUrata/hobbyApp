package com.example.hobby.Dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-19T17:16:44.964+0900")
@org.seasar.doma.DaoImplementation
public class CartDaoImpl implements com.example.hobby.Dao.CartDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.CartDao.class, "insertCart", com.example.hobby.Entity.Cart.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public CartDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public int insertCart(com.example.hobby.Entity.Cart cart) {
        __support.entering("com.example.hobby.Dao.CartDaoImpl", "insertCart", cart);
        try {
            if (cart == null) {
                throw new org.seasar.doma.DomaNullPointerException("cart");
            }
            org.seasar.doma.jdbc.query.SqlFileInsertQuery __query = __support.getQueryImplementors().createSqlFileInsertQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/CartDao/insertCart.sql");
            __query.addParameter("cart", com.example.hobby.Entity.Cart.class, cart);
            __query.setCallerClassName("com.example.hobby.Dao.CartDaoImpl");
            __query.setCallerMethodName("insertCart");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("cart", cart, com.example.hobby.Entity._Cart.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.CartDaoImpl", "insertCart", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.CartDaoImpl", "insertCart", __e);
            throw __e;
        }
    }

}
