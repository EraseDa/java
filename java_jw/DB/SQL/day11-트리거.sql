/*
-- 트리거에서 추가/수정/삭제된 데이터를 가져올 때 new|old를 사용
-- insert : new(추가된 데이터)
-- update : old(값이 변경 전 데이터), new(값이 변경 된 후 데이터)
-- delete : old(삭제된 데이터)

Drop trigger if exists 트리거명;

delimiter //
create trigger 트리거명
-- before : 테이블에 데이터가 삭제|추가|수정 되기 전에 트리거가 실행
-- after : 테이블에 데이터가 삭제|추가|수정 된 후에 트리거가 실행

before|after delete|insert|update
on 테이블명
for each row
begin
-- 실행코드
end //
delimiter ;

*/
use shoppingmall02;
drop trigger if exists insert_buy;
delimiter //
create trigger insert_buy after insert
on buy
for each row
begin
-- 추가된 데이터는 new를 통해 가져옴.
update product 
	set pd_amount = pd_amount - new.buy_amount
	where pd_num = new.buy_pd_num;
end //
delimiter ;

insert into buy(buy_num,buy_amount, buy_address, buy_post_num, buy_mem_id, buy_pd_num)
	values(3,5,'서울시 강남','12345','asd',2)
    
 

