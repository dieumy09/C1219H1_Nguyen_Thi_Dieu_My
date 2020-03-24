use case_study_furama;
-- toan tu " = ":  hien thi toan bo thong tin nhan vien co dia chi o 'Quang Nam'
select * from nhan_vien where dia_chi = 'Quang Nam';
-- su dung toan tu " <> " de hien thi toan bo thong tin nhan vien khong co dia chi o 'Quang Nam'
select * from nhan_vien where (dia_chi <> 'Quang Nam');
-- su dung toan tu ">=" de hien thi toan bo thong tin nhan vien co ten nhieu hon 15 ki tu
select * from nhan_vien where length(ho_ten) >= 15;
-- su dung toan tu "Between" de hien thi toan bo thong tin nhan vien co ngay sinh tu 01/01/1997 den ngay 09/09/1997
select * from nhan_vien where ngay_sinh between '1997-01-01' and '1997-09-09';
-- su dung toan tu "Like" de hien thi toan bo thong tin nhan vien co ki tu D trong ten
select * from nhan_vien where nhan_vien.ho_ten like '%D%';
-- su dung toan tu "IN" de hien thi id_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu duoc khach hang dat sau ngay 01/01/2019
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu 
from dich_vu
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where id_dich_vu in
(
	select dich_vu.id_dich_vu 
	from dich_vu
	inner join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
	where (hop_dong.ngay_lam_hop_dong >= '2019-01-01' )
);
-- su dung toan toan "OR" de hien thi toan bo thong tin nhan vien ma ten bat dau bang H hoac K hoac T
select * from nhan_vien 
where (( ho_ten like 'H%' ) or (ho_ten like 'K%') or (ho_ten like 'T%')) ;
-- su dung toan tu "AND" de hien thi toan bo thong tin nhan vien co ten bat dau bang H va ten khong qua 15 ki tu
select * from nhan_vien 
where ( ho_ten like 'H%' )  and (length(ho_ten) <= 15);

-- su dung toan tu "NOT" de hien thi id_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu ma khach hang chua tung dat sau ngay 01/01/2019
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu 
from dich_vu
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where id_dich_vu  not in
(
	select dich_vu.id_dich_vu 
	from dich_vu
	inner join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
	where (hop_dong.ngay_lam_hop_dong >= '2019-01-01' )
);

-- su dung "INNER JOIN" de hien thi toan bo thong tin khach hang va thong tin hop dong ma khach hang da dat
select * 
from khach_hang
inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang;

-- su dung "LEFT JOIN" de hien thi thong tin hop dong cua cac khach hang da dat, cac khach hang chua dat lan nao cung hien thi thong tin khach hang
select *
from khach_hang
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang;
-- su dung "RIGHT JOIN" de hien thi thong tin hop dong cua cac khach hang da dat, cac khach hang chua dat lan nao cung hien thi thong tin khach hang
select *
from hop_dong
right join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang;
-- su dung "GROUP BY" de hien thi thong tin khach hang co ten khong trung nha
select ho_ten from khach_hang group by khach_hang.ho_ten;
-- su dung "HAVING" de hien thi ten khach hang co so lan xuat hien nhieu hon 1
select ho_ten , count(khach_hang.ho_ten) as so_lan
from khach_hang
group by ho_ten
having so_lan >1;
-- su dung "ORDER BY" de hien thi ten khach hang theo thu tu tu A -Z
select ho_ten from khach_hang order by ho_ten;