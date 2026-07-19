package com.example.hobby.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hobby.Dao.ProductDao;
import com.example.hobby.Dto.ProductDto;
import com.example.hobby.Entity.ProductComposit;

@Service
public class ProductServiceImpl implements ProductService {

    // コンストラクタインジェクション
    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<ProductDto> productList() {

        // サービスを呼び出す
        List<ProductComposit> listProductComposit = productDao.productList();

        // Dtoを新規作成
        List<ProductDto> listProductDto = new ArrayList<ProductDto>();

        // Dtoに入れる
        for (ProductComposit productComposit : listProductComposit) {
            listProductDto.add(new ProductDto(
                    productComposit.getProductId(),
                    productComposit.getCategoryId(),
                    productComposit.getProductName(),
                    productComposit.getManufacturer(),
                    productComposit.getPrice(),
                    productComposit.getReleaseDate(),
                    productComposit.getOrderDeadline(),
                    productComposit.getStock(),
                    productComposit.getDescription(),
                    productComposit.getCategoryName()));
        }

        return listProductDto;
    }



    public ProductDto productDetail(String productId) {

        // 新規作成
        ProductDto productDto = new ProductDto();
        ProductComposit productComposit = productDao.productDetail(productId);

        productDto.setCategoryId(productComposit.getCategoryId());
        productDto.setCategoryName(productComposit.getCategoryName());
        productDto.setDescription(productComposit.getDescription());
        productDto.setManufacturer(productComposit.getManufacturer());
        productDto.setOrderDeadline(productComposit.getOrderDeadline());
        productDto.setPrice(productComposit.getPrice());
        productDto.setProductId(productComposit.getProductId());
        productDto.setProductName(productComposit.getProductName());
        productDto.setReleaseDate(productComposit.getReleaseDate());
        productDto.setStock(productComposit.getStock());

        return productDto;
    }

    public List<ProductDto> searchProductList(String productName) {

        // daoを呼び出す
        List<ProductComposit> listProductComposit = productDao.searchProductList(productName);

        // Dtoを新規作成
        List<ProductDto> listProductDto = new ArrayList<ProductDto>();

        // Dtoに入れる
        for (ProductComposit productComposit : listProductComposit) {
            listProductDto.add(new ProductDto(
                    productComposit.getProductId(),
                    productComposit.getCategoryId(),
                    productComposit.getProductName(),
                    productComposit.getManufacturer(),
                    productComposit.getPrice(),
                    productComposit.getReleaseDate(),
                    productComposit.getOrderDeadline(),
                    productComposit.getStock(),
                    productComposit.getDescription(),
                    productComposit.getCategoryName()));
        }

        return listProductDto;
    }
}
