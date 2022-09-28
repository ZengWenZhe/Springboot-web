package com.zwz.springbootweb.dao;

import com.zwz.springbootweb.domain.Regilster;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReglisterDao {
     Regilster selectReglister(@Param("username") String username, @Param("password") String password);

     List<Regilster> selectTest();

     int insertReglister(@Param("username") String username, @Param("password") String password);

}
