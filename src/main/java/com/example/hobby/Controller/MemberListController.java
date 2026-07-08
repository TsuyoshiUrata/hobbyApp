package com.example.hobby.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Service.MemberListService;

@Controller
public class MemberListController {

    // コンストラクタインジェクション
    private final MemberListService memberListService;
    public MemberListController(MemberListService memberListService){
        this.memberListService = memberListService;
    }


    @GetMapping("/memberList")
    public String memberList(Model model) {
        // サービスを呼び出す
        List<MemberDto> customerList = memberListService.memberList("customer");
        List<MemberDto> employeeList = memberListService.memberList("employee");
        //modelに格納
        model.addAttribute("customerList", customerList);
        model.addAttribute("employeeList", employeeList);

        return "V004_1_memberList.html";
    }


    @GetMapping("/memberListDetail/{memberCode}")
    public String memberListDetail(Model model, @PathVariable String memberCode){
        // サービスを呼び出す
        MemberDto memberDto = memberListService.memberListDetail(memberCode);
        //モデルに格納
        model.addAttribute("memberDto", memberDto);

        return "V004_2_memberListDetail.html";
    }


}
