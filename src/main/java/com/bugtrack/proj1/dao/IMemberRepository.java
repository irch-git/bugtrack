package com.bugtrack.proj1.dao;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack.proj1.entities.Member;

public interface IMemberRepository extends CrudRepository<Member, Long> {
	
}
