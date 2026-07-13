package com.example.hobby.Entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-12T19:19:54.248+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _MemberNumbering extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.hobby.Entity.MemberNumbering> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final _MemberNumbering __singleton = new _MemberNumbering();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.hobby.Entity.MemberNumbering>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __embeddedPropertyTypeMap;

    private _MemberNumbering() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "MemberNumbering";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __list = new java.util.ArrayList<>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __map = new java.util.LinkedHashMap<>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __embeddedMap = new java.util.LinkedHashMap<>(1);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __embeddedMap) {
        __map.put("memberNumbering", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.hobby.Entity.MemberNumbering, java.lang.Integer, java.lang.Integer>(com.example.hobby.Entity.MemberNumbering.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofPrimitiveInt(), "memberNumbering", "member_number", __namingType, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __idList) {
        __idList.add(__map.get("memberNumbering"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> __list) {
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
    public void preInsert(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.hobby.Entity.MemberNumbering entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.hobby.Entity.MemberNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.MemberNumbering, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.MemberNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.hobby.Entity.MemberNumbering newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.hobby.Entity.MemberNumbering, ?>> __args) {
        com.example.hobby.Entity.MemberNumbering entity = new com.example.hobby.Entity.MemberNumbering();
        if (__args.get("memberNumbering") != null) __args.get("memberNumbering").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.hobby.Entity.MemberNumbering> getEntityClass() {
        return com.example.hobby.Entity.MemberNumbering.class;
    }

    @Override
    public com.example.hobby.Entity.MemberNumbering getOriginalStates(com.example.hobby.Entity.MemberNumbering __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.hobby.Entity.MemberNumbering __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MemberNumbering getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MemberNumbering newInstance() {
        return new _MemberNumbering();
    }

}
