package com.example.demo.controller;

import com.example.demo.dto.respone.product.NewProductRespone;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;


    @GetMapping("all")
    public String trangChu1(Model model , @RequestParam("page") String page) {
        //PageRequest pageRequest = PageRequest.of(Integer.parseInt(page) - 1, 16);
        List<NewProductRespone> list = productService.findAll(PageRequest.of(Integer.valueOf(page) - 1, 8));
        model.addAttribute("list" , list);
        return "views/home/shop";
    }

//    @GetMapping("")
//    public String getProductByName(Model model) {
//        List<CategoryEntity> listCTs = categoryService.findByCategoryAndDeleteFlagIsFalse();
//        if (listCTs != null) {
//            for (var categori : listCTs
//            ) {
//                List<NewProductRespone> listIps = productService.findByCateId(categori.getId());
//                model.addAttribute("sp" + categori.getId(), listIps);
//            }
//        }
//        return "views/home/index-2";
//    }


    @GetMapping("index")
    public String trangChu(Model model) {
        List<NewProductRespone> listIps = productService.findByIphone();
        List<NewProductRespone> listSS = productService.findBySamSung();
        List<NewProductRespone> listOp = productService.findByOppo();
        List<NewProductRespone> listXX = productService.findByXiaomi();
        List<NewProductRespone> listTop10 = productService.findbyTop10();
        List<NewProductRespone> listNokia = productService.findByNokia();
        List<NewProductRespone> listRandom = productService.findbyRandom();
        List<NewProductRespone> list = new ArrayList<>();
        if(listRandom.size() > 2){
            for (int i = listRandom.size() - 1; i > listRandom.size() - 3 ; i--) {
                list.add(listRandom.get(i));
            }
        }

        model.addAttribute("list", list);
        model.addAttribute("listSS", listSS);
        model.addAttribute("listOp", listOp);
        model.addAttribute("lstIphone", listIps);
        model.addAttribute("listXX", listXX);
        model.addAttribute("listTop10", listTop10);
        model.addAttribute("listNokia", listNokia);
        model.addAttribute("listRandom", listRandom);
        return "views/home/trangchu";
    }
    @GetMapping("{id}")
    public String getProductByCategori(Model model, @PathVariable("id") String id) {
        List<NewProductRespone> listIps = productService.findByCateId(Long.parseLong(id));
        model.addAttribute("list", listIps);
        return "views/home/shop";
    }

    @GetMapping("timkiem/{name}")
    public String getName(Model model, @PathVariable("name") String id) {
        List<NewProductRespone> listRandom = productService.findByName(id);
        model.addAttribute("list", listRandom);
        return "views/home/shop";
    }
}
