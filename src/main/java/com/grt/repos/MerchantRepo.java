package com.grt.repos;

import com.grt.models.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MerchantRepo  extends JpaRepository<Merchant,Integer> {

}
