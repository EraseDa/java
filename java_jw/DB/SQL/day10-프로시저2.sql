USE CGV;

DROP PROCEDURE IF exists MEMBER_MOVIE_COUNT;
DELIMITER //
CREATE PROCEDURE MEMBER_MOVIE_COUNT(
	IN _ID VARCHAR(20)
)
BEGIN
-- 지역 변수 선언(declare)은 위에 모아줘야 함.
	declare _movie_count int default 0;
	with ticketing_count(ss_mo_num, movie_ticketing_count)
		as
		(SELECT ss_mo_num, count(*)FROM ticketing
			JOIN screen_schedule on ti_ss_num=ss_num
			where ti_me_id like _ID
			group by ss_mo_num) -- 영화별 예매 횟수, 예매한 전체 영화 수가 아님
		select @num :=count(*) from ticketing_count;
		set _movie_count =(select @num);
        update MEMBER set me_movie_count = _movie_count where me_id = _Id;
END //
DELIMITER ;
CALL MEMBER_MOVIE_COUNT('abc');


