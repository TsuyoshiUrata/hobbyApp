package com.example.hobby.Dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-12T21:58:15.617+0900")
@org.seasar.doma.DaoImplementation
public class ProductDaoImpl implements com.example.hobby.Dao.ProductDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.ProductDao.class, "productList");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.ProductDao.class, "productDetail", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.ProductDao.class, "searchProductList", java.lang.String.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ProductDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.List<com.example.hobby.Entity.ProductComposit> productList() {
        __support.entering("com.example.hobby.Dao.ProductDaoImpl", "productList");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/ProductDao/productList.sql");
            __query.setEntityType(com.example.hobby.Entity._ProductComposit.getSingletonInternal());
            __query.setCallerClassName("com.example.hobby.Dao.ProductDaoImpl");
            __query.setCallerMethodName("productList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.hobby.Entity.ProductComposit>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.hobby.Entity.ProductComposit>(com.example.hobby.Entity._ProductComposit.getSingletonInternal()));
            java.util.List<com.example.hobby.Entity.ProductComposit> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.ProductDaoImpl", "productList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.ProductDaoImpl", "productList", __e);
            throw __e;
        }
    }

    @Override
    public com.example.hobby.Entity.ProductComposit productDetail(java.lang.String productId) {
        __support.entering("com.example.hobby.Dao.ProductDaoImpl", "productDetail", productId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/ProductDao/productDetail.sql");
            __query.setEntityType(com.example.hobby.Entity._ProductComposit.getSingletonInternal());
            __query.addParameter("productId", java.lang.String.class, productId);
            __query.setCallerClassName("com.example.hobby.Dao.ProductDaoImpl");
            __query.setCallerMethodName("productDetail");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.hobby.Entity.ProductComposit> __command = __support.getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.hobby.Entity.ProductComposit>(com.example.hobby.Entity._ProductComposit.getSingletonInternal()));
            com.example.hobby.Entity.ProductComposit __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.ProductDaoImpl", "productDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.ProductDaoImpl", "productDetail", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.hobby.Entity.ProductComposit> searchProductList(java.lang.String productName) {
        __support.entering("com.example.hobby.Dao.ProductDaoImpl", "searchProductList", productName);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/ProductDao/searchProductList.sql");
            __query.setEntityType(com.example.hobby.Entity._ProductComposit.getSingletonInternal());
            __query.addParameter("productName", java.lang.String.class, productName);
            __query.setCallerClassName("com.example.hobby.Dao.ProductDaoImpl");
            __query.setCallerMethodName("searchProductList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.hobby.Entity.ProductComposit>> __command = __support.getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.hobby.Entity.ProductComposit>(com.example.hobby.Entity._ProductComposit.getSingletonInternal()));
            java.util.List<com.example.hobby.Entity.ProductComposit> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.ProductDaoImpl", "searchProductList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.ProductDaoImpl", "searchProductList", __e);
            throw __e;
        }
    }

}
