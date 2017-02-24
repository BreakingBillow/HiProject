package cn.hiproject.pm.server;

import org.apache.ibatis.session.SqlSession;

import cn.hiproject.pm.server.mybatis.common.MybatisUtils;
import cn.hiproject.pm.server.mybatis.dao.AccountMapper;

public class MybatisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SqlSession session = MybatisUtils.getSqlSession();

		try {
			//Visitor visitor = (Visitor) session.selectOne("david.mybatis.demo.IVisitorOperation.basicQuery", id);
			
		
			MybatisUtils.closeSession(session);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
