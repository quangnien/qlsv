package com.quanlysinhvien.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class MonHocDto {

	private Long id;
	private String maMh;
	private String tenMh;
	private int soTc;
	private List<DsLopTcDto> dsloptc;
}
