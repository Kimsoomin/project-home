create table member(
	businessName  varchar2(50) not null,
	userid varchar2(50),
	password varchar2(50) not null,
	addr varchar2(50) not null,
	tel varchar2(50) not null,
	phone varchar2(50) not null,
	regdate varchar2(50) not null,
	profile varchar2(50) not null,
	constraint member_pk primary key userid;
);