insert into cart 
values((SELECT COALESCE(MAX(detail_id), 0) + 1 FROM cart), /*cart.memberCode*/'CM0011', /*cart.productId*/'P0001', /*cart.price*/49800, /*cart.quantity*/2)
