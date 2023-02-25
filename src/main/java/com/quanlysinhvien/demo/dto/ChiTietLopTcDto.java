package com.quanlysinhvien.demo.dto;

import lombok.Data;

@Data
public class ChiTietLopTcDto {

	private Long id;
	private int tiet;
	private String thu;
	private int soTiet;
	private String Phong;
	private int maloptcId;
	private DsLopTcDto dsloptc;
	
}
