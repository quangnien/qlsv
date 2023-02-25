package com.quanlysinhvien.demo.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SinhVienDto {

	private Long id;
	private String maSv;
	private String ho;
	private String ten;
	private String phai;
	private Date ngaySinh;
	private String noiSinh;
	private String diaChi;
	private int trangThai;
	private String hinhAnh;
	private String matKhau;
	private String sdt;
	private int malopId;
	private LopDto lop;
	private List<DiemDto> diem;

}
