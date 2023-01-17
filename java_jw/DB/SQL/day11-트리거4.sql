-- 예매를 취소했을 때 예매 가능 좌석을 수정하는 트리거를 추가하세요.

use cgv;
drop trigger if exists update_ticketing;
delimiter //
create trigger update_ticketing after update
on ticketing
for each row
begin

	If new.ti_amount=0
		then update screen_schedule
			set ss_possible_seat=ss_possible_seat + old.ti_amount
		where ss_num=new.ti_ss_num;
	else
    If new.ti_amount < old.ti_amount
		then update screen_schedule
			set ss_possible_seat=ss_possible_seat + old.ti_amount - new.ti_amount
            where ss_num=new.ti_ss_num;
        end if;
        end if;
end //
delimiter ;

 update ticketing set ti_amount=0 where ti_num=1;
 select *from ticketing;
 select *from screen_schedule;