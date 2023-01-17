/*
join :  두 개 이상의 테이블을 합쳐서 검색
- 이유 : 알고 있는 데이터와 조회하는 데이터가 서로 다른 테이블에 있고, 
		테이블들을 속성으로 연결할 수 있는 경우 사영
inner join
 - 두 테이블을 연결할 때, 연결되는 속성이 있는 값들만 연결
 select 속성명들 from 테이블1
	join 테이블2
    on 테이블1.속성명1=테이블2.속성명2
    [where]
    [group by]
    [having]
    [order by]
    [limit]
-- 속성명1과 속성명2가 이름이 같으면 반드시 테이블명을 써줘야 함.
다르면 생략할 수 있음.

-- 테이블 1과 테이블2가 연결, 테이블2와 테이블 3이 연결
select 속성명들 from 테이블1
	join 테이블2
		on 테이블1.속성명1 =테이블2.속성명2
	join 테이블3
		on 테이블2.속성명3 = 테이블3.속성명4
*/

-- 제품명과 옵션명을 함께 조회
select pr_title, po_title, po_amount from product 
	join product_option on po_pr_num=pr_num;
    
-- abc회원이 구매한 제품 옵션 번호를 조회. 단, 중복된 제품 옵션이 있으면 제거
select distinct po_num, ba_me_id  from product_option
	join product on po_pr_num=pr_num
    join basket on ba_po_num=po_num
    where ba_me_id='abc';
    
select distinct or_me_id as 구매자, ol_po_num as 제품번호 from `order`
	join order_list
    on or_num=ol_or_num
    where or_me_id='abc';
    
-- abc회원이 구매한 제품명을 조회
select pr_title  as 제품명, or_me_id as 구매자  from product
	join product_option on pr_num=po_pr_num
    join order_list on po_num=ol_po_num
    join `order` on or_num=ol_or_num
    where or_me_id='abc';

-- abc회원이 구매한 제품들이 배송된 주소지들을 조회

select ab_address as 주소지, or_me_id as 구매자 from address_book
    join `order` on ab_num=or_ab_num
    where or_me_id='abc' and ab_name='집';
    
-- 의류로 등록된 모든 제품들과 옵션들을 조회
select mc_name as 분류, pr_title as 제품명, po_title as 옵션  from product
	join sub_category on pr_sc_num=sc_num
    join main_category on sc_mc_num=mc_num
    join product_option on pr_num=po_pr_num
    where mc_name='의류';
    
 -- 분류별 등록된 제품명을 조회   
 select mc_name as 분류, sc_name as 소분류, pr_title as 제품명  from product
	right join sub_category on pr_sc_num=sc_num
    join main_category on sc_mc_num=mc_num;
    
 
select*from product;
select pr_title from product;
select*from address_book;
select*from `order`;
select*from main_category;