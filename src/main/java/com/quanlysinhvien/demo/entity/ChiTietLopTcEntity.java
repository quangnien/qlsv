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

import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "chi_tiet_lop_tc", uniqueConstraints={@UniqueConstraint(columnNames = {"maloptc_id" , "tiet", "thu"})})
@Data
public class ChiTietLopTcEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tiet", columnDefinition = "int(1)")
	private int tiet;
	
	@Column(name = "thu", columnDefinition = "nvarchar(10)")
	@NotBlank(message = "Vui Lòng Nhập Thứ")
	@Length(min = 2 , message = "Thứ chỉ chứa ít nhất 2 ký tự!")
	private String thu;
	
	@Column(name = "so_tiet", columnDefinition = "int(5)")
	private int soTiet;
	
	@Column(name = "phong", columnDefinition = "nvarchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Phòng")
	@Length(min = 2 , message = "Phòng chỉ chứa ít nhất 2 ký tự!")
	private String Phong;
	
	/* FOREIGN KEY */
	@Column(name = "maloptc_id")
	private Long maloptcId;
	
	@ManyToOne
	@JoinColumn(name = "maloptc_id", insertable = false, updatable = false)
	private DsLopTcEntity dsloptc;
	
}
