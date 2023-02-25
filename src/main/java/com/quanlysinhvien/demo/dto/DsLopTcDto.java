package com.quanlysinhvien.demo.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DsLopTcDto {

	private Long id;
	private String maLopTc;
	private int nienKhoa;
	private int ky;
	private Date timeBd;
	private Date timeKt;
	private int mamhId;
	private MonHocDto monhoc;
	private int magvId;
	private GiangVienDto giangvien;
	private int malopId;
	private LopDto lop;
	private List<DiemDto> diem;
	private List<ChiTietLopTcDto> chitietloptc;
	
}
