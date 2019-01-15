package com.shm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shm.domain.Linkman;
import com.shm.service.ILinkmanService;
import com.shm.service.impl.LinkmanServiceImpl;

/**
 * 联系人的动作类
 * @author SHM
 *
 */
public class LinkmanAction extends ActionSupport implements ModelDriven<Linkman> {

	private ILinkmanService linkmanService = new LinkmanServiceImpl();
	private Linkman linkman = new Linkman();
	private List<Linkman> linkmans;
	@Override
	public Linkman getModel() {
		
		return linkman;
	}
	
	public String listLinkman() {
		//1.调用service对象查询联系人
		linkmans = linkmanService.listLinkman();
		//2.获取request对象
		/*HttpServletRequest request = ServletActionContext.getRequest();
		//3.把查询的对象存入请求域中
		request.setAttribute("linkmans", linkmans);*/
		
		//返回
		return "listLinkman";
	}
	
	
	//------getters and setters
	public List<Linkman> getLinkmans() {
		return linkmans;
	}
	public void setLinkmans(List<Linkman> linkmans) {
		this.linkmans = linkmans;
	}

}
