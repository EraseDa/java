select *from movie_casting;
select *from movie_person;
select *from movie;
-- 아바타-물의 길에 출연한 감독 및 배우들을 조회하는 쿼리
select mo_title as 영화제목, mp_name as 영화인, mc_role as 역할 from movie_person
	join movie_casting on mc_mp_num=mp_num
    join movie on mo_num=mc_mo_num
    where mo_title like '아바타-물의 길';
    
-- 제임스 카메론의 참여 영화 리스트를 조회하는 쿼리
select mo_contents as 영화제목, mc_role as 역할 from movie
	join movie_casting on mc_mo_num=mo_num
    join movie_person on mc_mp_num=mp_num
    where mp_name like '제임스 카메론';

select *from screen_schedule;
select *from ticketing;

-- 아바타 누적 관객 수를 조회하는 쿼리
select sum(ti_amount) as '아바타 누적 관객 수' from ticketing
join screen_schedule on ti_ss_num=ss_num
join movie on ss_mo_num=mo_num
where now() >=ss_date and mo_title like '아바타-물의 길';

-- 누적 관객 수가 1명 이상인 영화를 조회하는 쿼리
select mo_title as 영화제목, sum(ti_amount) as 누적관객수 from ticketing
join screen_schedule on ti_ss_num=ss_num
join movie on ss_mo_num=mo_num
where now()>=ss_date 
group by mo_num
having 누적관객수>=1 ; -- 집계함수 조건을 걸 땐 having절에 걸어야함 
