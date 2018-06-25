package com.briup.apps.poll.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.service.IOptionService;


@RestController
@RequestMapping("/option")

public class OptionController {
	@Autowired
	private IOptionService optionService;
	
	@GetMapping("findAllOption")
	public List<Option> findAllOption(){
		List<Option> list=new ArrayList<>();
		try {
			 list=optionService.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("deleteOptionById")
	public String deleteOptionById(long id){
		try {
			 optionService.deleteById(id);
			 return "删除失败";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "删除失败"+e.getMessage();
		}
	}
	
	@PostMapping("saveOption")
	public String saveOption(Option option){
		try {
			 optionService.save(option);
			 return "保存成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "保存失败"+e.getMessage();
		}
	}
	
	@PostMapping("updateOption")
	public String updateOption(Option option){
		try {
			 optionService.update(option);
			 return "更新失败";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "更新失败"+e.getMessage();
		}
	}

}
