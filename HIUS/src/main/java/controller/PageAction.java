package controller;

import org.springframework.ui.Model;

public class PageAction {
	public void page(Model model, int count,int limit
			,int limitPage, int page, String pageUrl) {
		int maxPage = (int)(((double)count/limit) + 0.95);
		///              3   / 10 = (int)0.3 * 10 = 0  + 1
		///              13  /10  = (int)1.3 * 10 = 10  + 1
		int startPage = 
				(int)(((double)page / limitPage + 0.95) -1) * limitPage + 1;
		int endPage = startPage + limitPage -1;
		if(endPage > maxPage) endPage = maxPage;
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);	
		model.addAttribute("pageUrl", pageUrl);
	}
}
