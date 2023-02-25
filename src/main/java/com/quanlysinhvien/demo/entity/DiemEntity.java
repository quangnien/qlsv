package com.quanlysinhvien.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "diem", uniqueConstraints={@UniqueConstraint(columnNames = {"masv_id" , "maloptc_id"})})
@Data
public class DiemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cc")
	private float cc;
	
	@Column(name = "gk")
	private float gk;
	
	@Column(name = "ck")
	private float ck;
	
	@Column(name = "tb")
	private float tb;
	
	@Column(name = "xep_loai", columnDefinition = "varchar(2)")
	@NotBlank(message = "Vui Lòng Nhập Xếp Loại")
	private String xepLoai;
	
	
	/* FOREIGN KEY */
	//
	@Column(name = "masv_id")
	private Long masvId;
	
	@ManyToOne
	@JoinColumn(name = "masv_id", insertable = false, updatable = false)
	private SinhVienEntity sinhvien;
	
	//
	@Column(name = "maloptc_id")
	private Long maloptcId;
	
	@ManyToOne
	@JoinColumn(name = "maloptc_id", insertable = false, updatable = false)
	private DsLopTcEntity dsloptc;
	
}
