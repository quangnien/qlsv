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
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "mon_hoc")
@Data
public class MonHocEntity  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKey(generationType = PrimaryKey.GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "ma_mh", unique=true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Môn Học")
	@Length(min = 4 , message = "Mã môn học chứa ít nhất 4 ký tự!")
	private String maMh;
	
	@Column(name = "ten_mh", columnDefinition = "varchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Tên Môn Học")
	@Length(min = 4 , message = "Tên môn học chứa ít nhất 4 ký tự!")
	private String tenMh;
	
	@Column(name = "so_tc", columnDefinition = "int(2)")
	private int soTc;

	/* FOREIGN KEY */
	@OneToMany(mappedBy = "monhoc", fetch = FetchType.LAZY)
	private List<DsLopTcEntity> dsloptc;
}
