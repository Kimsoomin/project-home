create table member(
	name varchar2(50) not null,
	addr varchar2(50) not null,
	userid varchar2(50),
	password varchar2(50) not null,
	phone varchar2(50) not null,
	regdate varchar2(50) not null,
	profile varchar2(50) not null,
	email varchar2(50) not null,
	constraint member_pk primary key userid;
);

/*나중에 제약조건을 추가할 경우*/
--alter table member
--add constraint member_pk primary key (userid);
--
--constraint score_member_fk 
--foreign key (userid) references Member(userid)
