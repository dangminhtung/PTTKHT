create database QuanLyHocPhi

create table account
(
    idAccount PRIMARY key,
    username NVARCHAR(50),
    password NVARCHAR(50),
    role int
)
select *
from account
delete from account where idAccount=0
create table SinhVien
(
    idSV int PRIMARY KEY,
    idAccount int,
    name NVARCHAR(50),
    ChuyenNganh NVARCHAR(50),
    LopHoc NVARCHAR(50),
    KhoaHoc int,
    status int
)
select *
from SinhVien
delete from SinhVien where idSV=163
create table NopHocPhi
(
    idSV int,
    khoa int,
    NamHoc NVARCHAR(50),
    TienPhaiNop int,
    TienDaNop int,
    status int
)
select sv.name, sv.KhoaHoc, hp.TienPhaiNop
from SinhVien sv JOIN NopHocPhi hp
    on sv.idSV=hp.idSV
where sv.idSV=171 and hp.NamHoc='2018-2019_Ki2'

SELECT *
from NopHocPhi
-- delete  from account
-- delete from NopHocPhi where idSV=171 and NamHoc
-- update NopHocPhi set TienPhaiNop=300 where idSV=171 and NamHoc='2018-2019_Ki2'

alter table SinhVien add CONSTRAINT AC_SV FOREIGN KEY (idAccount) REFERENCES account(idAccount)
alter table NopHocPhi add CONSTRAINT HP_SV FOREIGN KEY (idSV) REFERENCES SinhVien(idSV)


-- insert ACCOUNT------------------------------------
insert into account
values
    (0, 'admin', '123', 1)
insert into account
values
    (1, 'tung', '123', 0)
insert into account
values
    (2, 'linh', '123', 0)
insert into account
values
    (3, 'ha', '123', 0)

-- insert SINHVIEN------------------------------
insert into SinhVien
VALUES
    (171, 1, 'tung', 'ATTT', 'AT17A', 17, 0)
insert into SinhVien
VALUEs
    (172, 2, 'linh', 'ATTT', 'AT17A', 17, 0)
insert into SinhVien
VALUES
    (163, 3, 'ha', 'CNTT', 'AT17B', 16, 0)

-- insert HOCPHI---------------------------------------
insert into NopHocPhi
values
    (171, 17, '2018-2019_Ki1', 100, 100, 1)
insert into NopHocPhi
values
    (171, 17, '2018-2019_Ki2', 100, 0, 0)
insert into NopHocPhi
values
    (163, 16, '2018-2019_Ki1', 100, 0, 0)
insert into NopHocPhi
values
    (172, 17, '2018-2019_ki1', 100, 0, 0)
insert into NopHocPhi
values
    (172, 17, '2018-2019_ki2', 100, 100, 1)
insert into NopHocPhi
values
    (171, 17, '2019-2020_ki1', 300, 0, 0)
insert into NopHocPhi
values
    (163, 16, '2018-2019_ki2', 300, 0, 0)
insert into NopHocPhi
values
    (173, 17, '2019-2020_ki1', 350, 0, 0)
insert into NopHocPhi
values
    (173, 17, '2019-2020_ki2', 200, 0, 0)
-- select *
-- from NopHocPhi

-- drop DATABASE QuanLyHocPhi
-- drop table account
-- drop table SinhVien
-- drop table NopHocPhi
-- alter table NopHocPhi drop CONSTRAINT HP_SV
-- alter table SinhVien drop CONSTRAINT AC_SV