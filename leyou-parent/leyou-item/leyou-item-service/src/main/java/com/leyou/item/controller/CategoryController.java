/*
package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("category")
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam("pid") Long pid){
        System.out.println("1111111111111111111111111111111111");
        if(pid == null || pid.longValue() <0 ){
            //响应400
            return ResponseEntity.badRequest().build();
        }
        List<Category> categorys = this.categoryService.queryCategorysByPid(pid);
        if(CollectionUtils.isEmpty(categorys)){
            //响应404
            return ResponseEntity.notFound().build();
        }
       return ResponseEntity.ok(categorys);
    }
}
*/
