package com.quanlysinhvien.demo.dto;

import lombok.Data;

@Data
public class DiemDto {

	private Long id;
	private float cc;
	private float gk;
	private float ck;
	private float tb;
	private String xepLoai;
	private int masvId;
	private SinhVienDto sinhvien;
	private int maloptcId;
	private DsLopTcDto dsloptc;
	
}
