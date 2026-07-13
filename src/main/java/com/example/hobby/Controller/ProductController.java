package com.example.hobby.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hobby.Dto.ProductDto;
import com.example.hobby.Service.ProductService;

@Controller
public class ProductController {

    //コンストラクタインジェクション
    private final ProductService productListService;
    public ProductController(ProductService productListService){
        this.productListService = productListService;
    }

    @GetMapping("/productList")
    public String productList(Model model){

        // サービスを呼び出す
        List<ProductDto> listProductDto = productListService.productList();
        // modelに格納
        model.addAttribute("listProductDto", listProductDto);
        return "V101_1_productList.html";
    }
    
}
