-- 제품 구매를 취소 했을 때 트리거

use shoppingmall02;
drop trigger if exists update_buy;
delimiter //
create trigger update_buy after update
on buy
for each row
begin
-- 제품 수량을 변경
	If new.buy_amount = old.buy_amount and new.buy_state = '구매취소'
		then update product
			set pd_amount=pd_amount + old.buy_amount
		where pd_num=new.buy_pd_num;
	else
    If new.buy_amount != old.buy_amount
		then update product
			set pd_amount=pd_amount +old.buy_amount - new.buy_amount
            where pd_num=old.buy_pd_num;
        end if;
        end if;
end //
delimiter ;

 update buy set buy_state='구매취소'where buy_num='3';
select *from buy;
select *from product;