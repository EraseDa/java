-- 예매를 하면, 해당 영화상영시간의 예매 가능 좌석을 수정해주는 트리거를 생성하고, 테스트하기

use cgv;
select*from screen_schedule;
Drop trigger if exists alter_seat;

delimiter //
create trigger alter_seat after insert

on ticketing

for each row
begin
	update screen_schedule
		set ss_possible_seat = ss_possible_seat -new.ti_amount
        where ss_num=new.ti_ss_num;
end //
delimiter ;

insert into ticketing values(5,2,'abc',10,20000);

select*from ticketing;
select*from screen_schedule;
