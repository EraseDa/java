-- 가격이 20000원 이상이면 비쌈, 가격이 5000원 이하이면 쌈, 아니면 적당이라고 분류
select pd_title, pd_price,
	case
		when pd_price>=20000
		then '비쌈'
        when  pd_price<=5000
        then '쌈'
        else '적당'
	end as '가격 판별'
from product;

select pd_title, pd_price,
	if(pd_price >=20000, '비쌈',
		
        if(pd_price<=5000 ,'쌈',
        '적당')
		) as 가격판별
from product;