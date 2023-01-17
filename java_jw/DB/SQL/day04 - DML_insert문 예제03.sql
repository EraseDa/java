-- 제품 카테고리에 가전, 의류, 식품, 취미용품, 애견용품 추가하는 쿼리를 작성하세요.


insert into product_category (pc_name) values 
	('가전'), ('의류'), ('식품'), ('취미용품'), ('애견용품');

select*from product_category;

-- 가전, 50인치 TV, 50인치 TV 팜, 10대, 10000원
-- 가전, 100인치 TV, 100인치 TV 팜, 20대, 100000원
-- 가전, 무풍 에어컨, 무풍 에어컨 팜, 30대, 200000원
-- 의류, 셔츠, 겨울용 셔츠 팜, 15개, 1000원
-- 식품, 스테이크, 부드러운 스테이크 팜, 40개, 2000원
-- 취미용품, 등산화, 안전한 등산화, 5개, 5000원
-- 애견용품, 개껌, 오래가는 개껌, 3개, 10000원

insert into product values (1, '50인치 TV', '50인치 TV 팜', 10, 10000, 1);
insert into product values (2, '100인치 TV', '100인치 TV 팜', 20, 100000, 1);
insert into product values (3, '무풍 에어컨', '무풍 에어컨 팜', 30, 200000, 1);
insert into product values (4, '셔츠', '겨울용 셔츠 팜', 15, 1000, 2);
insert into product values (5, '스테이크', '부드러운 스테이크 팜', 40, 2000, 3);
insert into product values (6, '등산화', '안전한 등산화', 5, 5000, 4);
insert into product values (7, '개껌', '오래가는 개껌', 3, 10000, 5);

/*
insert into product(pd_title, pd_contents, pd_amount, pd_price, pd_pc_num)
	valuse ('50인치 TV', '50인치 TV 팜', 10, 10000, 1);
    ('100인치 TV', '100인치 TV 팜', 20, 100000, 1);
    ('무풍 에어컨', '무풍 에어컨 팜', 30, 200000, 1);
    ('셔츠', '겨울용 셔츠 팜', 15, 1000, 2);
    ('스테이크', '부드러운 스테이크 팜', 40, 2000, 3);
    ('등산화', '안전한 등산화', 5, 5000, 4);
    ('개껌', '오래가는 개껌', 3, 10000, 5);
*/
select*from product;

-- abc 회원이 50인치 TV를 1대 구매 함. 주소는 서울시 강남, 우편번호는 12345

insert into buy(buy_num, buy_state, buy_amount, buy_address, buy_post_num,
	buy_mem_id, buy_pd_num) 
    values('1', 'buying', 1, '서울시 강남', '12345', 'abc', 1);
   
update product
	set pd_amount = pd_amount - 1
    where pd_num = 1;
    
select*from buy;
select*from product;

/*
-insert values문 : 추가하는 값들을 모두 알고 있는 경우
insert into 테이블명 values();
-insert select문 : 일부 값들이 검색을 통해 가져와야 하는 경우
insert into 테이블명 select . . .
*/

-- 식품, 음료수, 콜라, 100개, 1000원
insert into product(pd_title, pd_contents, pd_amount, pd_price, pd_pc_num)
	select '음료수', '콜라', 100, 1000, pc_num from product_category
		where pc_name = '식품';

select*from product;


