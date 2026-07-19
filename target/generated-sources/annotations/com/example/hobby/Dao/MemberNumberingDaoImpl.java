package com.example.hobby.Dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-19T16:07:51.601+0900")
@org.seasar.doma.DaoImplementation
public class MemberNumberingDaoImpl implements com.example.hobby.Dao.MemberNumberingDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberNumberingDao.class, "selectMemberNumbering");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberNumberingDao.class, "updateMemberNumbering");

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public MemberNumberingDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public com.example.hobby.Entity.MemberNumbering selectMemberNumbering() {
        __support.entering("com.example.hobby.Dao.MemberNumberingDaoImpl", "selectMemberNumbering");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberNumberingDao/selectMemberNumbering.sql");
            __query.setEntityType(com.example.hobby.Entity._MemberNumbering.getSingletonInternal());
            __query.setCallerClassName("com.example.hobby.Dao.MemberNumberingDaoImpl");
            __query.setCallerMethodName("selectMemberNumbering");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.hobby.Entity.MemberNumbering> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.hobby.Entity.MemberNumbering>(com.example.hobby.Entity._MemberNumbering.getSingletonInternal()));
            com.example.hobby.Entity.MemberNumbering __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberNumberingDaoImpl", "selectMemberNumbering", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberNumberingDaoImpl", "selectMemberNumbering", __e);
            throw __e;
        }
    }

    @Override
    public int updateMemberNumbering() {
        __support.entering("com.example.hobby.Dao.MemberNumberingDaoImpl", "updateMemberNumbering");
        try {
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = __support.getQueryImplementors().createSqlFileUpdateQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberNumberingDao/updateMemberNumbering.sql");
            __query.setCallerClassName("com.example.hobby.Dao.MemberNumberingDaoImpl");
            __query.setCallerMethodName("updateMemberNumbering");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberNumberingDaoImpl", "updateMemberNumbering", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberNumberingDaoImpl", "updateMemberNumbering", __e);
            throw __e;
        }
    }

}
