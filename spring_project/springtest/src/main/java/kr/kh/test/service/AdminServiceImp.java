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
}
