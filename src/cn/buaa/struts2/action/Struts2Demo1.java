package cn.buaa.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Struts2Demo1 extends ActionSupport{

	@Override
	public String execute(){
			
			System.out.println("Struts2Demo1��Action������!");
			return SUCCESS;
		}

}
