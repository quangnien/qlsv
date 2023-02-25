package com.quanlysinhvien.demo.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GiangVienDto {

	private Long id;
	private String maGv;
	private String ho;
	private String ten;
	private String phai;
	private Date ngaySinh;
	private String sdt;
	private String email;
	private String matKhau;
	private int vaiTro;
	private String hinhAnh;
	private int makhoaId;
	private KhoaDto khoa;
	private List<DsLopTcDto> dsloptc;
}
