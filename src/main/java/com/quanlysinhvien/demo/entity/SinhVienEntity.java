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
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Entity
@Table(name = "sinh_vien")
@Data
public class SinhVienEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ma_sv", unique=true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Sinh Viên")
	@Length(min = 4 , message = "Mã sinh viên chứa ít nhất 4 ký tự!")
	private String maSv;
	
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
	
	@Column(name = "noi_sinh", columnDefinition = "nvarchar(255)")
	@NotBlank(message = "Vui Lòng Nhập Nơi Sinh")
	@Length(min = 4 , message = "Nơi sinh chứa ít nhất 4 ký tự!")
	private String noiSinh;
	
	@Column(name = "dia_chi", columnDefinition = "nvarchar(255)")
	@NotBlank(message = "Vui Lòng Nhập Địa chỉ")
	@Length(min = 4 , message = "Địa chỉ chứa ít nhất 4 ký tự!")
	private String diaChi;
	
	@Column(name = "trang_thai", columnDefinition = "int(1) default 1")
	private int trangThai;
	
	@Column(name = "hinh_anh", columnDefinition = "nvarchar(500)")
	private String hinhAnh;
	
	@Column(name = "mat_khau", columnDefinition = "nvarchar(500)")
	@NotBlank(message = "Vui Lòng Nhập Mật Khẩu")
	@Length(min = 4 , message = "Mật khẩu chứa ít nhất 4 ký tự!")
	private String matKhau;
	
	@Column(name = "sdt", columnDefinition = "varchar(11)")
	private String sdt;
	
	/* FOREIGN KEY */
	//
	@Column(name = "malop_id")
	private Long malopId;
	
	@ManyToOne
	@JoinColumn(name = "malop_id", insertable = false, updatable = false)
	private LopEntity lop;
	
	//
	@OneToMany(mappedBy = "sinhvien", fetch = FetchType.LAZY)
	private List<DiemEntity> diem;

}
