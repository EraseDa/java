drop database if exists shoppingmall02;
create database if not exists shoppingmall02;

use shoppingmall02;
-- drop table if exists member;
create table if not exists member(

mem_id varchar(15) primary key, 
mem_pw varchar(15) not null,
mem_name varchar(20) not null,
mem_birthday date not null,
mem_authority varchar(6) not null default 'MEMBER' -- 권한 : 회원(MEMBER), 관리자(ADMIN)

);

-- drop table if exists product_category;
create table if not exists product_category(

pc_num int auto_increment primary key, 
pc_name varchar(15) not null -- 제품 카테고리명
);

-- drop table if exists product;
create table if not exists product(

pd_num int auto_increment primary key, 
pd_title varchar(15) not null,
pd_contents longtext not null, -- 제품 상세
pd_amount int not null default 0,
pd_price int not null, 
pd_pc_num int not null, -- fk제품카테고리
constraint fk_pd_pc_num 
	foreign key(pd_pc_num) references product_category(pc_num)


);

-- drop table if exists board_category;
create table if not exists board_category(
bc_num int auto_increment primary key,
bc_name varchar(15) not null
);

-- drop table if exists board;
create table if not exists board(
bo_num int auto_increment primary key,
bo_title varchar(50) not null,
bo_contents longtext not null,
bo_writer varchar(15) not null,
bo_reg_date datetime not null default now(),
bo_views int not null default 0,
bo_mem_id varchar(15) not null,
bo_bc_num int not null,
constraint fk_bo_mem_id 
	foreign key(bo_mem_id) references member(mem_id),
constraint fk_bo_bc_num 
	foreign key(bo_bc_num) references board_category(bc_num)
);

-- drop table if exists buy;
create table if not exists buy(
buy_num varchar(20) primary key,
buy_state varchar(10) not null default '결제 완료',
buy_amount int not null default 1,
buy_address varchar(50) not null,
buy_post_num varchar(10) not null,
buy_mem_id varchar(15) not null,
buy_pd_num int not null,
constraint fk_buy_mem_id 
	foreign key(buy_mem_id) references member(mem_id),
constraint fk_buy_pd_num 
	foreign key(buy_pd_num) references product(pd_num)

);

-- drop table if exists inquiry;
create table if not exists inquiry(
in_num int auto_increment primary key,
in_contents longtext not null,
in_reply longtext,
in_pw char(4),
in_mem_id varchar(15) not null,
in_pd_num int not null,
constraint fk_in_mem_id 
	foreign key(in_mem_id) references member(mem_id),
constraint fk_in_pd_num 
	foreign key(in_pd_num) references product(pd_num)
);