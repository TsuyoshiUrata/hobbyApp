package com.example.hobby.Entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-06-30T20:19:31.075+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _Member extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.hobby.Entity.Member> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final _Member __singleton = new _Member();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.hobby.Entity.Member>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.Member, ?>> __embeddedPropertyTypeMap;

    private _Member() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "Member";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __list = new java.util.ArrayList<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __map = new java.util.LinkedHashMap<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.Member, ?>> __embeddedMap = new java.util.LinkedHashMap<>(11);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.Member, ?>> __embeddedMap) {
        __map.put("memberCode", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberCode", "member_code", __namingType, false));
        __map.put("memberName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberName", "member_name", __namingType, true, true, false));
        __map.put("memberMail", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberMail", "member_mail", __namingType, true, true, false));
        __map.put("memberPhone", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberPhone", "phone_number", __namingType, true, true, false));
        __map.put("memberPost", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberPost", "postal_code", __namingType, true, true, false));
        __map.put("memberAddress", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberAddress", "address", __namingType, true, true, false));
        __map.put("memberBirth", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.time.LocalDate, java.time.LocalDate>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDate(), "memberBirth", "birth_date", __namingType, true, true, false));
        __map.put("memberJoin", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.time.LocalDate, java.time.LocalDate>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDate(), "memberJoin", "join_date", __namingType, true, true, false));
        __map.put("memberRank", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.Integer, java.lang.Integer>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofPrimitiveInt(), "memberRank", "member_rank", __namingType, true, true, false));
        __map.put("memberRole", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberRole", "member_role", __namingType, true, true, false));
        __map.put("memberPass", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.Member, java.lang.String, java.lang.String>(com.example.hobby.Entity.Member.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "memberPass", "password", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __idList) {
        __idList.add(__map.get("memberCode"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    @Deprecated
    public String getTableName() {
        return getTableName(org.seasar.doma.internal.jdbc.entity.TableNames.namingFunction);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.hobby.Entity.Member entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.hobby.Entity.Member> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.Member, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.Member, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.Member, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.Member, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.Member, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.Member, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.Member, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.hobby.Entity.Member newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.hobby.Entity.Member, ?>> __args) {
        com.example.hobby.Entity.Member entity = new com.example.hobby.Entity.Member();
        if (__args.get("memberCode") != null) __args.get("memberCode").save(entity);
        if (__args.get("memberName") != null) __args.get("memberName").save(entity);
        if (__args.get("memberMail") != null) __args.get("memberMail").save(entity);
        if (__args.get("memberPhone") != null) __args.get("memberPhone").save(entity);
        if (__args.get("memberPost") != null) __args.get("memberPost").save(entity);
        if (__args.get("memberAddress") != null) __args.get("memberAddress").save(entity);
        if (__args.get("memberBirth") != null) __args.get("memberBirth").save(entity);
        if (__args.get("memberJoin") != null) __args.get("memberJoin").save(entity);
        if (__args.get("memberRank") != null) __args.get("memberRank").save(entity);
        if (__args.get("memberRole") != null) __args.get("memberRole").save(entity);
        if (__args.get("memberPass") != null) __args.get("memberPass").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.hobby.Entity.Member> getEntityClass() {
        return com.example.hobby.Entity.Member.class;
    }

    @Override
    public com.example.hobby.Entity.Member getOriginalStates(com.example.hobby.Entity.Member __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.hobby.Entity.Member __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Member getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Member newInstance() {
        return new _Member();
    }

}
