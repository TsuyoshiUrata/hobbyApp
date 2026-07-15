package com.example.hobby.Entity;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.58.0" }, date = "2026-07-15T18:33:48.865+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _OrderInfo extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.hobby.Entity.OrderInfo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.58.0");
    }

    private static final _OrderInfo __singleton = new _OrderInfo();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.hobby.Entity.OrderInfo>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __embeddedPropertyTypeMap;

    private _OrderInfo() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "OrderInfo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __map = new java.util.LinkedHashMap<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __embeddedMap = new java.util.LinkedHashMap<>(5);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __embeddedMap) {
        __map.put("detailId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.hobby.Entity.OrderInfo, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderInfo.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "detailId", "detail_id", __namingType, false));
        __map.put("orderId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.OrderInfo, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderInfo.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "orderId", "order_id", __namingType, true, true, false));
        __map.put("productId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.OrderInfo, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderInfo.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "productId", "product_id", __namingType, true, true, false));
        __map.put("quantity", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.OrderInfo, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderInfo.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "quantity", "quantity", __namingType, true, true, false));
        __map.put("price", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.hobby.Entity.OrderInfo, java.lang.String, java.lang.String>(com.example.hobby.Entity.OrderInfo.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "price", "price", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __idList) {
        __idList.add(__map.get("detailId"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> __list) {
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
    public void preInsert(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.hobby.Entity.OrderInfo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.hobby.Entity.OrderInfo> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.hobby.Entity.OrderInfo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.hobby.Entity.OrderInfo, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.hobby.Entity.OrderInfo newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.hobby.Entity.OrderInfo, ?>> __args) {
        com.example.hobby.Entity.OrderInfo entity = new com.example.hobby.Entity.OrderInfo();
        if (__args.get("detailId") != null) __args.get("detailId").save(entity);
        if (__args.get("orderId") != null) __args.get("orderId").save(entity);
        if (__args.get("productId") != null) __args.get("productId").save(entity);
        if (__args.get("quantity") != null) __args.get("quantity").save(entity);
        if (__args.get("price") != null) __args.get("price").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.hobby.Entity.OrderInfo> getEntityClass() {
        return com.example.hobby.Entity.OrderInfo.class;
    }

    @Override
    public com.example.hobby.Entity.OrderInfo getOriginalStates(com.example.hobby.Entity.OrderInfo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.hobby.Entity.OrderInfo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _OrderInfo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _OrderInfo newInstance() {
        return new _OrderInfo();
    }

}
