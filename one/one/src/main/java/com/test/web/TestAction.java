package com.test.web;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.bo.BJg0101;
import com.test.service.QueryDateService;  
  
@Controller  
@RequestMapping("/testAction")  
public class TestAction {  
    @Resource  
    private QueryDateService queryDateService;  
      
    @RequestMapping("/show")  
    public String toIndex(HttpServletRequest request,Model model){  
        String jzgbh = request.getParameter("jzgbh");  
        BJg0101 bo = this.queryDateService.findBj0101(jzgbh);  
        model.addAttribute("abc", bo);  
        return "common/test";  
    }
}  