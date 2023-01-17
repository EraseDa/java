use shoppingmall02;
select *from buy;
-- 제품번호, 수량, 배송지, 우편주소, 아이디가 주어지면 제품을 구매하는 프로시저 작성하기

DROP PROCEDURE IF EXISTS buying;
DELIMITER //
CREATE PROCEDURE buying(
	in _num int,
	in _amount int,
	in _address varchar(50),
	in _post_num varchar(10),
	in _id varchar(15)
)
BEGIN

	insert into buy(buy_num, buy_amount, buy_address, buy_post_num, buy_mem_id, buy_pd_num)
	 values(concat(_id,left(now(),10)),_amount, _address, _post_num,_id,_num);
    
    update product set pd_amount = pd_amount - _amount where pd_num = _num;
END //
DELIMITER ;
CALL buying(1, 3, '서울시 강서구', 12345, 'abc');



