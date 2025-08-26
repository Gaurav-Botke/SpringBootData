package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Artist;

import jakarta.transaction.Transactional;

public interface IArtistRepository extends JpaRepository<Artist, Integer> {

	//-----------------Select Query ----------------------------
	//@Query("from Artist")
	//@Query("FROM Artist art")
	//@Query("FROM Artist as art")
	//@Query("from Artist where fee>= 30000")
	//@Query("from Artist where name='SALLU')
	@Query("from Artist where name = 'SALLU' OR name = 'SRK'")
	public List<Artist> getAllArtist(); 
	
	@Query("from Artist where fee>=?1 and fee<=?2")
	public List<Artist> showArtistByFeeRange(double start, double end);
	
	@Query("from Artist where fee>=:min and fee<=:max")
	public List<Artist> fetchArtistBySalRange(@Param("min") double start,
			                                  @Param("max") double end);
	
	@Query("from Artist where fee>=:min and fee<=:max")
	public List<Artist> loadArtistBySalRange(double min,
			                                   double max);
	
	//----------------Select Entity Query ------------------------
	@Query("from Artist where category in(:cate1,:cate2)")            //Entity Query
	public List<Artist> showArtistByCategory(String cate1, String cate2);
	
	@Query("select id, name,fee from Artist where category in(:cate1,:cate2)")    //Scalar or Projection Query for getting specific records of Column of Db
	public List<Object[]> showArtistDataByCategory(String cate1, String cate2); 
	
	@Query("select id, name,fee from Artist where name like :initChar") //scalar query to getting Specific record i.e single column value
	public List<String> showArtistByNameChar(String initChar); 
	
	//-------------------------Entity Query giving Single Record  ----------------------
	
	@Query("from Artist where name=:name")
	public Optional<Artist> showArtistByName(String name);
	
	//---------------------------Scalar query giving a single record having multiple col values
	@Query("select id,category,fee from Artist where name=:name")
	public Object showArtistInfoById(String name);
	
	//---------------------------------Single col value----------------------
	@Query("select fee from Artist where name=:name")
	public String showArtistFee(String name);
	
	//---------------------aggregate opration of JPQL/ HQl count(),min(),max(),avg()
	
	@Query("Select count(distinct name) from Artist")
	public int fetchNoOfCountArtist();
	
	@Query("select count(*),max(fee),min(fee),avg(fee),sum(fee) from Artist")
	public Object showAggregateDataOfArtist();
	
	
	//----------NON select queries by JPQL/HQL
	@Transactional
	@Modifying
	@Query("update Artist set fee = fee+(fee * :per / 100.0) where category=:cate")
	public int updateArtistFee(double per, String cate);
	
	@Transactional
	@Modifying
	@Query("delete from Artist where fee<=:amt")
	public int deleteArtist(double amt);
	
	@Query(value="select SYSDATE from dual",nativeQuery = true)
	public String printDate();
	
	
}
