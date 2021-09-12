package com.probal.multi_tanant.Dao;

import com.probal.multi_tanant.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {
    List<Account>findAll();
}
