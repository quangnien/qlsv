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
@Table(name = "ds_lop_tc")
@Data
public class DsLopTcEntity  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKey(generationType = PrimaryKey.GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "ma_lop_tc", unique = true, columnDefinition = "varchar(20)")
	@NotBlank(message = "Vui Lòng Nhập Mã Lớp Tín Chỉ")
	@Length(min = 4 , message = "Mã lớp tín chỉ chứa ít nhất 4 ký tự!")
	private String maLopTc;
	
	@Column(name = "nien_khoa", columnDefinition = "int(10)")
	private int nienKhoa;
	
	@Column(name = "ky", columnDefinition = "int(1)")
	private int ky;
	
	@Column(name = "time_bd")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date timeBd;
	
	@Column(name = "time_kt")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date timeKt;
	
	/* FOREIGN KEY */	
	//
	@Column(name = "mamh_id")
	private Long mamhId;
	
	@ManyToOne
	@JoinColumn(name = "mamh_id", insertable = false, updatable = false)
	private MonHocEntity monhoc;

	//
	@Column(name = "magv_id")
	private Long magvId;
	
	@ManyToOne
	@JoinColumn(name = "magv_id", insertable = false, updatable = false)
	private GiangVienEntity giangvien;
	
	//
	@Column(name = "malop_id")
	private Long malopId;
	
	@ManyToOne
	@JoinColumn(name = "malop_id", insertable = false, updatable = false)
	private LopEntity lop;
	
	//
	@OneToMany(mappedBy = "dsloptc", fetch = FetchType.LAZY)
	private List<DiemEntity> diem;
	
	//
	@OneToMany(mappedBy = "dsloptc", fetch = FetchType.LAZY)
	private List<ChiTietLopTcEntity> chitietloptc;
	
}
