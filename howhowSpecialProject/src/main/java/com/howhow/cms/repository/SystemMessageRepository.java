package com.howhow.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.howhow.entity.SystemMessage;

public interface SystemMessageRepository extends JpaRepository<SystemMessage, Integer> {

	@Query(value = "from SystemMessage where user_id = ?1")
	List<SystemMessage> findByUserId(int id);
}
