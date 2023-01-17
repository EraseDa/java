use cgv;
-- 예매한 영화이름, 영화관, 좌석이름, 아이디, 상영일, 상영시간을 조회

create view ticket_detail01
as
select mo_title, ci_name, ss_date,ss_time, se_name, ti_me_id from ticketing
	join ticketing_seat on ts_ti_num= ti_num
    join seat on se_num=ts_se_num
    join screen_schedule on ss_num=ti_ss_num
    join movie on mo_num=ss_mo_num
    join cinema on ci_name=ss_ci_num;
select *from ticket_detail01;    

create view ticket_detail02
as
select * from ticketing
	join ticketing_seat on ts_ti_num= ti_num
    join seat on se_num=ts_se_num
    join screen_schedule on ss_num=ti_ss_num
    join movie on mo_num=ss_mo_num
    join cinema on ci_name=ss_ci_num;
    
select *from ticket_detail02;    

-- abc회원이 영화 예매를 사용한 금액은?
select ti_me_id as 아이디, sum(ti_total_price) as '예매 총 금액' from ticket_detail02
	where ti_me_id='abc';