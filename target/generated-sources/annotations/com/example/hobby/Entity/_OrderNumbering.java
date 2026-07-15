package com.example.hobby.Entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-15T18:35:57.741+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _OrderNumbering extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.hobby.Entity.OrderNumbering> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final _OrderNumbering __singleton = new _OrderNumbering();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.hobby.Entity.OrderNumbering>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __embeddedPropertyTypeMap;

    private _OrderNumbering() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "OrderNumbering";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __list = new java.util.ArrayList<>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __map = new java.util.LinkedHashMap<>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __embeddedMap = new java.util.LinkedHashMap<>(1);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __embeddedMap) {
        __map.put("orderNumber", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.hobby.Entity.OrderNumbering, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderNumbering.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "orderNumber", "order_number", __namingType, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __idList) {
        __idList.add(__map.get("orderNumber"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> __list) {
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
    public void preInsert(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.hobby.Entity.OrderNumbering entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.hobby.Entity.OrderNumbering> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderNumbering, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.OrderNumbering, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.hobby.Entity.OrderNumbering newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.hobby.Entity.OrderNumbering, ?>> __args) {
        com.example.hobby.Entity.OrderNumbering entity = new com.example.hobby.Entity.OrderNumbering();
        if (__args.get("orderNumber") != null) __args.get("orderNumber").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.hobby.Entity.OrderNumbering> getEntityClass() {
        return com.example.hobby.Entity.OrderNumbering.class;
    }

    @Override
    public com.example.hobby.Entity.OrderNumbering getOriginalStates(com.example.hobby.Entity.OrderNumbering __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.hobby.Entity.OrderNumbering __entity) {
    }

    /**
     * @return the singleton
     */
    public static _OrderNumbering getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _OrderNumbering newInstance() {
        return new _OrderNumbering();
    }

}
