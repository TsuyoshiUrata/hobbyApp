SELECT /*%expand*/*
FROM product
INNER JOIN category
ON product.category_id = category.category_id
WHERE product.product_name Like /*productName*/'%掃除機%'