package com.quanlysinhvien.demo.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "giang_vien")
@Data
public class GiangVienEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ma_gv", unique=true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Sinh Viên")
	@Length(min = 4 , message = "Mã sinh viên chứa ít nhất 4 ký tự!")
	private String maGv;
	
	@Column(name = "ho", columnDefinition = "nvarchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Họ")
	private String ho;
	
	@Column(name = "ten", columnDefinition = "nvarchar(50)")
	@NotBlank(message = "Vui Lòng Nhập Tên")
	private String ten;
	
	@Column(name = "phai", columnDefinition = "nvarchar(20) default 'nu'")
	@NotBlank(message = "Vui Lòng Nhập Giới Tính")
	private String phai;
	
	@Column(name = "ngay_sinh")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date ngaySinh;
	
	@Column(name = "sdt", columnDefinition = "varchar(11)")
	private String sdt;
	
	@Column(name = "email", columnDefinition = "varchar(50)")
	@NotBlank(message = "Vui lòng nhập Email!")
	@Email(message = "Nhập đúng định dạng email!")
	private String email;
	
	@Column(name = "mat_khau", columnDefinition = "nvarchar(500)")
	@NotBlank(message = "Vui Lòng Nhập Mật Khẩu")
	@Length(min = 4 , message = "Mật khẩu chứa ít nhất 4 ký tự!")
	private String matKhau;
	
	
	@Column(name = "vai_tro", columnDefinition = "int(1)")
	private int vaiTro;
	
	@Column(name = "hinh_anh", columnDefinition = "nvarchar(500)")
	private String hinhAnh;
	
	/* FOREIGN KEY */	
	//
	@Column(name = "makhoa_id")
	private Long makhoaId;
	
	@ManyToOne
	@JoinColumn(name = "makhoa_id", insertable = false, updatable = false)
	private KhoaEntity khoa;
	
	//
	@OneToMany(mappedBy = "giangvien", fetch = FetchType.LAZY)
	private List<DsLopTcEntity> dsloptc;
}
