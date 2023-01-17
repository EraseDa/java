insert into movie(mo_title, mo_contents, mo_age, mo_run, mo_opening_date, mo_state)
	values('올빼미','맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는 궁으로 들어간다', '15세 이상',
		118, '2022-11-23', '현재상영중');
        


insert into movie_person(mp_name,mp_birth,mp_contry)
	values('류준열','1986-09-25','한국'),('유해진','1970-01-04','한국'),
    ('최무성','1968-01-12','한국'), ('조성하','1970-08-08','한국');
    
insert into movie_person(mp_name,mp_birth,mp_contry)
	values('박명훈','1975-05-28','한국'),('김성철','1991-12-31','한국'),
    ('안은진','1991-05-06','한국'), ('조윤서','1993-01-04','한국');    
insert into movie_person(mp_name,mp_birth,mp_contry)
	values ('안태진',null,'한국');  
 
insert into movie_casting(mc_mp_num, mc_mo_num, mc_role)
values(9 , 2, '배우')
,(10 , 2, '배우'),(11 , 2, '배우'),(12 , 2, '배우'),(13 , 2, '배우'),
(14 , 2, '배우'),(15 , 2, '배우'),(16 , 2, '배우');

insert into movie_casting(mc_mp_num, mc_mo_num, mc_role)
values(17,2,'감독');


insert into movie_genre(mg_ge_name, mg_mo_num)
values('스릴러',2);

insert into trailer(tr_title, tr_mo_num, tr_file_name)
values('[올빼미]박스오피스 1위 리뷰 예고편', 2, 'http://h.vod.cgv.co.kr/vodCGVa/86481/86481_210223_1200_128_960_540.mp4');

insert into stillcut(st_mo_num, st_file_name) values(2, 'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000086/86481/86481210357_727.jpg');


insert into screen_schedule(ss_date, ss_time, ss_total_seat, ss_possible_seat,
ss_mo_num, ss_ci_num)
values('2022-12-19','13:50', 124, 52, 2, 2),('2022-12-19','11:00', 124, 107, 2, 6),
('2022-12-19','17:10', 124, 107, 2, 6);

-- abc회원이 올빼미 12월 20일 13:50을 3장 예매 A1,B1,C1
select *from ticketing;
select*from screen_schedule;
insert into ticketing(ti_amount, ti_me_id, ti_ss_num,ti_total_price)
	values (3,'abc',25,30000);

select *from ticketing_seat;
select *from seat;
insert into ticketing_seat(ts_ti_num, ts_se_num)
	values(2,11),(2,13),(2,15);
-- 예매 가능 좌석을 수정
update screen_schedule set ss_possible_seat = ss_possible_seat -3
	where ss_num = 25;
update seat set se_state = '사용불가능'
	where se_num=11;
update seat set se_state = '사용불가능'
	where se_num=13;
update seat set se_state = '사용불가능'
	where se_num=15;    
    
-- abc 회원이 예매한 올빼미 상영좌석을 조회(관이름과 좌석번호 조회)
select se_name as 'abc회원이 예매한 영화 올빼미 좌석'from ticketing
	join screen_schedule on ti_ss_num=ss_num
    join movie on ss_mo_num=mo_num
    join ticketing_seat on ts_ti_num=ti_num
    join seat on ts_se_num=se_num
    where mo_title like '올빼미' and ti_me_id like 'abc';
select *from seat;
select*from cinema;
-- 올빼미 12월 20일 13:50 상영에 예매 가능한 좌석을 조회
select mo_titseatle as 영화제목, se_name as 좌석명, 
	case 
		when ts_num is null
        then 'o'
        else 'x'
        end as 가능여부
    from (select*from screen_schedule where ss_date='2022-12-20' and
	ss_time='13:50:00') as sc
    join (select *from movie where mo_title ='올빼미') as mo on ss_mo_num=mo_num
    join cinema on ss_ci_num=ci_num
    join seat on se_ci_num=ci_num
    left join ticketing on ti_ss_num=ss_num
    left join ticketing_seat on ts_se_num=se_num;
