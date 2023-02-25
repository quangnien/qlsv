package com.quanlysinhvien.demo.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "khoa")
@Data
public class KhoaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ma_khoa", unique=true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Khoa")
	@Length(min = 4 , message = "Mã khoa chứa ít nhất 4 ký tự!")
	private String maKhoa;
	
	@Column(name = "ten_khoa", columnDefinition = "nvarchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Tên Khoa")
	@Length(min = 4 , message = "Mã khoa chứa ít nhất 5 ký tự!")
	private String tenKhoa;
	
	@Column(name = "sdt", columnDefinition = "varchar(11)")
	private String sdt;
	
	@Column(name = "email", columnDefinition = "varchar(50)")
	@NotBlank(message = "Vui lòng nhập Email!")
	@Email(message = "Nhập đúng định dạng email!")
	private String email;
	
	/* FOREIGN KEY */
	//
	@OneToMany(mappedBy = "khoa", fetch = FetchType.LAZY)
	private List<GiangVienEntity> giangvien;
	
	//
	@OneToMany(mappedBy = "khoa", fetch = FetchType.LAZY)
	private List<LopEntity> lop;
	
	//
	
	
}
