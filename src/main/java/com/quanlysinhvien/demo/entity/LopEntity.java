package com.quanlysinhvien.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "lop")
@Data
public class LopEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ma_lop", unique=true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Lớp")
	@Length(min = 4 , message = "Mã lớp chứa ít nhất 4 ký tự!")
	private String maLop;
	
	@Column(name = "ten_lop", columnDefinition = "varchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Mã Khoa")
	@Length(min = 4 , message = "Mã lớp chứa ít nhất 4 ký tự!")
	private String tenLop;

//	@Column(name = "ma_khoa")
//	private String maKhoa;
	
	/* FOREIGN KEY */
	
	//
	@Column(name = "makhoa_id")
	private Long makhoaId;
	
	@ManyToOne
	@JoinColumn(name = "makhoa_id", insertable = false, updatable = false)
	private KhoaEntity khoa;
	
	//
	@OneToMany(mappedBy = "lop", fetch = FetchType.LAZY)
	private List<SinhVienEntity> sinhvien;
	
	//
	@OneToMany(mappedBy = "lop", fetch = FetchType.LAZY)
	private List<DsLopTcEntity> dsloptc;
	
	
}
