package com.example.hobby.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Dto.ProductDto;
import com.example.hobby.Service.ProductService;

@Controller
public class ProductController {

    // コンストラクタインジェクション
    private final ProductService productListService;

    public ProductController(ProductService productListService) {
        this.productListService = productListService;
    }

    @GetMapping("/productList")
    public String productList(Model model) {

        // サービスを呼び出す
        List<ProductDto> listProductDto = productListService.productList();
        // modelに格納
        model.addAttribute("listProductDto", listProductDto);
        return "V101_1_productList.html";
    }

    @GetMapping("/productDetail/{productId}")
    public String memberListDetail(Model model, @PathVariable String productId) {
        // サービスを呼び出す
        ProductDto productDto = productListService.productDetail(productId);
        // モデルに格納
        model.addAttribute("productDto", productDto);

        return "V101_2_productDetail.html";
    }

}
