package com.example.hobby.Dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-12T19:20:31.780+0900")
@org.seasar.doma.DaoImplementation
public class MemberDaoImpl implements com.example.hobby.Dao.MemberDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "resistMemberComplete", com.example.hobby.Entity.Member.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "selectMemberByMail", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "selectMemberByMemberCode", java.lang.String.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "selectAllMemberByRole", java.lang.String.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "updateMember", com.example.hobby.Entity.Member.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.hobby.Dao.MemberDao.class, "selectMemberByBirth", java.time.LocalDate.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public MemberDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public int resistMemberComplete(com.example.hobby.Entity.Member member) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "resistMemberComplete", member);
        try {
            if (member == null) {
                throw new org.seasar.doma.DomaNullPointerException("member");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.hobby.Entity.Member> __query = __support.getQueryImplementors().createAutoInsertQuery(__method0, com.example.hobby.Entity._Member.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setEntity(member);
            __query.setDuplicateKeyType(org.seasar.doma.jdbc.query.DuplicateKeyType.EXCEPTION);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("resistMemberComplete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "resistMemberComplete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "resistMemberComplete", __e);
            throw __e;
        }
    }

    @Override
    public com.example.hobby.Entity.Member selectMemberByMail(java.lang.String memberMail) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMail", memberMail);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberDao/selectMemberByMail.sql");
            __query.setEntityType(com.example.hobby.Entity._Member.getSingletonInternal());
            __query.addParameter("memberMail", java.lang.String.class, memberMail);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("selectMemberByMail");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.hobby.Entity.Member> __command = __support.getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.hobby.Entity.Member>(com.example.hobby.Entity._Member.getSingletonInternal()));
            com.example.hobby.Entity.Member __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMail", __e);
            throw __e;
        }
    }

    @Override
    public com.example.hobby.Entity.Member selectMemberByMemberCode(java.lang.String memberCode) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMemberCode", memberCode);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberDao/selectMemberByMemberCode.sql");
            __query.setEntityType(com.example.hobby.Entity._Member.getSingletonInternal());
            __query.addParameter("memberCode", java.lang.String.class, memberCode);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("selectMemberByMemberCode");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.hobby.Entity.Member> __command = __support.getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.hobby.Entity.Member>(com.example.hobby.Entity._Member.getSingletonInternal()));
            com.example.hobby.Entity.Member __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMemberCode", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByMemberCode", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.hobby.Entity.Member> selectAllMemberByRole(java.lang.String memberRole) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "selectAllMemberByRole", memberRole);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberDao/selectAllMemberByRole.sql");
            __query.setEntityType(com.example.hobby.Entity._Member.getSingletonInternal());
            __query.addParameter("memberRole", java.lang.String.class, memberRole);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("selectAllMemberByRole");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.hobby.Entity.Member>> __command = __support.getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.hobby.Entity.Member>(com.example.hobby.Entity._Member.getSingletonInternal()));
            java.util.List<com.example.hobby.Entity.Member> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "selectAllMemberByRole", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "selectAllMemberByRole", __e);
            throw __e;
        }
    }

    @Override
    public int updateMember(com.example.hobby.Entity.Member member) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "updateMember", member);
        try {
            if (member == null) {
                throw new org.seasar.doma.DomaNullPointerException("member");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.example.hobby.Entity.Member> __query = __support.getQueryImplementors().createAutoUpdateQuery(__method4, com.example.hobby.Entity._Member.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__support.getConfig());
            __query.setEntity(member);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("updateMember");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(true);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "updateMember", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "updateMember", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.hobby.Entity.Member> selectMemberByBirth(java.time.LocalDate birthDate) {
        __support.entering("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByBirth", birthDate);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method5);
            __query.setMethod(__method5);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/hobby/Dao/MemberDao/selectMemberByBirth.sql");
            __query.setEntityType(com.example.hobby.Entity._Member.getSingletonInternal());
            __query.addParameter("birthDate", java.time.LocalDate.class, birthDate);
            __query.setCallerClassName("com.example.hobby.Dao.MemberDaoImpl");
            __query.setCallerMethodName("selectMemberByBirth");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.hobby.Entity.Member>> __command = __support.getCommandImplementors().createSelectCommand(__method5, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.hobby.Entity.Member>(com.example.hobby.Entity._Member.getSingletonInternal()));
            java.util.List<com.example.hobby.Entity.Member> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByBirth", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.hobby.Dao.MemberDaoImpl", "selectMemberByBirth", __e);
            throw __e;
        }
    }

}
