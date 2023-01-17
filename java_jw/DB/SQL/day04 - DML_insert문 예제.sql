use shoppingmall02;
/**/
insert into member(mem_id, mem_pw, mem_name, mem_birthday, mem_authority)
	values('abc', '123', '홍길동', '2000-01-01', 'MEMBER');
 -- 전체 열명을 나열하지 않아 가능. 단, 생략한 열이 null 허용이거나 기본값이 존재해야 함.
 insert into member(mem_id, mem_pw, mem_name, mem_birthday)
	values('qwe', '123', '고길동', '2001-01-01');
 -- 열 순서를 바꿔도 가능. 단, 열 순서에 맞게 값 순서를 설정해야함.
insert into member(mem_id, mem_name, mem_birthday, mem_pw)
	values('asd', '고길동', '2001-01-01', '123');
 -- 열 전체를 생략해도 가능. 단, 테이블 생성 시 추가했던 열 순으로 값들을 입력해야 함.   
insert into member values('qwe12','qwe213', '홍씨', '2002-01-01','MEMBER'),
('zx123','zxc213', '박씨', '2002-01-01','ADMIN');
    
select*from member;