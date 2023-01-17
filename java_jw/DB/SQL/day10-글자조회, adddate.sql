use shopppingmall02;

-- 제품명에 tv가 들어가는 제품들을 조회 
select *from product
where pd_title like '%TV%';

select *from product
where pd_title like concat('%', 'TV', '%');

select format(1000000,0);
-- 파일명이 주어졌을 때 확장자를 추출하는 예제
select right ('test.txt',3);

-- adddate, subdate
select adddate(now(), interval 3 day);
select adddate(now(), interval 1 week);
select adddate(now(), interval 1 month);
select subdate(now(), interval 2 day);