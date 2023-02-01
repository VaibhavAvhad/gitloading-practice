package com.csi.repo;

import com.csi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//optional
public interface CustomerRepoImpl extends JpaRepository<Customer,Integer> {
}
