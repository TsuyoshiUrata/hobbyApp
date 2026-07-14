SELECT
    product.product_id,
    product.category_id,
    product.product_name,
    product.manufacturer,
    product.price,
    product.release_date,
    product.order_deadline,
    product.stock,
    product.description,
    category.category_name
FROM product
INNER JOIN category
ON product.category_id = category.category_id
WHERE product.product_name Like /*productName*/'%掃除機%'