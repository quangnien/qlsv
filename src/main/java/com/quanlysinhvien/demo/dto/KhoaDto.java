package com.quanlysinhvien.demo.dto;


import lombok.Data;

import java.util.List;

@Data
public class KhoaDto {

	private Long id;
	private String maKhoa;
	private String tenKhoa;
	private String sdt;
	private String email;
	private List<GiangVienDto> giangvien;
	private List<LopDto> lop;

}
