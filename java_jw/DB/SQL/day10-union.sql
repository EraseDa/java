use shoppingmall02;


/*
union, union all : 합집합
 -> 속성 이름들이 같아야 함
union : 중복제거
union all : 중복을 제거하지 않음. union보다 빠름 (왜? 중복을 제거하지 않기 때문에)

*/
select*from product where pd_amount > 10
	union
select*from product where pd_price > 10000;

select pd_num as 번호, pd_title as 제목 from product
 union
select pc_num as 번호, pc_name as 제목 from product_category;

select*from product where pd_amount > 10
	union all
select*from product where pd_price > 10000;