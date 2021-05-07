package com.example.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResp {
	public String page;
	public String per_page;
	public String total;
	public String total_pages;
	public List<UserData> data;

}
