package cn.hiproject.pm.server;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.hiproject.pm.server.mybatis.common.MybatisUtils;
import cn.hiproject.pm.server.mybatis.dao.AccountMapper;
import cn.hiproject.pm.server.mybatis.model.Account;
import cn.hiproject.pm.server.mybatis.model.AccountExample;

public class MybatisTest {

	static SqlSessionFactory sqlSessionFactory = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		List accountList = new ArrayList<Account>();
		
		try {
			//Visitor visitor = (Visitor) session.selectOne("david.mybatis.demo.IVisitorOperation.basicQuery", id);
			
			AccountMapper accountDao = sqlSession.getMapper(AccountMapper.class);
			
			AccountExample example = new AccountExample();
			accountList = accountDao.selectByExample(example);
		
			System.out.println(accountList);
			
			sqlSession.close();

		} catch (Exception e) {
			// TODO: handle exception
			
		} finally {
			sqlSession.close();
		}

	}

}
