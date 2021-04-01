package repository.rentmall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.RentBuyListDTO;
import model.RentCartListDTO;
import model.RentDTO;
import model.RentOrderBuyDTO;
import model.RentOrderDTO;
import model.RentOrderListDTO;
import model.RentPayDTO;


public class RentmallRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="HIUS.mappers.rentmallMapper";
	
	public List <RentDTO> rentmall() {
		String statement = namespace + ".rentmallAllselect";
		return sqlSession.selectList(statement);
	}
	public RentDTO getSelectDetail(String no) {
		String statement = namespace +".getSelectDetail";
		return sqlSession.selectOne(statement, no);
	}
	public String rentOrderNo (String memId) {
		String statement = namespace +".getSelecNo";
		return sqlSession.selectOne(statement, memId);
	}
	public String rentCart() {
		String statement = namespace +".getSelecOrderNo";
		return sqlSession.selectOne(statement);
	}
	public Integer sumPrice(String memId) {
		String statement = namespace +".sumPrice";
		return sqlSession.selectOne(statement,memId);
	}
	public void getrent_order(RentOrderListDTO listdto) {
		String statement = namespace +".getrent_order";
		sqlSession.insert(statement, listdto);
	}
	public void rentOrderInsert(RentOrderDTO dto) {
		String statement = namespace +".rentOrderInsert";
		sqlSession.insert(statement, dto);
	}
	public List<RentCartListDTO> rentCartList(String memId) {
		String statement = namespace +".rentCartList";
		return sqlSession.selectList(statement, memId);
	}
	public void updateOrder(RentOrderDTO dto) {
		String statement = namespace +".updateOrder";
		sqlSession.update(statement, dto);
	}
	public List<RentOrderBuyDTO> orderList(String memId) {
		String statement = namespace +".rentOrderBuy";
		return sqlSession.selectList(statement, memId);
	}
	public void rentOrderUpdate (RentOrderDTO dto) {
		String statement = namespace +".rentOrderUpdate";
		sqlSession.update(statement, dto);	
	}
	public void rentPayInsert (RentPayDTO dto) {
		String statement = namespace +".rentPayInsert";
		System.out.println("sjbvsdxvh");
		sqlSession.insert(statement, dto);
	}
	public List<String> getOrderNo(String memId){
		String statement = namespace +".getOrderNo";
		return sqlSession.selectList(statement, memId);
	}
	public RentBuyListDTO rentBuyList(String orderNo) {
		String statement = namespace +".rentBuyList"; 
		return sqlSession.selectOne(statement, orderNo);
	}
	
}
