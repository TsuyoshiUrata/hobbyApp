package com.example.hobby.Dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-19T16:08:59.512+0900")
@org.seasar.doma.DaoImplementation
public class OrderInfoDaoImpl implements com.example.hobby.Dao.OrderInfoDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.OrderInfoDao.class, "insertOrderInfo", com.example.hobby.Entity.OrderInfo.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public OrderInfoDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public int insertOrderInfo(com.example.hobby.Entity.OrderInfo orderInfo) {
        __support.entering("com.example.hobby.Dao.OrderInfoDaoImpl", "insertOrderInfo", orderInfo);
        try {
            if (orderInfo == null) {
                throw new org.seasar.doma.DomaNullPointerException("orderInfo");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.hobby.Entity.OrderInfo> __query = __support.getQueryImplementors().createAutoInsertQuery(__method0, com.example.hobby.Entity._OrderInfo.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setEntity(orderInfo);
            __query.setDuplicateKeyType(org.seasar.doma.jdbc.query.DuplicateKeyType.EXCEPTION);
            __query.setCallerClassName("com.example.hobby.Dao.OrderInfoDaoImpl");
            __query.setCallerMethodName("insertOrderInfo");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.OrderInfoDaoImpl", "insertOrderInfo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.OrderInfoDaoImpl", "insertOrderInfo", __e);
            throw __e;
        }
    }

}
