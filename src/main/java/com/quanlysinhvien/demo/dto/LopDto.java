package com.quanlysinhvien.demo.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class LopDto {

	private Long id;
	private String maLop;
	private String tenLop;
	private int makhoaId;
	private KhoaDto khoa;
	private List<SinhVienDto> sinhvien;
	private List<DsLopTcDto> dsloptc;
}
