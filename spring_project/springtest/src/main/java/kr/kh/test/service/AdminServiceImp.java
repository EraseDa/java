package kr.kh.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.test.dao.BoardDAO;
import kr.kh.test.vo.BoardTypeVO;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	BoardDAO boardDao;

	@Override
	public ArrayList<BoardTypeVO> getBoardTypeListAll() {
		//변수를 설정해준 이유는 회원과 관리자마다 글 쓸때 보이는 게시판 카테고리 타입이 다르니까 재사용을 위해 
		int adminAuthority = 9; //관리자 권한
		return boardDao.selectBoardTypeList(adminAuthority);
	}

	@Override
	public boolean insertBoardType(BoardTypeVO bt) {
		if(!checkBoardType(bt))
			return false;
		//다오에게 게시판 정보를 주면서 db에 추가하라고 요청한 후, 성공 여부를 가져옴
		int res = boardDao.insertBoardType(bt);
		return res !=0;	
		//retrun boardDao.insertBoardType(bt)!=0;
	}
	

	@Override
	public boolean updateBoardType(BoardTypeVO bt) {
		// 매개변수 체크
		if(!checkBoardType(bt))
			return false;
		if(bt.getBt_num()<1)
			return false;
		// 다오에게 게시판 정보를 주면서 수정하라고 요청한 후 수정여부를 이용하여 리턴함
		return boardDao.updateBoardType(bt);
	}
	//boardTypeVO체크
	private boolean checkBoardType(BoardTypeVO bt) {
		//bt null 체크
				if (bt == null)
					return false;
				//게시판 타입 체크
				if (bt.getBt_type()==null||
						(!bt.getBt_type().equals("일반") && !bt.getBt_type().equals("이미지")))
					return false;
				//게시판 읽기 권한 체크
				if (bt.getBt_r_authority()!=0 && bt.getBt_r_authority()!=1 &&
						bt.getBt_r_authority()!=9 )
					return false;
				//게시판 쓰기 권한 체크
				if (bt.getBt_w_authority()!=1 &&
						bt.getBt_w_authority()!=9)
					return false;
				//게시판명 체크(null체크) trim:첫번째 글자 앞과 마지막 글자 뒤의 공백을 다 지워주는 역할
				if (bt.getBt_name()==null || bt.getBt_name().trim().length()==0)
					return false;
				//게시판명 중복 체크
				//다오에게 게시판 명을 주면서 게시판 정보를 가져오라고 시킴
				BoardTypeVO dbBt = boardDao.selectBoardTypeByName(bt.getBt_name());
				//가져온 게시판 정보가 null이 아니면 false를 리턴
				//가져온 게시판이 있는 경우
				//1. 서로 다른 게시판인데 이름이 중복되는 경우(중복이므로 false)
				//2. 같은 게시판인 경우(자기 자신이므로 true)
				if (dbBt !=null && bt.getBt_num()!=dbBt.getBt_num())
					return false;
				return true;
	}
}
