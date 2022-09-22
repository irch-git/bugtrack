package com.bugtrack.proj1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack.proj1.entities.Member;

public interface IMemberRepository extends CrudRepository<Member, Long> {
	List<Member> findAll();
}
