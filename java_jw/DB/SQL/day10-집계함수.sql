use shoppingmall02;
/*
순위함수 :  row_number(), dense_rank(), rank(), ntitle()
row_number() : 같은 값이 있을 때 등수가 서로 다름
dense_rank() : 같은 값의 경우 공동등수 있음. 바로 다음 등수로 나옴
rank() : 같은 값의 경우 공동등수 있음. 공동순위만큼 다음 등수가 건너뛰어짐.
ntile(n) : 등수를 총 n등까지 분할 
*/

select 
	row_number()over(order by pd_amount desc) as 보유량순위,
    pd_title as 제품명,
    pd_amount as 보유량
 from product;

select 
	row_number()over(order by pd_price desc) as 가격순위,
    pd_title as 제품명,
    pd_price as 제품가격
 from product;
 
 select 
	dense_rank()over(order by pd_price desc) as 가격순위,
    pd_title as 제품명,
    pd_price as 제품가격
 from product; 
 
 select 
	rank ()over(order by pd_price desc) as 가격순위,
    pd_title as 제품명,
    pd_price as 제품가격
 from product; 

select 
	ntile(3)over(order by pd_price desc) as 가격순위,
    pd_title as 제품명,
    pd_price as 제품가격
 from product;
 /*
 lead(속성) : 속성의 다음 값을 가져옴
 lead(속성,n,x): 속성의 다음 n개의 값을 가져오고 없으면 x로 대체
 lag(속성) : 속성의 이전 값을 가져옴
 lag(속성,n,x) : 속성의 이전 n개값을 가져오고 없으면 x로 대체
 first_value(속성) :  속성의 첫번째 값
 
 
 */
 select *, lead(pd_title) over( ORDER BY pd_num ASC) as 다음행값 from product;
 
 select
	row_number()over(order by pd_price desc) 
    pd_title, pd_price,
    pd_price - lead(pd_price)over(order by pd_price desc) as 가격차이 from product;
  
select
	row_number()over(order by pd_price desc) 
    pd_title, pd_price,
    pd_price - lag(pd_price)over(order by pd_price desc) as 가격차이 from product; 
    
select
	row_number()over(order by pd_price desc) 
    pd_title, pd_price,
    pd_price - first_value(pd_price)over(order by pd_price desc) as 가격차이 from product;   
    
select
	row_number()over(order by pd_price desc) 
    pd_title, pd_price,
    cume_dist()over(order by pd_price desc)*100 as 상위몇프로 from product;          

select pd_pc_num as 분류번호, avg(pd_price) as 평균가격 from product
group by (pd_pc_num);    
with product_avg(분류번호, 평균가격)
	as
    (select pd_pc_num, avg(pd_price) from product
group by (pd_pc_num))
select * from product_avg order by 분류번호 asc;    