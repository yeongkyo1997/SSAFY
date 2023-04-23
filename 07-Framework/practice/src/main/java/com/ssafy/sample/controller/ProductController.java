package com.ssafy.sample.controller;

import com.ssafy.sample.model.Product;
import com.ssafy.sample.model.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("list")
    public String list(Model model) throws SQLException {
        List<Product> list = productService.list();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("detail")
    public String detail(String code, Model model) throws Exception {
        Product product = productService.detail(code);
        model.addAttribute("product", product);
        return "detail";
    }

    @GetMapping("delete")
    public String delete(String code) throws Exception {
        productService.delete(code);
        return "redirect:list";
    }

    @GetMapping("regist")
    public String writeForm(HttpSession httpSession, RedirectAttributes redirectAttributes) {
        if (httpSession.getAttribute("userInfo") == null) {
            redirectAttributes.addFlashAttribute("msg", "로그인 후에 이용하세요");
            return "redirect:/";
        } else return "regist";
    }

    @PostMapping("regist")
    public String write(RedirectAttributes redirectAttributes, Product product) throws Exception {
        if (productService.detail(product.getCode()) != null) {
            redirectAttributes.addFlashAttribute("msg", "이미 등록된 코드번호입니다");
            return "redirect:regist";
        } else productService.write(product);
        return "redirect:/";
    }
}
