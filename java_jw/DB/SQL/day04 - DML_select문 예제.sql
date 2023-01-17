/*
select 속성 | 식 등alter	
	[from 테이블명]
    [where 조건절] -- 조건에 맞는 결과를 조회, ==가 아닌 =을 이용하여 비교(같지않은 경우는 !=똑같음);
    -- 속성명1로 정렬(오름차순|내림차순)한 후, 속성명 1의 값이 같은 행들을 속정 2로 정렬(오름차순|내림차순)
    [order by 속성명 [asc|desc], 속성명[asc|desc]]    
-- 검색 결과의 개수를 제한
-- limit 번지, 개수 : 지정번지부터 개수
-- limit 개수 : 0번지부터 개수 
	[limit절]
*/


use shoppingmall02;
-- member 테이블의 mem_id와 mem_pw를 조회
select mem_id, mem_pw
	from member;
-- member 테이블에 있는 모든 회원 정보를 조회
select*from member;
-- member테이블에 마이디가 abc인 회원 정보를 조회
select*from member where mem_id = 'abc';
-- 관리자의 아이디를 조회
select*from member where mem_authority = 'ADMIN';
select*from member where mem_authority != 'ADMIN';
select*from member where mem_authority <> 'ADMIN';

select*from member order by mem_id; -- 오름차순
select*from member order by mem_id desc; -- 내림차순

-- 회원들을 아이디순으로 오름차순으로 정렬하여 처음2명만 조회
select*from member order by mem_id
	limit 0, 2;
-- 회원들을 아이디순으로 오름차순으로 정렬하여 2번째 2명만 조회
select*from member order by mem_id
	limit 2, 2;
-- 회원들을 아이디순으로 오름차순으로 정렬하여 3번째 2명만 조회   
select*from member order by mem_id
	limit 3, 2;    
-- n번째 x명 조회 : limit(n-1)*x, x
    
-- 게시글에서 조회수가 1이상 100이하인 게시글들을 조회
select * from board where bo_views >=1 and bo_views<=100;
-- A이상 B이하 : between A and B
select * from board where bo_views between 1 and 100;
-- 게시글에서 카테고리 번호가 1번(공지) 또는 2번(자유)인 게시글 전체를 조회
select * from board where bo_bc_num = 1 or bo_bc_num =2;
-- 속성 in(a.b) : 속성이 a또는 b값을 가지는 경우
select * from board where bo_bc_num in(1,2);

/* 문자열 검색
=는 두 문자열이 동일해야 true
like를 이용하여 문자열1이 문장ㄹ 2에 있는지 확인할 수 있다.
...where 속성명 like 문자열;
_ 한 글자를 의미
...where bo_title like ' _ _ _' : 제목이 3글자인 게시들들을 가져옴
% 0글자 이상을 의미
...where bo_title like '공지%' : 제목이 공지로 시작하는 모든 게시글들
...where bo_title like '%공지' : 제목이 공지로 끝나는 모든 게시글들
...where bo_title like '%공지%' : 제목에 공지가 들어가는 모든 게시글들
*/

-- 2022년도에 작성된 게시글들을 조회
select * from board 
	where bo_reg_date like '2022%';
select*from board where bo_reg_date
	between '2022-01-01 00:00:00' and '2022=12-31 23:59:59';
    
-- 카테고리가 공지사항인 게시글들을 조회
select*from board where bo_bc_num = 
	(select bc_num from board_category
		where bc_name = '공지');

-- 가전제품(제품카테고리 1번) 중 가장 비싼 제품보다 가격이 높은 제품들
select * from product	
	where pd_price > all(select pd_price from product where pd_pc_num =1);
-- 가전제품(제품카테고리 1번) 중 가장 싼 제품보다 가격이 높은 제품들
select * from product	
	where pd_price > any(select pd_price from product where pd_pc_num =1); 
-- 가전제품(제품카테고리 1번)과 같은 가격들이 있는 제품들   
select*from product
	where pd_price = any(select pd_price from product where pd_pc_num=1);
select*from product
	where pd_price in(select pd_price from product where pd_pc_num=1);  
    
-- 모든 회원의 권한을 출력(권한만 출력하기 때문에 중복이 가능)
select distinct mem_authority from member; -- distinct를 붙이면 중복된 내용을 제거하고 출력

-- A as B : A의 이름을 B로 수정(일시적) - select문으로 검색 결과를 출력할 때
select distinct mem_authority as '권한' from member;